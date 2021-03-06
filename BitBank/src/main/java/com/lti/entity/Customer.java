package com.lti.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "customers")
@SequenceGenerator(name = "custseq", sequenceName = "seq_cust", initialValue = 15050, allocationSize = 1)
public class Customer implements Serializable {

	@Id
	@GeneratedValue(generator = "custseq", strategy = GenerationType.SEQUENCE)
	private int custId;
	
	@Column(name = "user_name", length = 25)
	private String userName;
	
	@Column(name = "password", length = 30)
	private String password;
	
	@OneToOne(mappedBy = "cust")
	private SavingsAccount sAcc;
	 
	@OneToOne(mappedBy ="cust", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER )
	private CustomerDetails custDetails;
	
	@OneToOne(mappedBy = "cust", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	private CustomerAddress custAddress;
 
	 @LazyCollection(LazyCollectionOption.FALSE)
	 @OneToMany(mappedBy = "cust",cascade = {CascadeType.ALL})
	 private List<Beneficiaries> beneficiaries = new ArrayList<Beneficiaries>();
	
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CustomerDetails getCustDetails() {
		return custDetails;
	}

	public void setCustDetails(CustomerDetails custDetails) {
		this.custDetails = custDetails;
	}

	public CustomerAddress getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(CustomerAddress custAddress) {
		this.custAddress = custAddress;
	}
	
	public SavingsAccount getsAcc() {
		return sAcc;
	}

	public void setsAcc(SavingsAccount sAcc) {
		this.sAcc = sAcc;
	}

	public List<Beneficiaries> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(List<Beneficiaries> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", userName=" + userName + ", password=" + password + ", sAcc=" + sAcc
				+ ", custDetails=" + custDetails + ", custAddress=" + custAddress + ", beneficiaries=" + beneficiaries
				+ "]";
	}
	
	
}
