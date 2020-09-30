package com.lti.repo;

import java.util.List;

import com.lti.entity.CustomerDetail;

public interface CustomerDetailRepo {

	void saveCustomerDetail(CustomerDetail customerDetail);

	CustomerDetail fetch(long aadharNo);
	
	List<CustomerDetail> fetchAll();
}
