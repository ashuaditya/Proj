package com.app.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name="pi_details")
@Data
public class PerformaInvoice {


	@Id
	@GeneratedValue(generator = "pId")
	@GenericGenerator(name="pId", strategy = "increment")

	private int pId;
	private String piNumber;
	
	//@Temporal(TemporalType.DATE)
	//private Date piDate;
	private String piDate;
	private Double piAmount;
	private String fileName; 
	@Lob
	private byte[] pdf;
	
	
	public PerformaInvoice() {
		super();
	}


	public PerformaInvoice(String piNumber, String piDate, Double piAmount, String fileName, byte[] pdf) {
		super();
		this.piNumber = piNumber;
		this.piDate = piDate;
		this.piAmount = piAmount;
		this.fileName = fileName;
		this.pdf = pdf;
	}


	public PerformaInvoice(int pId, String piNumber, String piDate, Double piAmount, String fileName, byte[] pdf) {
		super();
		this.pId = pId;
		this.piNumber = piNumber;
		this.piDate = piDate;
		this.piAmount = piAmount;
		this.fileName = fileName;
		this.pdf = pdf;
	}


	public int getpId() {
		return pId;
	}


	public void setpId(int pId) {
		this.pId = pId;
	}


	public String getPiNumber() {
		return piNumber;
	}


	public void setPiNumber(String piNumber) {
		this.piNumber = piNumber;
	}


	public String getPiDate() {
		return piDate;
	}


	public void setPiDate(String piDate) {
		this.piDate = piDate;
	}


	public Double getPiAmount() {
		return piAmount;
	}


	public void setPiAmount(Double piAmount) {
		this.piAmount = piAmount;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public byte[] getPdf() {
		return pdf;
	}


	public void setPdf(byte[] pdf) {
		this.pdf = pdf;
	}


	@Override
	public String toString() {
		return "PerformaInvoice [pId=" + pId + ", piNumber=" + piNumber + ", piDate=" + piDate + ", piAmount="
				+ piAmount + ", fileName=" + fileName + ", pdf=" + Arrays.toString(pdf) + "]";
	}
	
	
	
	
}
