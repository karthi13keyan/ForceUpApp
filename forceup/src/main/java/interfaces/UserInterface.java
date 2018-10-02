package interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import model.Employee;
import model.Leaddetails;
import model.SaleDetails;
import model.Uservalidator;

public interface UserInterface {

    Object createUser(Map<String, Object> creationParameters);
 
    Object retrieveUser(String id);

    Object updateUser(String id, Map<String, Object> updationParameters);

    Object getUsers(String id);
    
    Object validateMobileUser(Uservalidator validationParameters);

    

	ArrayList<Leaddetails> getLeadDetails(Uservalidator uservalidator) throws InterruptedException, ExecutionException;


	Employee setEmployeeDetails(Uservalidator uservalidator) throws InterruptedException, ExecutionException;

	SaleDetails getSaleDetails(Uservalidator validationParameters) throws InterruptedException, ExecutionException;

	Map<String, Boolean> addLeadDetails(Map<String, Object> leadDetails)
			throws InterruptedException, ExecutionException;

	void mytechnique() throws InterruptedException, ExecutionException;

	
    
}
