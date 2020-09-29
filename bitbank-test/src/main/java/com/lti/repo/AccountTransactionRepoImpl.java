package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.lti.entity.AccountTransaction;
/**
 * 
 * @author Avnv
 *
 */
@Repository
public class AccountTransactionRepoImpl implements AccountTransactionRepo {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public void save(AccountTransaction accTransaction) {
		em.persist(accTransaction);

	}

	@Override
	public AccountTransaction fetchTransaction(int accTransactionId) {
		return em.find(AccountTransaction.class, accTransactionId);
	}

	@Override
	public List<AccountTransaction> fetchAllTransactions() {
		return em.createQuery("from AccountTransaction").getResultList();
	}

}
