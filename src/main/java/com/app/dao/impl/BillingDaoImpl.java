package com.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Billing;
import com.app.repo.BillingRepository;
import com.app.service.IBillingService;

@Repository
public class BillingDaoImpl implements IBillingService{

	@Autowired
	private BillingRepository repo;
	
	@Transactional
	public Integer saveBilling(Billing b) {
		b = repo.save(b);
		return b.getbId();
	}

}
