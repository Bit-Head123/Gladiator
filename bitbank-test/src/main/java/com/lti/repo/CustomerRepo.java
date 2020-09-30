package com.lti.repo;
/**
 * 
 * @author Mitshu
 * 
 * This is an repoimpl for Customer.
 * 
 * version 1.0
 * 
 *
 */
import java.util.List;

import com.lti.entity.Customer;

public interface CustomerRepo {

	void save(Customer customers);

	Customer fetchCustomers(int accountNumber);

	List<Customer> fetchAllCustomers();
}
