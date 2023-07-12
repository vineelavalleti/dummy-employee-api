package com.vineela.dummy.emp.api.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vineela.dummy.emp.api.constants.EmpConstants;

@RestController
@RequestMapping(EmpConstants.EMP_API_ROOT_PATH)
public class HelloController {
	

	@RequestMapping(value = EmpConstants.EMP_API_HELLO_PATH, 
			method=RequestMethod.GET)
	
	public String getHello(){
		return "Good Morning";
	}
	@RequestMapping(value = EmpConstants.EMP_API_HI_PATH,
		    method = RequestMethod.POST,
		    produces = "application/json",
		    consumes = MediaType.APPLICATION_JSON_VALUE
		)
	public String getHi(){
		
		return " {\"message\":\"Good Morning\"} ";
	}
}
