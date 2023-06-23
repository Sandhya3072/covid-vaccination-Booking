package com.rcss.model;

public class VaccineDetails {
	private int vaccineNo;
	private String vaccineName;
	private String batchNo;
	private String vaccineReceive;
	private String vaccineCountry;
	private String vaccineExpire;
	private int quantity;
	
	public VaccineDetails() {
		super();
	}
	public VaccineDetails(int vaccineNo, String vaccineName, String batchNo, String vaccineReceive, String vaccineCountry,
			String vaccineExpire, int quantity) {
		super();
		this.vaccineNo = vaccineNo;
		this.vaccineName = vaccineName;
		this.batchNo = batchNo;
		this.vaccineReceive = vaccineReceive;
		this.vaccineCountry = vaccineCountry;
		this.vaccineExpire = vaccineExpire;
		this.quantity = quantity;
	}
	public int getVaccineNo() {
		return vaccineNo;
	}
	public String getVaccineName() {
		return vaccineName;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public String getVaccineReceive() {
		return vaccineReceive;
	}
	public String getVaccineCountry() {
		return vaccineCountry;
	}
	public String getVaccineExpire() {
		return vaccineExpire;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setVaccineNo(int vaccineNo) {
		this.vaccineNo = vaccineNo;
	}
	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public void setVaccineReceive(String vaccineReceive) {
		this.vaccineReceive = vaccineReceive;
	}
	public void setVaccineCountry(String vaccineCountry) {
		this.vaccineCountry = vaccineCountry;
	}
	public void setVaccineExpire(String vaccineExpire) {
		this.vaccineExpire = vaccineExpire;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
