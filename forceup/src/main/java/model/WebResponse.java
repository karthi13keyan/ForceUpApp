package model;

import java.util.ArrayList;

public class WebResponse {


	
	Status objstatus;
	
	ArrayList<Employee> employeesDetails;

	public Status getObjstatus() {
		return objstatus;
	}
	public void setObjstatus(Status objstatus) {
		this.objstatus = objstatus;
	}
	public ArrayList<Employee> getEmployeesDetails() {
		return employeesDetails;
	}
	public void setEmployeesDetails(ArrayList<Employee> employeesDetails) {
		this.employeesDetails = employeesDetails;
	}
	
	
	

}
