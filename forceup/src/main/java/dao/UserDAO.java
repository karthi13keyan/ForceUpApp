package dao;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;

import org.joda.time.LocalDateTime;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.SetOptions;
import com.google.cloud.firestore.WriteResult;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import interfaces.UserInterface;
import io.hypertrack.factory.UserFactory;
import io.hypertrack.model.User;
import model.Employee;
import model.ForceupUser;
import model.LeadProspects;
import model.Leaddetails;
import model.SaleDetails;
import model.Uservalidator;
import model.adsfasdf;
import util.DbToObjectConvertion;
import util.GenericUtil;

@Singleton
public class UserDAO implements UserInterface {

	private UserFactory userFactory = null;
	private Firestore firestore = null;
	private ForceupUser forceupUser = null;
	private static final String USERS_TABLE = "users";
	private static final String USERS_VALIDATE = "VALIDATE";
	private static final String GROUP_ID = "groupId";
	private static final String LEAD_DETAILS = "LEAD";
	private static final String EMPLOYEE_DETAILS = "EMPLOYEE";
	private static final String SALE_DETAILS = "SALES";
	private static final String SALE_DETAILSs = "Karthik";

	@Inject
	UserDAO(UserFactory userFactory, Firestore firestore, ForceupUser forceupUser) {
		this.userFactory = userFactory;
		this.firestore = firestore;
		this.forceupUser = forceupUser;
	}

	public UserDAO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Map<String, Object> createUser(final Map<String, Object> creationParameters) {
		try {
			final String accessKey = GenericUtil.generateRandomString();
			DocumentReference docRef = firestore.collection(USERS_TABLE).document(accessKey);
			User user = userFactory != null ? userFactory.create(creationParameters) : null;
			if (user != null) {
				Map<String, Object> userProperties = forceupUser.returnUserAsMap(user);
				docRef.set(userProperties);
				return userProperties;
			}
			return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	public Map<String, Object> retrieveUser(final String accessKey) {
		try {
			DocumentReference docRef = firestore.collection(USERS_TABLE).document(accessKey);
			return docRef.get().get().getData();
		} catch (Exception e) {
			// System.out.println("Error while retrieving record" + e);
			HashMap<String, Object> resultset = new HashMap<String, Object>();
			resultset.put("Error", e);
			return resultset;
		}
	}

	@Override
	public Map<String, Object> updateUser(final String accessKey, final Map<String, Object> updationParameters) {
		try {
			DocumentReference docRef = firestore.collection(USERS_TABLE).document(accessKey);
			Map<String, Object> existingParameters = docRef.get().get().getData();
			existingParameters.putAll(updationParameters);
			docRef.update(existingParameters);
			return existingParameters;
		} catch (Exception e) {
			System.out.println("Error while updating record" + e);
			return null;
		}
	}

	@SuppressWarnings("null")
	@Override
	public List<Map<String, Object>> getUsers(final String groupId) {
		List<Map<String, Object>> userList = null;
		try {
			List<DocumentSnapshot> documents = firestore.collection(USERS_TABLE).whereEqualTo(GROUP_ID, groupId).get()
					.get().getDocuments();
			for (DocumentSnapshot document : documents) {
				userList.add(document.getData());
			}
		} catch (Exception e) {
			System.out.println("Error while retrieving users for this groupId");
		}
		return userList;

	}

	@SuppressWarnings({ "unlikely-arg-type", "unchecked" })
	@Override
	public Boolean validateMobileUser(final Uservalidator validationParameters) {
		try {
			DocumentReference docRef = firestore.collection(USERS_TABLE).document(USERS_VALIDATE);
			HashMap<String, Object> resultset = new HashMap<String, Object>();
			Boolean result = false;
			Map<String, Object> objValidator = (HashMap<String, Object>) docRef.get().get().getData();
			for (Map.Entry<String, Object> entry : objValidator.entrySet()) {
				if (entry.getKey().equals(validationParameters.getUserName())) {
					if (entry.getValue().equals(validationParameters.getPassword()))
						result = true;
					else
						System.out.println("Invalid  Password");
				} else {
					System.out.println("Invalid User Name");
				}
			}
			resultset.put("validation", result);
			return result;
		} catch (Exception e) {
			System.out.println("Error while validating records" + e);
			return null;
		}
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public ArrayList<Leaddetails> getLeadDetails(Uservalidator validationParameters)
			throws InterruptedException, ExecutionException {
		DocumentReference docRef = firestore.collection(USERS_TABLE).document(LEAD_DETAILS);
		ArrayList<Leaddetails> listLeaddetails = new ArrayList<Leaddetails>();
		UserDAO objdao = new UserDAO();
		Map<String, Object> objValidator = (HashMap<String, Object>) docRef.get().get().getData();
		
		for (Map.Entry<String, Object> entry : objValidator.entrySet()) {
			
			if (entry.getKey().equals(validationParameters.getUserName())) {

				HashMap<String, Object> mapleaddetails = (HashMap<String, Object>) entry.getValue();

				for (Map.Entry<String, Object> entry2 : mapleaddetails.entrySet()) {

					HashMap<String, Object> mapleaddetails2 = (HashMap<String, Object>) entry2.getValue();
					
					Leaddetails objldetails = new Leaddetails();
					
					for (Map.Entry<String, Object> entry3 : mapleaddetails2.entrySet()) {

						objdao.setLeadDetails(entry3, objldetails);
					
					}
					listLeaddetails.add(objldetails);
					listLeaddetails.add(objldetails);
				}
			} else {
				
				System.out.println("Invalid User Name");
			}
		}
		return listLeaddetails;
	}

	private void setLeadDetails(Entry<String, Object> entry3, Leaddetails objldetails) {

		
		if ("dealAmount".equals(entry3.getKey()) && entry3.getValue() != null) {
			objldetails.setDealAmount((long) entry3.getValue());
		} else if ("endTime".equals(entry3.getKey()) && entry3.getValue() != null) {
			objldetails.setEndTime((Date) entry3.getValue());
		} else if ("leadAddress".equals(entry3.getKey()) && entry3.getValue() != null) {
			objldetails.setLeadAddress((String) entry3.getValue());
		} else if ("leadName".equals(entry3.getKey()) && entry3.getValue() != null) {
			objldetails.setLeadName((String) entry3.getValue());
		} else if ("leadPhoneNumber".equals(entry3.getKey()) && entry3.getValue() != null) {
			objldetails.setLeadPhoneNumber((long) entry3.getValue());
		} else if ("leadStatus".equals(entry3.getKey()) && entry3.getValue() != null) {
			objldetails.setLeadStatus((String) entry3.getValue());
		} else if ("startTime".equals(entry3.getKey()) && entry3.getValue() != null) {
			objldetails.setStartTime((Date) entry3.getValue());
		} else if ("closeDate".equals(entry3.getKey()) && entry3.getValue() != null) {
			objldetails.setCloseDate((Date) entry3.getValue());
		}
		

	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Boolean> addLeadDetails(Map<String, Object> leadDetails)
			throws InterruptedException, ExecutionException {
		DocumentReference docRef = firestore.collection(USERS_TABLE).document(LEAD_DETAILS);
		Map<String, Object> obj = docRef.get().get().getData();
		Map<String, Boolean> obj2 = new HashMap<>();
		ArrayList<Leaddetails> objArrayList = new ArrayList<Leaddetails>();
		Leaddetails objldetails = new Leaddetails();
		for (Entry<String, Object> entrylead : leadDetails.entrySet()) {
			for (Map.Entry<String, Object> entry : obj.entrySet()) {
				if (entrylead.getKey().equals(entry.getKey())) {
					objArrayList = (ArrayList<Leaddetails>) entry.getValue();
					objArrayList.add((Leaddetails)entrylead.getValue());
					obj.put(entrylead.getKey(), objArrayList);
					docRef.update(obj);
				} else {
					setLeadDetails(entry, objldetails);
					objArrayList.add(objldetails);
				}
				obj.put(entrylead.getKey(), objArrayList);
				docRef.update(obj);
			}
			obj2.put("Status", true);
//		}

		return obj2;
	}
		return obj2;

	
	}
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public Employee setEmployeeDetails(Uservalidator validationParameters) throws InterruptedException, ExecutionException {
		DocumentReference docRef = firestore.collection(USERS_TABLE).document(EMPLOYEE_DETAILS);
		UserDAO objdao = new UserDAO();
		Map<String, Object> objValidator = (HashMap<String, Object>) docRef.get().get().getData();
		Employee employeeDetails = new Employee();
		for (Map.Entry<String, Object> entry : objValidator.entrySet()) {
			
			if (entry.getKey().equals(validationParameters.getUserName())) {

				HashMap<String, Object> mapEmpdetails = (HashMap<String, Object>) entry.getValue();

				for (Map.Entry<String, Object> entry2 : mapEmpdetails.entrySet()) {

					if("empMailId".equals(entry2.getKey())) {
						employeeDetails.setEmpMailId((String) entry2.getValue());
					} else if("empName".equals(entry2.getKey())) {
						employeeDetails.setEmpName((String) entry2.getValue());
					} else if("empPhoneNum".equals(entry2.getKey())) {
						employeeDetails.setEmpPhoneNum( (long) entry2.getValue());
					} else if("empTarget".equals(entry2.getKey())) {
						employeeDetails.setEmpTarget((long) entry2.getValue());
					} 
					

				}
	//			docRef = null;
	//			employeeDetails.setSaleDetails(objdao.getSaleDetails(validationParameters));
			} else {
				
				System.out.println("Invalid User Name");
			}
		}
		return employeeDetails;
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public SaleDetails getSaleDetails(Uservalidator validationParameters) throws InterruptedException, ExecutionException {
		DocumentReference docRef = firestore.collection(USERS_TABLE).document(SALE_DETAILS);
	//	DatabaseReference usersRef = docRef.child("users");

		SaleDetails saleDetails = new SaleDetails();
		UserDAO objdao = new UserDAO();
		Map<String, Object> objValidator = (HashMap<String, Object>) docRef.get().get().getData();
		
		for (Map.Entry<String, Object> entry : objValidator.entrySet()) {
			
			if (entry.getKey().equals(validationParameters.getUserName())) {

				HashMap<String, Object> mapSaldetails = (HashMap<String, Object>) entry.getValue();

				for (Map.Entry<String, Object> entry2 : mapSaldetails.entrySet()) {

					if("closedDeals".equals(entry2.getKey())) {
						saleDetails.setClosedDeals((long) entry2.getValue());
					} else if("empAchieved".equals(entry2.getKey())) {
						saleDetails.setEmpAchieved( (long) entry2.getValue());
					} else if("failedDeals".equals(entry2.getKey())) {
						saleDetails.setFailedDeals(  (long) entry2.getValue());
					} else if("succDeals".equals(entry2.getKey())) {
						saleDetails.setSuccDeals((long) entry2.getValue());
					} 
				}
	//			saleDetails.setLeadDetails(objdao.getLeadDetails(validationParameters));
			} else {
				
				System.out.println("Invalid User Name");
			}
		}
		return saleDetails;
	}
	
	@Override
	public void mytechnique() throws InterruptedException, ExecutionException {
		DocumentReference docRef = firestore.collection(USERS_TABLE).document("Technique");
		Map<String, adsfasdf> users = new HashMap<>();
		users.put("asdlfj", new adsfasdf("asdf","adf"));
		users.put("asdfosafdf", new adsfasdf("December 9, 1906", "Grace Hopper"));
		ApiFuture<WriteResult> result = docRef.set(users);
		
		
//		ApiFuture<QuerySnapshot> query = firestore.collection("users").get();
//		// ...
//		// query.get() blocks on response
//		QuerySnapshot querySnapshot = query.get();
//		List<DocumentSnapshot> documents = querySnapshot.getDocuments();
//		for (DocumentSnapshot document : documents) {
//		  System.out.println("User: " + document.getId());
//		  System.out.println("First: " + document.getString("pwd"));
//		  if ("Technique".equals(document.getId())) {
//		    System.out.println(": " + document.getString("middle"));
//		  }
//		  System.out.println("Last: " + document.getString("last");
//		  System.out.println("Born: " + document.getLong("born"));
	//	}
		
		DocumentReference docRef2 = firestore.collection("users").document("Technique");
		ApiFuture<DocumentSnapshot> query = docRef2.get();
		DocumentSnapshot documentsnap = query.get();
		Map<String, Object> documents = documentsnap.getData();
	//	System.out.println("Last: " + documents.getI("last"));
	//	  System.out.println("Born: " + documents.getLong("born"));
	}

	public ArrayList<LeadProspects> addLeadProspects(ArrayList<LeadProspects> leadProspects) throws InterruptedException, ExecutionException {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		HashMap<String, Object> addLeadProspect = new HashMap<String,Object>();
		LeadProspects obj = new LeadProspects();
		Date keyValue = new Date();
	//	DocumentSnapshot docRef = firestore.collection(USERS_TABLE).document("LeadProspects").get().get();
		addLeadProspect.put(df.format(keyValue), leadProspects);
		//ApiFuture<WriteResult> result = docRef.set(addLeadProspect, SetOptions.merge());
		ApiFuture<DocumentReference> docRef = firestore.collection("Lead_Prospects").add(addLeadProspect);
	//	docRef.isDone();
	//	List<DocumentSnapshot> docRef2 =firestore.collection("Lead_Prospects").get().get().getDocuments();
	//	DbToObjectConvertion objDbToObjectConvertion = new DbToObjectConvertion();
//		ArrayList<LeadProspects> obj2  = objDbToObjectConvertion.setleadValues(docRef);
		ArrayList<LeadProspects> obj2  = new ArrayList<LeadProspects>();
//		ArrayList<LeadProspects> obj2  = objDbToObjectConvertion.setObjValues(docRef2);
		return obj2;
		
	}
	
	
	
	
}
