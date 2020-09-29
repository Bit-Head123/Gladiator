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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @author Avnv
 * 
 * This is an entity for account transactions.
 * 
 * It is having ManyToOne relationship with Customer and
 * 
 * OneToOne relationship with Beneficiary
 * 
 *
 */

@Entity
@Table(name = "acc_transactions")
@SequenceGenerator(name = "txnseq", sequenceName = "seq_txn", initialValue = 987654, allocationSize = 1)
public class AccountTransaction {

	@Id
	@GeneratedValue(generator = "txnseq", strategy = GenerationType.SEQUENCE)
	@Column(name = "txn_id")
	private int transactionId;

	@Column(name = "txn_date")
	private Date transactionDate;

	@Column(length = 30)
	private String remarks;

	@Column(name = "credit_amount")
	private double creditAmount;

	@Column(name = "debit_amount")
	private double debitAmount;

	@Column(name = "transfer_mode")
	private String transferMode;
	
	private double amount;
	
	@ManyToOne
	@JoinColumn(name = "acc_number")
	private Customer cust;

	@OneToOne(cascade = CascadeType.ALL)
	private Beneficiary benef ;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
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

	public double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}

	public double getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}

	public String getTransferMode() {
		return transferMode;
	}

	public void setTransferMode(String transferMode) {
		this.transferMode = transferMode;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public Beneficiary getBenef() {
		return benef;
	}

	public void setBenef(Beneficiary benef) {
		this.benef = benef;
	}

	

}