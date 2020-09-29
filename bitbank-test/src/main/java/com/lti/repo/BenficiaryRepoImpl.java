package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.lti.entity.Beneficiary;

public class BenficiaryRepoImpl implements BeneficiaryRepo {
	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Beneficiary benficiary) {
		em.persist(benficiary);
		
	}

	@Override
	public Beneficiary fetchBeneficiary(int beneficiaryId) {
		Beneficiary b1=em.find(Beneficiary.class,beneficiaryId);
		return b1;
	}

	@Override
	public List<Beneficiary> fetchAllBeneficiaries() {
	return 	em.createQuery("from AccountTransaction").getResultList();
		
	}
   
}
