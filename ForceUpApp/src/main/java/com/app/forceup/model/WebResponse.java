package com.app.forceup.model;

import java.util.ArrayList;

public class WebResponse {


	
	Status objstatus;
	
	ArrayList<EmployeeDetails> employeesDetails;

	public Status getObjstatus() {
		return objstatus;
	}
	public void setObjstatus(Status objstatus) {
		this.objstatus = objstatus;
	}
	public ArrayList<EmployeeDetails> getEmployeesDetails() {
		return employeesDetails;
	}
	public void setEmployeesDetails(ArrayList<EmployeeDetails> employeesDetails) {
		this.employeesDetails = employeesDetails;
	}
	
	
	

}
