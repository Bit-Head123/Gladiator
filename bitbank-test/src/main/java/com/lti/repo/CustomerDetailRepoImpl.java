package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.CustomerDetail;


@Repository
public class CustomerDetailRepoImpl implements CustomerDetailRepo {
	
	@PersistenceContext  
	private EntityManager em;

	@Transactional
	public void saveCustomerDetail(CustomerDetail customerDetail) { 
		em.persist(customerDetail);
	}

	public List<CustomerDetail> fetchAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from CustomerDetail").getResultList();
	}

	public CustomerDetail fetch(long aadharNo) {
		// TODO Auto-generated method stub
		return em.find(CustomerDetail.class, aadharNo);
	}

  
}
