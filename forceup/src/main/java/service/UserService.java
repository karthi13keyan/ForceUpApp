package service;


import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.google.inject.Guice;
import com.google.inject.Injector;

import dao.StaticValueResult;
import dao.StaticValues;
import dao.UserDAO;
import model.Data;
import model.LeadProspects;
import model.MobileResponse;
import model.SaleDetails;
import model.Status;
import model.Uservalidator;
import model.WebHomePage;
import model.WebTeamProfile;
import model.WebTeamResults;
import module.ProviderModule;

@Service
public class UserService {

    private final Injector injector = Guice.createInjector(new ProviderModule());
    private static UserDAO userDAO;
    StaticValues staticValues = new StaticValues();
    StaticValueResult staticValueResult = new StaticValueResult();
    MobileResponse mobResponse = new MobileResponse();
    Status status = new Status();
	Data data = new Data();
	SaleDetails saleDetails = new SaleDetails();
	
    public UserService() {
        userDAO = injector.getInstance(UserDAO.class);
    }

    public Map<String, Object> createNewUser(final Map<String,
            Object> creationParameters) {
        return userDAO.createUser(creationParameters);
    }

    public Map<String, Object> getUser(final String accessToken) {
    	
        return userDAO.retrieveUser(accessToken);
    }
    
    public Map<String, Object>updateAction(final String accessToken, 
    		Map<String, Object> updationParameters) {
    	return userDAO.updateUser(accessToken, updationParameters);
    }
    
    public MobileResponse validateMobileUser(Uservalidator uservalidator) throws InterruptedException, ExecutionException {
    	
    	status.setStatus(userDAO.validateMobileUser(uservalidator));
    	
    	//data.setLeadDetails(userDAO.getLeadDetails(uservalidator));
    	if(status.getStatus()) {
    	mobResponse.setEmployeeDetails(userDAO.setEmployeeDetails(uservalidator));
    	mobResponse.getEmployeeDetails().setSaleDetails(userDAO.getSaleDetails(uservalidator));
    	mobResponse.getEmployeeDetails().getSaleDetails().setLeadDetails(userDAO.getLeadDetails(uservalidator));
    //	mobResponse.setObjdata(data);
    	
    	}
    	mobResponse.setObjstatus(status);
    	return mobResponse;
    }

	public Map<String, Boolean> addLeadDetails(Map<String, Object> leadDetails) throws InterruptedException, ExecutionException {
		
		return userDAO.addLeadDetails(leadDetails);
	}

	public void mytechnique() throws InterruptedException, ExecutionException {
		userDAO.mytechnique();	
	}

	
	// Start of web requests
	
	public WebHomePage validateWebUser(Uservalidator uservalidator) {
		status.setStatus(userDAO.validateMobileUser(uservalidator));
		return staticValues.setWebResponse(status);
	}

	public WebTeamResults webTeamResults() {
		return staticValueResult.setStaticValueResult();
		
	}

	public WebTeamProfile webTeamProfiles() {
		
		return staticValueResult.setTeamProfileValues();
	}

	public ArrayList<LeadProspects> addLeads(ArrayList<LeadProspects> leadProspects) throws InterruptedException, ExecutionException {
		ArrayList<LeadProspects> obj = new ArrayList<LeadProspects>();
		//for(LeadProspects leadProspect: leadProspects)
			 obj =	userDAO.addLeadProspects(leadProspects);
		return obj;
	}



}
