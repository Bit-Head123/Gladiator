package com.lti.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer_details")
public class CustomerDetails {

	@Id
	private int aadharNumber;
	
	@Column(name = "first_name", length = 30)
	private String firstName;
	
	@Column(name = "last_name",length = 30)
	private String lastName;
	
	@Column(name = "father_name",length = 30)
	private String fatherName;
	
	private int mobileNumber;
	
	@Column(length = 40)
	private String emailId;
	
	private Date dateOfBirth;
	
	@OneToOne
	@JoinColumn(name = "cust_id")
	private Customer cust;
	
	@OneToOne(mappedBy = "custDetails", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	private CustomerAddress custAddress;

	public int getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
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

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public CustomerAddress getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(CustomerAddress custAddress) {
		this.custAddress = custAddress;
	}
	
	
}