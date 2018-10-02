package dao;

import java.util.HashMap;
import java.util.Map;

import com.google.cloud.firestore.Firestore;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import interfaces.ActionInterface;

@Singleton
public class ActionDAO implements ActionInterface {
	
	private static final String ACTIONS_TABLE = "actions";
	private Firestore _firestore = null;
	
	@Inject
	ActionDAO(Firestore firestore) {
		_firestore = firestore;
		
	}

	@Override
	public Object createAction(String firstUser, String secondUser) {
		Map<String, Object> actionMap = new HashMap<String, Object>();
		actionMap.put("first_user", firstUser);
		actionMap.put("second_user", secondUser);
		return _firestore.collection(ACTIONS_TABLE).add(actionMap);
		
	}

}
