package com.app.forceup.model;

import java.util.HashMap;

public class TeamResultDeals {

	HashMap<String,HashMap<String,Long>> salesLost = new HashMap<>();
	
	HashMap<String,HashMap<String,Long>> leadConversion = new HashMap<>();

	public HashMap<String, HashMap<String, Long>> getSalesLost() {
		return salesLost;
	}

	public void setSalesLost(HashMap<String, HashMap<String, Long>> salesLost) {
		this.salesLost = salesLost;
	}

	public HashMap<String, HashMap<String, Long>> getLeadConversion() {
		return leadConversion;
	}

	public void setLeadConversion(HashMap<String, HashMap<String, Long>> leadConversion) {
		this.leadConversion = leadConversion;
	}
	
	
}
