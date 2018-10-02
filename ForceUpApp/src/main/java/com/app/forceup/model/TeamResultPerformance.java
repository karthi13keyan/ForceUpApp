package com.app.forceup.model;

import java.util.HashMap;

public class TeamResultPerformance {

	HashMap<String,HashMap<String,Long>> agentPerformance = new HashMap<>();

	public HashMap<String, HashMap<String, Long>> getAgentPerformance() {
		return agentPerformance;
	}

	public void setAgentPerformance(HashMap<String, HashMap<String, Long>> agentPerformance) {
		this.agentPerformance = agentPerformance;
	}
	
}
