package controller;

import java.util.ArrayList;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.LeadProspects;
import model.Leaddetails;
import model.MobileResponse;
import model.Uservalidator;
import model.WebHomePage;
import model.WebTeamProfile;
import model.WebTeamResults;
import service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService us;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> addIssuer(@RequestBody Map<String,
            Object> creationParameters) {
        return us.createNewUser(creationParameters);
    }

    @RequestMapping("{id}")
    @ResponseBody
    public HashMap getUser(@PathVariable("id") String accessKey) throws InterruptedException, ExecutionException {
     
    	ArrayList<LeadProspects> leadProspects = new ArrayList<LeadProspects>();
    	Leaddetails obj = new Leaddetails();
    	HashMap obj2 = new HashMap();
    	obj2.put("Kat", obj);
   	return obj2;
    }
    
    @RequestMapping(value = "/setAction/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Map<String, Object> changeAction(@PathVariable("id") String accessKey, @RequestBody Map<String,
            Object> updationParameters) {
        return us.updateAction(accessKey, updationParameters);
    }
    
    @RequestMapping(value = "/mobile/uservalidation", method = RequestMethod.POST)
    @ResponseBody
    public MobileResponse mobSignin( @RequestBody Map<String,
    		Uservalidator> validationParameters) throws InterruptedException, ExecutionException {
    	
    	for (Entry<String, Uservalidator> objUserVal : validationParameters.entrySet())
        return us.validateMobileUser((Uservalidator)objUserVal.getValue());
    	return null;
    }
    
    
    @RequestMapping(value = "/mobile/addleaddetails", method = RequestMethod.PUT)
    @ResponseBody
    public Map<String, Boolean> addLeadDetails( @RequestBody Map<String,
            Object> leadDetails) throws InterruptedException, ExecutionException {
    	
        return us.addLeadDetails(leadDetails);
    }
    
  
    
    
    // Start of Web Page requests
    
    @CrossOrigin
    @RequestMapping(value = "/webAction/{id}", method = RequestMethod.POST)
    @ResponseBody
    public WebHomePage webAdminLogin( @RequestBody Map<String,
    		Uservalidator> validationParameters) throws InterruptedException, ExecutionException {
    	
    	for (Entry<String, Uservalidator> objUserVal : validationParameters.entrySet())
        return us.validateWebUser((Uservalidator)objUserVal.getValue());
    	return null;
    }
    @CrossOrigin
    @RequestMapping(value = "/webAction/teamresult", method = RequestMethod.GET)
    @ResponseBody
    public WebTeamResults webTeamResults() throws InterruptedException, ExecutionException {
    	
    	
        return us.webTeamResults();
  
    }
    @CrossOrigin
    @RequestMapping(value = "/webAction/teamprofile", method = RequestMethod.GET)
    @ResponseBody
    public WebTeamProfile webTeamProfile() throws InterruptedException, ExecutionException {
    	
    	
        return us.webTeamProfiles();
  
    }
    
    @CrossOrigin
    @RequestMapping(value = "/webAction/leadProspects/{teamprofile}", method = RequestMethod.POST)
    @ResponseBody
    public ArrayList<LeadProspects> addLeadProspects( @RequestBody ArrayList<LeadProspects> leadProspects) throws InterruptedException, ExecutionException {
    	
    	
        return us.addLeads(leadProspects);
  
    }

}
