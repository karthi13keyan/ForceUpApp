package com.app.forceup.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.forceup.model.EmployeeDetails;
import com.app.forceup.model.LeadDetails;
import com.app.forceup.model.MobileResponse;
import com.app.forceup.model.Status;
import com.app.forceup.model.UserDetails;
import com.app.forceup.model.Uservalidator;
import com.app.forceup.repository.EmployeeDetailsRepository;
import com.app.forceup.repository.LeadDetailsRepository;
import com.app.forceup.repository.SaleDetailsRepository;
import com.app.forceup.repository.UserDetailsRepository;
import com.app.forceup.service.BO.UserServiceBo;

@Service
public class UserService {

	@Autowired
	EmployeeDetailsRepository employeeDetailsRepository;

	@Autowired
	LeadDetailsRepository leadDetailsRepository;

	@Autowired
	SaleDetailsRepository saleDetailsRepository;

	@Autowired
	UserDetailsRepository userDetailsRepository;

	MobileResponse mobResponse = new MobileResponse();

	UserServiceBo userServiceBo = new UserServiceBo();

	Status status = new Status();

	public MobileResponse validateMobileUser(Uservalidator uservalidator)
			throws InterruptedException, ExecutionException {
		Status userStatus = new Status();
		for (UserDetails userDetails : userDetailsRepository.findAll()) {
			if (userDetails.getUserName().equals(uservalidator.getUserName())) {
				userStatus.setStatus(true);
			} else {
				userStatus.setStatus(false);
			}
		}
		if (userStatus.getStatus()) {
			mobResponse = userServiceBo
					.setListEmployeeDetails((List<EmployeeDetails>) employeeDetailsRepository.findAll());
		}
		mobResponse.setUserValidationStatus(userStatus);
		return mobResponse;
	}

	public Map<String, Boolean> addLeadDetails(LeadDetails leadDetails) {
		leadDetailsRepository.save(leadDetails);
		
		HashMap<String, Boolean> status = new HashMap<String, Boolean>();
		status.put("Status", true);
		return status;
	}
}
