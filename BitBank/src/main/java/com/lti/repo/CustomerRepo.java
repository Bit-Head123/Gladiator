package com.lti.repo;

import java.util.List;
import com.lti.entity.Customer;

public interface CustomerRepo {

	void save(Customer cust);
	
	List<Customer> list();
}
