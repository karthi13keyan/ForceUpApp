package controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import service.ActionService;

@RestController
@RequestMapping("/actions")
public class ActionController {
	
    
    @Autowired
    private ActionService as;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object addIssuer(@RequestBody Map<String,
            String> actionParameters) {
        return as.createActions(actionParameters.get("first_user"),
        		actionParameters.get("second_user"));
    }


}
