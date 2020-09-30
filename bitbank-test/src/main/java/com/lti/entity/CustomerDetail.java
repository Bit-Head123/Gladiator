package com.lti.entity;
import javax.persistence.*;

@Entity
@Table(name="customer_detail")
public class CustomerDetail {
	
	@Id
	@Column(length=12)
	private long aadharNo;
	
	@Column(length=10)
	private String pan;
	
	@Column(length=20)
	private String middleName;
	
	@Column(length=30)
    private String email;
	
	@Column(length=10)
	private String mobile;
	
	@Column
	private int age; 
	
	@Column(length=30)
	private String street;
	
	@Column(length=20)
	private String city;
	
	@Column(length=20)
	private String state;
	
	@Column(length=6)
	private int pincode;
	
	@OneToOne
	@JoinColumn(name = "acc_no")
	private Customer cust;
	
	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	
	
}
