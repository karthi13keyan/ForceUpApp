package com.app.forceup.controller;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.forceup.model.Customer;
import com.app.forceup.model.LeadDetails;
import com.app.forceup.model.MobileResponse;
import com.app.forceup.model.Uservalidator;
import com.app.forceup.repository.CustomerRepository;
import com.app.forceup.service.UserService;

@RestController
@RequestMapping("/users")
public class ForceUpAppController {

		@Autowired
	    CustomerRepository repository;
	    
		@Autowired
	    private UserService us;
		
		
		
		// Reference Requests 
		
		
		@RequestMapping("/id")
	    public LeadDetails id(){
	       LeadDetails l = new LeadDetails();
	       return l;
	        }
	          
	      
		
	    @RequestMapping("/save")
	    public String process(){
	        repository.save(new Customer("Jack", "Smith"));
	        repository.save(new Customer("Adam", "Johnson"));
	        repository.save(new Customer("Kim", "Smith"));
	        repository.save(new Customer("David", "Williams"));
	        repository.save(new Customer("Peter", "Davis"));
	        return "Done";
	    }
	      
	      
	    @RequestMapping("/findall")
	    public String findAll(){
	        String result = "<html>";
	          
	        for(Customer cust : repository.findAll()){
	            result += "<div>" + cust.toString() + "</div>";
	            
	        }
	          
	        return result + "</html>";
	    }
	      
	    @RequestMapping("/findbyid")
	    public String findById(@RequestParam("id") long id){
	        String result = "";
	        result = repository.findOne(id).toString();
	        return result;
	    }
	      
	    @RequestMapping("/findbylastname")
	    public String fetchDataByLastName(@RequestParam("lastname") String lastName){
	        String result = "<html>";
	          
	        for(Customer cust: repository.findByLastName(lastName)){
	            result += "<div>" + cust.toString() + "</div>"; 
	        }
	          
	        return result + "</html>";
	    }
	    
	    // End of References
	    
	    /// Mobile application Requests
	    
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
	    public Map<String, Boolean> addLeadDetails( @RequestBody LeadDetails leadDetails) throws InterruptedException, ExecutionException {
	    	
	        return us.addLeadDetails(leadDetails);
	    }
	    
	    
	    
	    
	    
}
