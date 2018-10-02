package model;
import java.util.ArrayList;
public class WebTeamResults {

	TeamResultAchiever objTeamResultAchiever;
	TeamResultPerformance objTeamResultPerformance;
	ArrayList<TeamResultForecast> objTeamResultForecast;
	TeamResultDeals objTeamResultDeals;
	public TeamResultAchiever getObjTeamResultAchiever() {
		return objTeamResultAchiever;
	}
	public void setObjTeamResultAchiever(TeamResultAchiever objTeamResultAchiever) {
		this.objTeamResultAchiever = objTeamResultAchiever;
	}
	public TeamResultPerformance getObjTeamResultPerformance() {
		return objTeamResultPerformance;
	}
	public void setObjTeamResultPerformance(TeamResultPerformance objTeamResultPerformance) {
		this.objTeamResultPerformance = objTeamResultPerformance;
	}
	
	public ArrayList<TeamResultForecast> getObjTeamResultForecast() {
		return objTeamResultForecast;
	}
	public void setObjTeamResultForecast(ArrayList<TeamResultForecast> objTeamResultForecast) {
		this.objTeamResultForecast = objTeamResultForecast;
	}
	public TeamResultDeals getObjTeamResultDeals() {
		return objTeamResultDeals;
	}
	public void setObjTeamResultDeals(TeamResultDeals objTeamResultDeals) {
		this.objTeamResultDeals = objTeamResultDeals;
	}
	
	
}
