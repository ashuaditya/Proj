package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.PerformaInvoice;


public interface PerformaInvoiceRepository  extends JpaRepository<PerformaInvoice, Integer> 
{
	PerformaInvoice findByPiNumber(String piNumber);
}