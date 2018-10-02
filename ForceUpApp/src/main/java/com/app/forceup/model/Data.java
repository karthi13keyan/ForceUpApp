package com.app.forceup.model;

import java.util.ArrayList;

public class Data {

	Uservalidator userv;

	ArrayList<LeadDetails> leadDetails;
	
	EmployeeDetails employeeDetails;
	
	ArrayList<SaleDetails> saleDetails;
	
	public ArrayList<LeadDetails> getLeadDetails() {
		return leadDetails;
	}

	public void setLeadDetails(ArrayList<LeadDetails> leadDetails) {
		this.leadDetails = leadDetails;
	}

	public Uservalidator getUserv() {
		return userv;
	}

	public void setUserv(Uservalidator userv) {
		this.userv = userv;
	}
}
