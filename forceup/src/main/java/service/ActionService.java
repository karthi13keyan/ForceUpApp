package service;

import org.springframework.stereotype.Service;

import com.google.inject.Guice;
import com.google.inject.Injector;

import dao.ActionDAO;
import module.ProviderModule;

@Service
public class ActionService {
	
    private final Injector injector = Guice.createInjector(new ProviderModule());
    private static ActionDAO actionDAO;

    public ActionService() {
        actionDAO = injector.getInstance(ActionDAO.class);
    }
    
    public Object createActions(final String firstUser, final String secondUser) {
    	return actionDAO.createAction(firstUser, secondUser);
    }

}
