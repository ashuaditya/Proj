package com.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IPerformaInvoiceDao;
import com.app.model.PerformaInvoice;
import com.app.repo.PerformaInvoiceRepository;

@Repository
public class PerformaInvoiceDaoImpl implements IPerformaInvoiceDao{

	@Autowired
	private PerformaInvoiceRepository repo;
	
	@Transactional
	public Integer savePerformaInvoice(PerformaInvoice p) {
		p = repo.save(p);
		return p.getpId();
	}

}
