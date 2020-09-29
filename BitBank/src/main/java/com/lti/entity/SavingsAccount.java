package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "savings_account")
public class SavingsAccount extends Account {

	@Column(name = "acc_type", length = 30)
	private String accountType;

	@OneToOne
	@JoinColumn(name = "cust_id")
	Customer cust;

	@OneToMany(mappedBy = "sAcc",cascade = {CascadeType.ALL})
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Transactions> transactions = new ArrayList<Transactions>();

	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public List<Transactions> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}

}