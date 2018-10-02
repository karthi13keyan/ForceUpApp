package com.app.forceup.model;

public class MobileResponse {
	
	Status objstatus;
	EmployeeDetails employeeDetails;
	
	
	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}
	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}
	
	public Status getObjstatus() {
		return objstatus;
	}
	public void setObjstatus(Status objstatus) {
		this.objstatus = objstatus;
	}

}
