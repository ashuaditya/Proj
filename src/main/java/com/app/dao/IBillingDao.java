package com.app.dao;

import org.springframework.stereotype.Component;

import com.app.model.Billing;

@Component
public interface IBillingDao {
public Integer saveBilling(Billing b) ;
}
