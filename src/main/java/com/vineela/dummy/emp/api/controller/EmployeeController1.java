package com.vineela.dummy.emp.api.controller;
import  java.util.*;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vineela.dummy.emp.api.model.Address;
import com.vineela.dummy.emp.api.model.Employee;
import com.vineela.dummy.emp.api.model.Employee1;
import com.vineela.dummy.emp.api.model.EmployeeResponse1;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController1 {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	String insertEmpSql = "INSERT into Employee(empid, empname, empsal, empage) values(?,?,?,?) ";
	
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee emp) {
		jdbcTemplate.update(insertEmpSql,emp.getEmpid(), emp.getEmpname(),
				emp.getEmpsal(), emp.getEmpage());
		
		return emp;
		
	}
	
	@GetMapping("/employee")
	public EmployeeResponse1 getemployee() {
		
		EmployeeResponse1 empResponse = new EmployeeResponse1();
		Employee1 emp = new Employee1();
		
		emp.setId(1);
		emp.setEmployee_name("Tiger Nixon");
		emp.setEmployee_sal(320880);
		emp.setEmployee_age(61);
		emp.setProfile_image("");
		 
		List <Address> list = new ArrayList<>();
		
		Address address = new Address();
		address.setAddress1("15102 summerwood lane");
		address.setCity("Alpharetta");
		address.setState("GA");
		address.setPin(30005);
		
		Address address1 = new Address();
		address1.setAddress1("321 north point");
		address1.setCity("Alpharetta");
		address1.setState("GA");
		address1.setPin(30025);
		
		list.add(address);
		list.add(address1);
		
	
		emp.setAddress(list);
		empResponse.setStatus("success");
		empResponse.setEmpdata(emp);
		
		
		return empResponse;
	}
	
	


}
