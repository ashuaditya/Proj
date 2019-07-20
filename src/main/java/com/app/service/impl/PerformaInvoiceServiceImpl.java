package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.impl.PerformaInvoiceDaoImpl;
import com.app.model.PerformaInvoice;
import com.app.service.IPerformaInvoiceService;

@Service
public class PerformaInvoiceServiceImpl implements IPerformaInvoiceService{

	@Autowired
	private PerformaInvoiceDaoImpl dao;
	
	public Integer savePerformaInvoice(PerformaInvoice p) {
		
		return dao.savePerformaInvoice(p);
		
	}

}
