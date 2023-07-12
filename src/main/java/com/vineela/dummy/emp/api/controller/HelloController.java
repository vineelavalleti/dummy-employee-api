package com.vineela.dummy.emp.api.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
	
	@RequestMapping(value = "/hello", method=RequestMethod.GET)
	@GetMapping("/hello")
	public String getHello(){
		return "Good Morning";
	}
	@RequestMapping(value = "/hi",
		    method = RequestMethod.POST,
		    produces = "application/json",
		    consumes = MediaType.APPLICATION_JSON_VALUE
		)
	public String getHi(){
		return " {\"message\":\"Good Morning\"} ";
	}
}
