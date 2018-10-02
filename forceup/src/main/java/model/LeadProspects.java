package model;

import java.util.Date;

public class LeadProspects {

	String leadName;
	long leadPhoneNumber;
	String emailId;
	String leadStatus; 
	Date creationDate;
	String leadAddress;
	long dealAmount;
	
	
	public LeadProspects() {
	}
	
	public LeadProspects(String leadName, long leadPhoneNumber, String emailId, String leadStatus, Date creationDate,
			String leadAddress, long dealAmount) {
		this.leadName = leadName;
		this.leadPhoneNumber = leadPhoneNumber;
		this.emailId = emailId;
		this.leadStatus = leadStatus;
		this.creationDate = creationDate;
		this.leadAddress = leadAddress;
		this.dealAmount = dealAmount;
	}
	
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public long getLeadPhoneNumber() {
		return leadPhoneNumber;
	}
	public void setLeadPhoneNumber(long leadPhoneNumber) {
		this.leadPhoneNumber = leadPhoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getLeadStatus() {
		return leadStatus;
	}
	public void setLeadStatus(String leadStatus) {
		this.leadStatus = leadStatus;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getLeadAddress() {
		return leadAddress;
	}
	public void setLeadAddress(String leadAddress) {
		this.leadAddress = leadAddress;
	}
	public long getDealAmount() {
		return dealAmount;
	}
	public void setDealAmount(long dealAmount) {
		this.dealAmount = dealAmount;
	}
	
	
	
	
}
