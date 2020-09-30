/**
 * 
 * @author Arnab. @version 1.0.0
 * 
 * This is an entity for beneficiary details in an account.
 * 
 * It is having ManyToOne relationship with Customer and
 * 
 * OneToOne relationship with AccountTransaction
 * 
 * 
 * 
 * Update:
 * 
 *  @author Avnv version 1.0.1
 *
 *	Relationships are mapped and accountNumber column name is assigned
 */




package com.lti.entity;

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

@Entity
@Table(name = "beneficiaries")
@SequenceGenerator(name = "benefseq", sequenceName = "seq_benef", initialValue = 1, allocationSize = 1)
public class Beneficiary {

	@Id
	@GeneratedValue(generator = "benefseq", strategy = GenerationType.SEQUENCE)
	@Column(name = "benef_id")
	private int beneficiaryId;

	@Column(name = "first_name", length = 30)
	private String firstName;

	@Column(name = "last_name",length = 30)
	private String lastName;

	@Column(name = "acc_no")
	private long  accountNumber;

	@ManyToOne
	@JoinColumn(name = "cust_id")
	private Customer cust;

	@OneToOne(mappedBy = "benef")
	private AccountTransaction accTransaction;
	
	public int getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(int beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	


}











