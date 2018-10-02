package com.app.forceup.model;

import javax.xml.datatype.XMLGregorianCalendar;

public class SaleDetails {

	Long empId;
	String leadName;
	String leadMailId;
	String empCompanyName;	
	String leadAddress;
	String leadCity;
	String leadState;
	Long leadPostalCode;
	Long leadPhoneNumber;
	char leadStatus;
	XMLGregorianCalendar leadClosureDate;
	XMLGregorianCalendar leadStartTime;
	XMLGregorianCalendar leadEndTime;
	XMLGregorianCalendar lastUpdatedTimestamp;
	Long dealAmount;
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public String getLeadMailId() {
		return leadMailId;
	}
	public void setLeadMailId(String leadMailId) {
		this.leadMailId = leadMailId;
	}
	public String getEmpCompanyName() {
		return empCompanyName;
	}
	public void setEmpCompanyName(String empCompanyName) {
		this.empCompanyName = empCompanyName;
	}
	public String getLeadAddress() {
		return leadAddress;
	}
	public void setLeadAddress(String leadAddress) {
		this.leadAddress = leadAddress;
	}
	public String getLeadCity() {
		return leadCity;
	}
	public void setLeadCity(String leadCity) {
		this.leadCity = leadCity;
	}
	public String getLeadState() {
		return leadState;
	}
	public void setLeadState(String leadState) {
		this.leadState = leadState;
	}
	public Long getLeadPostalCode() {
		return leadPostalCode;
	}
	public void setLeadPostalCode(Long leadPostalCode) {
		this.leadPostalCode = leadPostalCode;
	}
	public Long getLeadPhoneNumber() {
		return leadPhoneNumber;
	}
	public void setLeadPhoneNumber(Long leadPhoneNumber) {
		this.leadPhoneNumber = leadPhoneNumber;
	}
	public char getLeadStatus() {
		return leadStatus;
	}
	public void setLeadStatus(char leadStatus) {
		this.leadStatus = leadStatus;
	}
	public XMLGregorianCalendar getLeadClosureDate() {
		return leadClosureDate;
	}
	public void setLeadClosureDate(XMLGregorianCalendar leadClosureDate) {
		this.leadClosureDate = leadClosureDate;
	}
	public XMLGregorianCalendar getLeadStartTime() {
		return leadStartTime;
	}
	public void setLeadStartTime(XMLGregorianCalendar leadStartTime) {
		this.leadStartTime = leadStartTime;
	}
	public XMLGregorianCalendar getLeadEndTime() {
		return leadEndTime;
	}
	public void setLeadEndTime(XMLGregorianCalendar leadEndTime) {
		this.leadEndTime = leadEndTime;
	}
	public XMLGregorianCalendar getLastUpdatedTimestamp() {
		return lastUpdatedTimestamp;
	}
	public void setLastUpdatedTimestamp(XMLGregorianCalendar lastUpdatedTimestamp) {
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
	}
	public Long getDealAmount() {
		return dealAmount;
	}
	public void setDealAmount(Long dealAmount) {
		this.dealAmount = dealAmount;
	}
	
	

}
