package com.app.forceup.model;

import java.util.ArrayList;

public class EmpSaleDetails {

	String empName;
	Long empId;
	Long empAchieved;
	Long closedDeals;
	Long failedDeals;
	Long succDeals;
	Long pipeLine;
	ArrayList<SaleDetails> saleDetails;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public Long getEmpAchieved() {
		return empAchieved;
	}
	public void setEmpAchieved(Long empAchieved) {
		this.empAchieved = empAchieved;
	}
	public Long getClosedDeals() {
		return closedDeals;
	}
	public void setClosedDeals(Long closedDeals) {
		this.closedDeals = closedDeals;
	}
	public Long getFailedDeals() {
		return failedDeals;
	}
	public void setFailedDeals(Long failedDeals) {
		this.failedDeals = failedDeals;
	}
	public Long getSuccDeals() {
		return succDeals;
	}
	public void setSuccDeals(Long succDeals) {
		this.succDeals = succDeals;
	}
	public Long getPipeLine() {
		return pipeLine;
	}
	public void setPipeLine(Long pipeLine) {
		this.pipeLine = pipeLine;
	}
	public ArrayList<SaleDetails> getSaleDetails() {
		return saleDetails;
	}
	public void setSaleDetails(ArrayList<SaleDetails> saleDetails) {
		this.saleDetails = saleDetails;
	}
	
	
	

}
