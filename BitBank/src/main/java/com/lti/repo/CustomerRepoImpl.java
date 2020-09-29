package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.lti.entity.Customer;

@Repository
public class CustomerRepoImpl implements CustomerRepo {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public void save(Customer cust) {
		em.persist(cust);

	}

	public List<Customer> list() {
		return em.createQuery("from Customer").getResultList();
	}

}
