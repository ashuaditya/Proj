package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Billing;


public interface BillingRepository  extends JpaRepository<Billing, Integer> 
{
	//Billing findByBillNumber(String billNumber);
}