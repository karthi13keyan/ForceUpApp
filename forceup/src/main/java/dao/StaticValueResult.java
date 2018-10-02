package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Calendar;
import model.Employee;
import model.LeadProspects;
import model.SaleDetails;
import model.TeamResultAchiever;
import model.TeamResultDeals;
import model.TeamResultForecast;
import model.TeamResultPerformance;
import model.WebTeamProfile;
import model.WebTeamResults;


public class StaticValueResult {

	public WebTeamResults setStaticValueResult() {
		
		WebTeamResults objWebTeamResults = new WebTeamResults();
		objWebTeamResults.setObjTeamResultAchiever(setobjTeamResultAchiever());
		objWebTeamResults.setObjTeamResultPerformance(setobjTeamResultPerformance());
		objWebTeamResults.setObjTeamResultForecast(setobjTeamResultForecast());
		objWebTeamResults.setObjTeamResultDeals(setobjTeamResultDeals());
		return objWebTeamResults;
		
		
	}

	private TeamResultDeals setobjTeamResultDeals() {
		TeamResultDeals objTeamResultDeals = new TeamResultDeals();
		HashMap<String,Long> lostSales = new HashMap<String,Long>();
		HashMap<String,Long> conversion = new HashMap<String,Long>();

		HashMap<String,HashMap<String,Long>> salesLost = new HashMap<String,HashMap<String,Long>>();
		
		HashMap<String,HashMap<String,Long>> leadConversion  = new HashMap<String,HashMap<String,Long>>();
		
		lostSales.put("Gowthaman", 500000l);
		lostSales.put("Manoj", 250l);
		lostSales.put("Anirudh", 75l);
		lostSales.put("Antony", 18l);
		lostSales.put("Yusuf", 27l);
		
		conversion.put("George", 500000l);
		conversion.put("Clive", 250l);
		conversion.put("Bennedict", 75l);
		conversion.put("Mohammad", 18l);
		conversion.put("Vishal", 27l);
		
		salesLost.put("Sales Lost", lostSales) ;
		leadConversion.put("Lead Conversion", conversion);
		
		objTeamResultDeals.setSalesLost(salesLost);
		
		objTeamResultDeals.setLeadConversion(leadConversion);
		
		return objTeamResultDeals;
	}

	private ArrayList<TeamResultForecast> setobjTeamResultForecast() {
		ArrayList<TeamResultForecast> objTeamResult = new ArrayList<TeamResultForecast>();
		TeamResultForecast objTeamResultForecast = new TeamResultForecast();
		TeamResultForecast objTeamResultForecast2 = new TeamResultForecast();
		TeamResultForecast objTeamResultForecast3 = new TeamResultForecast();
		TeamResultForecast objTeamResultForecast4 = new TeamResultForecast();
		
		objTeamResultForecast.setEmpName("Mohan");
		objTeamResultForecast.setTotClosedAmt(200000l);
		objTeamResultForecast.setTotForcstAmt(1000000l);
		objTeamResultForecast.setTotPiplAmt(300000l);
		
		objTeamResultForecast2.setEmpName("Daniel");
		objTeamResultForecast2.setTotClosedAmt(800000l);
		objTeamResultForecast2.setTotForcstAmt(2300000l);
		objTeamResultForecast2.setTotPiplAmt(100000l);
		
		objTeamResultForecast3.setEmpName("Kamal");
		objTeamResultForecast3.setTotClosedAmt(2l);
		objTeamResultForecast3.setTotForcstAmt(01l);
		objTeamResultForecast3.setTotPiplAmt(1l);
		
		objTeamResultForecast4.setEmpName("Mahat");
		objTeamResultForecast4.setTotClosedAmt(2100000l);
		objTeamResultForecast4.setTotForcstAmt(700000l);
		objTeamResultForecast4.setTotPiplAmt(900000l);
		
		objTeamResult.add(objTeamResultForecast);
		objTeamResult.add(objTeamResultForecast2);
		objTeamResult.add(objTeamResultForecast3);
		objTeamResult.add(objTeamResultForecast4);
		
		return objTeamResult;
	}

	private TeamResultPerformance setobjTeamResultPerformance() {
		TeamResultPerformance objTeamResultPerformance = new TeamResultPerformance();
		HashMap<String,Long> objHashMap = new HashMap<String,Long>();
		HashMap<String,Long> objHashMap2 = new HashMap<String,Long>();
		HashMap<String,Long> objHashMap3 = new HashMap<String,Long>();
		HashMap<String,Long> objHashMap4 = new HashMap<String,Long>();
		
		HashMap<String,HashMap<String,Long>> teamResultPerformance = new HashMap<String,HashMap<String,Long>>();
		
		objHashMap.put("Sales Achieved", 500000l);
		objHashMap.put("Follow-up", 250l);
		objHashMap.put("F2F", 75l);
		objHashMap.put("Doc Collection", 18l);
		objHashMap.put("Sales Closed", 27l);
		
		objHashMap2.put("Sales Achieved", 500000l);
		objHashMap2.put("Follow-up", 250l);
		objHashMap2.put("F2F", 75l);
		objHashMap2.put("Doc Collection", 18l);
		objHashMap2.put("Sales Closed", 27l);
		
		objHashMap3.put("Sales Achieved", 500000l);
		objHashMap3.put("Follow-up", 250l);
		objHashMap3.put("F2F", 75l);
		objHashMap3.put("Doc Collection", 18l);
		objHashMap3.put("Sales Closed", 27l);
		
		objHashMap4.put("Sales Achieved", 500000l);
		objHashMap4.put("Follow-up", 250l);
		objHashMap4.put("F2F", 75l);
		objHashMap4.put("Doc Collection", 18l);
		objHashMap4.put("Sales Closed", 27l);
		
		teamResultPerformance.put("Madesh",objHashMap);
		teamResultPerformance.put("Pragadeesb",objHashMap);
		teamResultPerformance.put("Yukesh",objHashMap);
		teamResultPerformance.put("Prajan",objHashMap);
		objTeamResultPerformance.setAgentPerformance(teamResultPerformance);
		
		return objTeamResultPerformance;
	}

	private TeamResultAchiever setobjTeamResultAchiever() {
		
		TeamResultAchiever objTeamResultAchiever = new TeamResultAchiever();
		
		HashMap<String,Long> salesAchiever = new HashMap<>();
		HashMap<String,Long> pipeline = new HashMap<>();
		HashMap<String,Long> faceToFace = new HashMap<>();
		salesAchiever.put("Varun", 100000l);
		salesAchiever.put("Karan", 200000l);
		salesAchiever.put("Danieal", 300000l);
		salesAchiever.put("Javid", 400000l);
		salesAchiever.put("Murugesh", 500000l);
		objTeamResultAchiever.setSalesAchiever(salesAchiever);
		pipeline.put("Nandish", 1000000l);
		pipeline.put("Raghu", 2000000l);
		pipeline.put("Mallik", 3000000l);
		pipeline.put("Gokul", 4000000l);
		pipeline.put("Vijay", 5000000l);
		objTeamResultAchiever.setPipeline(pipeline);
		faceToFace.put("Ajith", 6000000l);
		faceToFace.put("Indrajith", 7000000l);
		faceToFace.put("Gowtham", 8000000l);
		faceToFace.put("Prasanna", 9000000l);
		faceToFace.put("Sridhar", 1000000l);
		objTeamResultAchiever.setFaceToFace(faceToFace);
		return objTeamResultAchiever;
	}

	public WebTeamProfile setTeamProfileValues() {
		
		WebTeamProfile objWebTeamProfile = new WebTeamProfile();
		objWebTeamProfile.setObjEmployee(setEmloyeeDetails());
		objWebTeamProfile.setObjLeadProspects(setLeadProspects());
		objWebTeamProfile.setEmpActivity(setEmpActivity());
		return objWebTeamProfile;
	}

	private HashMap<Date, String> setEmpActivity() {
		
		HashMap<Date, String> objHashMap = new HashMap<Date, String>();
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY,17);
		cal.set(Calendar.MINUTE,30);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);
		
		objHashMap.put(cal.getTime(), "FF with Jeniffer");
		cal.set(Calendar.HOUR_OF_DAY,12);
		cal.set(Calendar.MINUTE,30);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);
		
		objHashMap.put(cal.getTime(), "DD with Christopher");
		cal.set(Calendar.HOUR_OF_DAY,10);
		cal.set(Calendar.MINUTE,30);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);
		
		objHashMap.put(cal.getTime(), "Discussion with Andrea");
		
		return objHashMap;
	}

	private LeadProspects setLeadProspects() {
		
		LeadProspects objLeadProspects = new LeadProspects();
		objLeadProspects.setCreationDate(new Date());
		objLeadProspects.setLeadName("Wahlberg");
		objLeadProspects.setEmailId("wahlberg@gmail.com");
		objLeadProspects.setLeadPhoneNumber(9999900000l);
		objLeadProspects.setLeadStatus("Pending");
		return objLeadProspects;
	}

	private Employee setEmloyeeDetails() {
		Employee objEmployee = new Employee();
		objEmployee.setEmpName("Mark");
		objEmployee.setOccupation("Sales Executive");
		objEmployee.setCompanyName("Influx India Solutions");
		objEmployee.setEmpPhoneNum(9600417422l);
		objEmployee.setEmpAddress("Thiruvanmiyur, Chennai");
		objEmployee.setEmpCity("Chennai");
		objEmployee.setEmpState("Tamil Nadu");
		objEmployee.setEmpPostcode(6000006l);
		objEmployee.setEmpFaceBook("www.facebook.com/Mark");
		objEmployee.setEmpLinkdIn("www.linkedin.com/Mark");
		objEmployee.setEmpInstagram("www.instagram.com/dad'slittleprince");
		objEmployee.setEmpTwitter("www.twitter.com/marktwit");
		objEmployee.setMemberProfit(500000l);
		objEmployee.setEmpOrders(1500l);
		objEmployee.setIssueReports(130l);
		SaleDetails objSaleDetails = new SaleDetails();
		objSaleDetails.setEmpAchieved(100000l);
		objSaleDetails.setFailedDeals(25000l);
		objSaleDetails.setPipeLine(40000l);
		objEmployee.setSaleDetails(objSaleDetails);
		return objEmployee;
	}

}
