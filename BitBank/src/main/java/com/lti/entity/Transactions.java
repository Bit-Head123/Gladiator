package com.lti.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
@SequenceGenerator(name = "transeq", sequenceName = "seq_trans", initialValue = 987654, allocationSize = 1)
public class Transactions {

	@Id
	@GeneratedValue(generator = "transeq", strategy = GenerationType.SEQUENCE)
	@Column(name = "trans_id")
	private int transactionId;
	
	@Column(name = "trans_amount")
	private Double transactionAmount;
	
	@Column(name = "trans_date")
	private Date transactionDate;
	
	@Column(length = 30)
	private String remarks;
	
	@Column(length = 30)
	private String transactionType;
	
	private Double balance;
	
	@ManyToOne
	@JoinColumn(name = "acc_number")
	private Account acc;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "transactions",
				joinColumns = @JoinColumn(name ="benf_id"),
				inverseJoinColumns = {@JoinColumn(name="trans_id")})
	private Set<Beneficiaries> beneficiaries = new HashSet<Beneficiaries>();

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public Set<Beneficiaries> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(Set<Beneficiaries> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}
	
	
	

}
