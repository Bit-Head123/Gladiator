package com.lti.service;

import java.util.List;

import com.lti.entity.Customer;

public interface CustomerService {

	void persist(Customer cust);
	
	List<Customer> load();
}
