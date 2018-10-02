package com.app.forceup.service.BO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.forceup.model.EmpSaleDetails;
import com.app.forceup.model.EmployeeDetails;
import com.app.forceup.model.MobileResponse;
import com.app.forceup.model.SaleDetails;
import com.app.forceup.repository.EmployeeDetailsRepository;
import com.app.forceup.repository.LeadDetailsRepository;
import com.app.forceup.repository.SaleDetailsRepository;
import com.app.forceup.repository.UserDetailsRepository;

public class UserServiceBo {

	@Autowired
	EmployeeDetailsRepository employeeDetailsRepository;

	@Autowired
	LeadDetailsRepository leadDetailsRepository;

	@Autowired
	SaleDetailsRepository saleDetailsRepository;

	@Autowired
	UserDetailsRepository userDetailsRepository;

	public MobileResponse setListEmployeeDetails(List<EmployeeDetails> empDetails) {
		Long empAchieved = 0l;
		Long closedDeals = 0l;
		Long failedDeals = 0l;
		Long succDeals = 0l;
		Long pipeLine = 0l;
		MobileResponse resultMobileResponse = new MobileResponse();
		List<EmpSaleDetails> listEmpSaleDetails = new ArrayList<EmpSaleDetails>();
		for (EmployeeDetails empDetail : empDetails) {
			EmpSaleDetails empSaleDetails = new EmpSaleDetails();
			ArrayList<SaleDetails> listSaleDetails = new ArrayList<SaleDetails>();
			listSaleDetails = saleDetailsRepository.findByEmployeeId(empDetail.getEmpId());
			for (SaleDetails saleDetails : listSaleDetails) {
				if (saleDetails.getLeadStatus().equals("")) {
					empAchieved = empAchieved + saleDetails.getDealAmount();
				} else if (saleDetails.getLeadStatus().equals("")) {
					closedDeals = empAchieved + saleDetails.getDealAmount();
				} else if (saleDetails.getLeadStatus().equals("")) {
					failedDeals = empAchieved + saleDetails.getDealAmount();
				} else if (saleDetails.getLeadStatus().equals("")) {
					succDeals = empAchieved + saleDetails.getDealAmount();
				} else if (saleDetails.getLeadStatus().equals("")) {
					pipeLine = empAchieved + saleDetails.getDealAmount();
				}
			}
			empSaleDetails.setEmpAchieved(empAchieved);
			empSaleDetails.setFailedDeals(failedDeals);
			empSaleDetails.setPipeLine(pipeLine);
			empSaleDetails.setClosedDeals(closedDeals);
			empSaleDetails.setSuccDeals(succDeals);
			empSaleDetails.setSaleDetails(listSaleDetails);
			listEmpSaleDetails.add(empSaleDetails);
		}
		resultMobileResponse.setEmpSaleDetails(listEmpSaleDetails);
		return resultMobileResponse;

	}

}
