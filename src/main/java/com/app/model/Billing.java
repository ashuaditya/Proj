package com.app.model;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name="billing_details")
@Data
public class Billing{


	@Id
	@GeneratedValue(generator = "bId")
	@GenericGenerator(name="bId", strategy = "increment")
	private Integer bId;
	private String billNumber;
	//@Temporal(TemporalType.DATE)
	//private Date billDate;
	private String billDate;
	private Double billAmount;
	private String file; 
	private byte[] pdf;

	public Billing() {
		super();
	}

	public Billing(String billNumber, String billDate, Double billAmount, String file, byte[] pdf) {
		super();
		this.billNumber = billNumber;
		this.billDate = billDate;
		this.billAmount = billAmount;
		this.file = file;
		this.pdf = pdf;
	}

	public Billing(Integer bId, String billNumber, String billDate, Double billAmount, String file, byte[] pdf) {
		super();
		this.bId = bId;
		this.billNumber = billNumber;
		this.billDate = billDate;
		this.billAmount = billAmount;
		this.file = file;
		this.pdf = pdf;
	}

	@Override
	public String toString() {
		return "Billing [bId=" + bId + ", billNumber=" + billNumber + ", billDate=" + billDate + ", billAmount="
				+ billAmount + ", file=" + file + ", pdf=" + Arrays.toString(pdf) + "]";
	}

	public Integer getbId() {
		return bId;
	}

	public void setbId(Integer bId) {
		this.bId = bId;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public String getBillDate() {
		return billDate;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public Double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public byte[] getPdf() {
		return pdf;
	}

	public void setPdf(byte[] pdf) {
		this.pdf = pdf;
	}
	
}
