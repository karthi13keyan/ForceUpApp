package model;

import java.util.ArrayList;

public class Data {

	Uservalidator userv;

	ArrayList<Leaddetails> leadDetails;
	
	Employee employeeDetails;
	
	ArrayList<SaleDetails> saleDetails;
	
	public ArrayList<Leaddetails> getLeadDetails() {
		return leadDetails;
	}

	public void setLeadDetails(ArrayList<Leaddetails> leadDetails) {
		this.leadDetails = leadDetails;
	}

	public Uservalidator getUserv() {
		return userv;
	}

	public void setUserv(Uservalidator userv) {
		this.userv = userv;
	}
}
