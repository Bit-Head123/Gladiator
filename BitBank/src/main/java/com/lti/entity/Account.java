package com.lti.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@MappedSuperclass
@SequenceGenerator(name = "accseq", sequenceName = "seq_acc", initialValue = 123456, allocationSize = 1)
public abstract class Account {

	@Id
	@GeneratedValue(generator = "accseq",strategy = GenerationType.SEQUENCE)
	@Column(name = "acc_number")
	private int accountNumber;
	
	@Column(length = 30)
	private String branch;
	
	@Column(name = "acc_balance")
	private double accountBalance;
	
	@OneToOne
	@JoinColumn(name = "cust_id")
	Customer cust;
	
	@OneToMany(mappedBy = "acc",cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	private List<Transactions> transactions = new ArrayList<Transactions>();

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
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
