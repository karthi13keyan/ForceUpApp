package util;

import java.util.*;
import java.util.Map.Entry;

import com.google.cloud.firestore.DocumentSnapshot;

import model.LeadProspects;

public class DbToObjectConvertion {

	public ArrayList<LeadProspects> setObjValues(List<DocumentSnapshot> docRef) {
		
		ArrayList<LeadProspects> prospectList = new ArrayList<LeadProspects>();
		
		for(DocumentSnapshot doc : docRef) {
			LeadProspects obj = new LeadProspects();
			for(Entry<String, Object> entry2 : doc.getData().entrySet()) {
				
				if("creationDate".equals(entry2.getKey())) {
					obj.setCreationDate(((Date) entry2.getValue()));
				} else if("dealAmount".equals(entry2.getKey())) {
					obj.setDealAmount((long) entry2.getValue());
				} else if("emailId".equals(entry2.getKey())) {
					obj.setEmailId( (String) entry2.getValue());
				} else if("leadPhoneNumber".equals(entry2.getKey())) {
					obj.setLeadAddress((String) entry2.getValue());
				} else if("leadAddress".equals(entry2.getKey())) {
					obj.setLeadAddress((String) entry2.getValue());
				} else if("leadName".equals(entry2.getKey())) {
					obj.setLeadName( (String) entry2.getValue());
				} else if("leadStatus".equals(entry2.getKey())) {
					obj.setLeadStatus((String) entry2.getValue());
				} 
				prospectList.add(obj);

			}
			
		}
		
		return prospectList;
		
		
	}

	public ArrayList<LeadProspects> setleadValues(DocumentSnapshot doc) {
		LeadProspects obj = new LeadProspects();
		ArrayList<LeadProspects> prospectList = new ArrayList<LeadProspects>();
		
		for(Entry<String, Object> entry2 : doc.getData().entrySet()) {
			
			ArrayList<Object> objList = (ArrayList<Object>) entry2.getValue();
			
			for(Object entry: objList) {
			if("creationDate".equals(entry2.getKey())) {
				obj.setCreationDate(((Date) entry2.getValue()));
			} else if("dealAmount".equals(entry2.getKey())) {
				obj.setDealAmount((long) entry2.getValue());
			} else if("emailId".equals(entry2.getKey())) {
				obj.setEmailId( (String) entry2.getValue());
			} else if("leadPhoneNumber".equals(entry2.getKey())) {
				obj.setLeadAddress((String) entry2.getValue());
			} else if("leadAddress".equals(entry2.getKey())) {
				obj.setLeadAddress((String) entry2.getValue());
			} else if("leadName".equals(entry2.getKey())) {
				obj.setLeadName( (String) entry2.getValue());
			} else if("leadStatus".equals(entry2.getKey())) {
				obj.setLeadStatus((String) entry2.getValue());
			} 
			}
			prospectList.add(obj);

		}
		return null;
	}

}
