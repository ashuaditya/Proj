package com.app.dao;

import org.springframework.stereotype.Component;

import com.app.model.PerformaInvoice;

@Component
public interface IPerformaInvoiceDao {
	public Integer savePerformaInvoice(PerformaInvoice p);
}
