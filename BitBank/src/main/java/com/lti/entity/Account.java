package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
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

	


}