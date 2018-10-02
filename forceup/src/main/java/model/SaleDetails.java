package model;

import java.util.ArrayList;

public class SaleDetails {

	long empAchieved;
	long closedDeals;
	long failedDeals;
	long succDeals;
	long pipeLine;
	ArrayList<Leaddetails> leadDetails;
	
	
	
	public long getPipeLine() {
		return pipeLine;
	}
	public void setPipeLine(long pipeLine) {
		this.pipeLine = pipeLine;
	}
	public long getEmpAchieved() {
		return empAchieved;
	}
	public void setEmpAchieved(long empAchieved) {
		this.empAchieved = empAchieved;
	}
	public ArrayList<Leaddetails> getLeadDetails() {
		return leadDetails;
	}
	public void setLeadDetails(ArrayList<Leaddetails> leadDetails) {
		this.leadDetails = leadDetails;
	}
	public long getClosedDeals() {
		return closedDeals;
	}
	public void setClosedDeals(long closedDeals) {
		this.closedDeals = closedDeals;
	}
	public long getFailedDeals() {
		return failedDeals;
	}
	public void setFailedDeals(long failedDeals) {
		this.failedDeals = failedDeals;
	}
	public long getSuccDeals() {
		return succDeals;
	}
	public void setSuccDeals(long succDeals) {
		this.succDeals = succDeals;
	}

	

}
