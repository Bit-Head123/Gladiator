package com.lti.repo;

import java.util.List;

import com.lti.entity.AccountTransaction;
/**
 * 
 * @author Avnv
 *
 */

public interface AccountTransactionRepo {

	void save(AccountTransaction accTransaction);
	
	AccountTransaction fetchTransaction(int accTransactionId);
	
	List<AccountTransaction> fetchAllTransactions();
}
