package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Customer;
import com.lti.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo repo;
	
	@Transactional(value = TxType.REQUIRED)
	public void persist(Customer cust) {
		repo.save(cust);
	}

	public List<Customer> load() {
		return repo.list();
	}

}
