package com.lti.repo;
/**
 * 
 * @author Mitshu
 * 
 * This is an repo for Customer.
 * 
 * version 1.0
 * 
 *
 */
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.lti.entity.Customer;

public class CustomerRepoImpl implements CustomerRepo {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public void save(Customer cust) {
		em.persist(cust);

	}

	@Override
	public Customer fetchCustomers(int accountNumber) {
		Customer c1=em.find(Customer.class, accountNumber) ;
		return c1;
	}


	@Override
	public List<Customer> fetchAllCustomers() {
		return 	em.createQuery("from Customer").getResultList();
		
	}
} 








