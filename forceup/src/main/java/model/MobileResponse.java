package model;

public class MobileResponse {
	
	Status objstatus;
	Employee employeeDetails;
	
	
	public Employee getEmployeeDetails() {
		return employeeDetails;
	}
	public void setEmployeeDetails(Employee employeeDetails) {
		this.employeeDetails = employeeDetails;
	}
	
	public Status getObjstatus() {
		return objstatus;
	}
	public void setObjstatus(Status objstatus) {
		this.objstatus = objstatus;
	}

}
