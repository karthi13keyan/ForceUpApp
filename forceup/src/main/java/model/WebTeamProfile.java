package model;

import java.util.Date;
import java.util.HashMap;
public class WebTeamProfile {

	Employee objEmployee = new Employee();
	LeadProspects objLeadProspects = new LeadProspects();
	HashMap<Date,String> empActivity = new HashMap<Date,String>();
	
	
	public HashMap<Date, String> getEmpActivity() {
		return empActivity;
	}
	public void setEmpActivity(HashMap<Date, String> empActivity) {
		this.empActivity = empActivity;
	}
	public Employee getObjEmployee() {
		return objEmployee;
	}
	public void setObjEmployee(Employee objEmployee) {
		this.objEmployee = objEmployee;
	}
	public LeadProspects getObjLeadProspects() {
		return objLeadProspects;
	}
	public void setObjLeadProspects(LeadProspects objLeadProspects) {
		this.objLeadProspects = objLeadProspects;
	}
	
	
}
