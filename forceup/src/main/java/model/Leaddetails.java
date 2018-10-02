package model;

import java.util.Date;

public class Leaddetails {

	public Leaddetails() {

	}

	public Leaddetails(String leadName, long leadPhoneNumber, String leadAddress, long dealAmount, Date startTime,
			Date endTime, String leadStatus, Date closeDate) {
		this.leadName = leadName;
		this.leadPhoneNumber = leadPhoneNumber;
		this.leadAddress = leadAddress;
		this.dealAmount = dealAmount;
		this.startTime = startTime;
		this.endTime = endTime;
		this.leadStatus = leadStatus;
		this.closeDate = closeDate;
	}

	String leadName;
	long leadPhoneNumber;
	String leadAddress;
	long dealAmount;
	Date startTime;
	Date endTime;
	String leadStatus;
	Date closeDate;

	public String getLeadStatus() {
		return leadStatus;
	}

	public void setLeadStatus(String leadStatus) {
		this.leadStatus = leadStatus;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
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

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
}
