package com.app.forceup.model;

import java.util.Date;
import java.util.HashMap;
public class WebTeamProfile {

	EmployeeDetails objEmployee = new EmployeeDetails();
	LeadProspects objLeadProspects = new LeadProspects();
	HashMap<Date,String> empActivity = new HashMap<Date,String>();
	
	
	public HashMap<Date, String> getEmpActivity() {
		return empActivity;
	}
	public void setEmpActivity(HashMap<Date, String> empActivity) {
		this.empActivity = empActivity;
	}
	public EmployeeDetails getObjEmployee() {
		return objEmployee;
	}
	public void setObjEmployee(EmployeeDetails objEmployee) {
		this.objEmployee = objEmployee;
	}
	public LeadProspects getObjLeadProspects() {
		return objLeadProspects;
	}
	public void setObjLeadProspects(LeadProspects objLeadProspects) {
		this.objLeadProspects = objLeadProspects;
	}
	
	
}
