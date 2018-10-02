package dao;


import model.HomePageBestvsCurrent;
import model.HomePageDeal;
import model.HomePageLost;
import model.HomePagePipeline;
import model.HomePageSales;
import model.HomePageTarget;
import model.Status;
import model.WebHomePage;

public class StaticValues {
	
	public WebHomePage setWebResponse(Status status) {
		
		WebHomePage objWebHomePage = new WebHomePage();
		objWebHomePage.setObjstatus(status);
		objWebHomePage.setObjHomePageTarget(setObjHomePageTarget());
		objWebHomePage.setObjHomePagePipeline(objHomePagePipeline());
		objWebHomePage.setObjHomePageSales(setobjHomePageSales());
		objWebHomePage.setObjHomePageDeal(objHomePageDeal());
		objWebHomePage.setObjHomePageBestvsCurrent(objHomePageBestvsCurrent());
		objWebHomePage.setObjHomePageLost(objHomePageLost());
		return objWebHomePage;
		
		
	}
	private HomePageLost objHomePageLost() {
		HomePageLost objHomePageLost = new HomePageLost();
		objHomePageLost.setAlreadyBought(100000);
		objHomePageLost.setBadCibil(1000000);
		objHomePageLost.setGeneralInquiry(500000);
		objHomePageLost.setHighFees(1000000);
		objHomePageLost.setIntMismatch(300000);
		objHomePageLost.setLessLoanAmt(50000);
		objHomePageLost.setSalMismatch(600000);
		return objHomePageLost;
	}
	private HomePageDeal objHomePageDeal() {
		HomePageDeal objHomePageDeal = new HomePageDeal();
		objHomePageDeal.setClosedLost(2);
		objHomePageDeal.setClosedWon(3);
		objHomePageDeal.setCreatConversion(90);
		objHomePageDeal.setCreated(30);
		objHomePageDeal.setDcConversion(85);
		objHomePageDeal.setDocCollection(8);
		objHomePageDeal.setClConversion(100);
		objHomePageDeal.setCwConversion(100);
		objHomePageDeal.setF2fConversion(80);
		objHomePageDeal.setFac2fac(5);
		objHomePageDeal.setFileProcessing(9);
		objHomePageDeal.setFpConversion(30);
		objHomePageDeal.setFollowUp(6);
		objHomePageDeal.setFuConversion(33.33);
		
		return objHomePageDeal;
	}
	private HomePageBestvsCurrent objHomePageBestvsCurrent() {
		// TODO Auto-generated method stub
		return null;
	}
	private HomePagePipeline objHomePagePipeline() {
		HomePagePipeline objHomePagePipeline = new HomePagePipeline();
		objHomePagePipeline.setConPercent(20);
		objHomePagePipeline.setConValue(200000);
		objHomePagePipeline.setDcPercent(20);
		objHomePagePipeline.setDcValue(200000);
		objHomePagePipeline.setF2fPercent(20);
		objHomePagePipeline.setF2fValue(200000);
		objHomePagePipeline.setFpPercent(20);
		objHomePagePipeline.setFpValue(200000);
		objHomePagePipeline.setFuPercent(20);
		objHomePagePipeline.setFuValue(200000);
		objHomePagePipeline.setTargetValue(1000000);
		return objHomePagePipeline;
	}
	private HomePageSales setobjHomePageSales() {
		HomePageSales objHomePageSales = new HomePageSales();
		objHomePageSales.setConCreated(25);
		objHomePageSales.setConAssigned(25);
		objHomePageSales.setFac2fac(5);
		objHomePageSales.setFilProcessing(4);
		objHomePageSales.setInFolup(8);
		objHomePageSales.setSalClosed(3);
		return objHomePageSales;
	}
	private HomePageTarget setObjHomePageTarget() {
		HomePageTarget objHomePageTarget = new HomePageTarget();
		objHomePageTarget.setDaysRemaining(3);
		objHomePageTarget.setFileProcessing(1000000);
		objHomePageTarget.setFollowup(800000);
		objHomePageTarget.setLostValues(400000);
		objHomePageTarget.setPercentageRemaining(50);
		objHomePageTarget.setProspectsAssigned(35);
		objHomePageTarget.setProspectsCreated(40);
		objHomePageTarget.setProspectsReached(20);
		objHomePageTarget.setTargetAchieved(500000);
		return objHomePageTarget;
	}
	

}
