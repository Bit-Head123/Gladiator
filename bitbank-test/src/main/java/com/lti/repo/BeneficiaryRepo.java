package com.lti.repo;

import java.util.List;


import com.lti.entity.Beneficiary;

public interface BeneficiaryRepo {
	void save(Beneficiary benficiary);
	Beneficiary fetchBeneficiary(int beneficiaryId);
	List<Beneficiary> fetchAllBeneficiaries();
}
