package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.impl.BillingDaoImpl;
import com.app.model.Billing;
import com.app.service.IBillingService;

@Service
public class BillingServiceImpl implements IBillingService{

	@Autowired
	private BillingDaoImpl dao;
	public Integer saveBilling(Billing b) {
	return dao.saveBilling(b);
	}

}
