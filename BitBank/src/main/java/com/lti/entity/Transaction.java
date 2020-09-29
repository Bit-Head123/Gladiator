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
public class Transaction {

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
	private SavingsAccount sAcc;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "all_transactions",
				joinColumns = @JoinColumn(name ="trans_id"),
				inverseJoinColumns = {@JoinColumn(name="benef_id")})
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

	public SavingsAccount getsAcc() {
		return sAcc;
	}

	public void setsAcc(SavingsAccount sAcc) {
		this.sAcc = sAcc;
	}

	public Set<Beneficiaries> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(Set<Beneficiaries> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

}