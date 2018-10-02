package com.app.forceup.model;

import java.util.List;

public class MobileResponse {
	
	Status userValidationStatus;
	List<EmpSaleDetails> empSaleDetails;
	
	public Status getUserValidationStatus() {
		return userValidationStatus;
	}
	public void setUserValidationStatus(Status userValidationStatus) {
		this.userValidationStatus = userValidationStatus;
	}
	public List<EmpSaleDetails> getEmpSaleDetails() {
		return empSaleDetails;
	}
	public void setEmpSaleDetails(List<EmpSaleDetails> empSaleDetails) {
		this.empSaleDetails = empSaleDetails;
	}
	
	
	
}
