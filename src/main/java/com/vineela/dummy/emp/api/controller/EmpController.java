package com.vineela.dummy.emp.api.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vineela.dummy.emp.api.constants.EmpConstants;
import com.vineela.dummy.emp.api.model.Employee;
import com.vineela.dummy.emp.api.model.EmployeeResponse;
import com.vineela.dummy.emp.api.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmpController {
	
	@Autowired
	EmployeeService empService;

	@GetMapping("/employees/{name}")
	public EmployeeResponse getemployees(@PathVariable String name) {

		EmployeeResponse empResponse = new EmployeeResponse();

		List<Employee> matchedEmplist = new ArrayList<>();
		try
		{
			List<Employee> dummyEmplist = empService.getDummyEmployees();
			for (int i = 0; i < dummyEmplist.size(); i++) {
				Employee e = dummyEmplist.get(i);

				
				if (e.getEmpname().contains(name)) {
					matchedEmplist.add(e);
				}
			}
			
			if (matchedEmplist.isEmpty()) {
				empResponse.setStatus(EmpConstants.EMP_API_STATUS_NOTFOUND);
				empResponse.setMessage(EmpConstants.Emp_API_NotFound_Message);

				
			} else {
				empResponse.setStatus(EmpConstants.EMP_API_STATUS_SUCCESS);
				empResponse.setData(matchedEmplist);
				empResponse.setMessage(EmpConstants.Emp_API_Message);
			}

		} catch (Exception e) {
			empResponse.setStatus(EmpConstants.EMP_API_STATUS_FAILED);
		}

		return empResponse;
	}

	@GetMapping("/employees")
	public EmployeeResponse getemployees() {

	
		EmployeeResponse empResponse = new EmployeeResponse();
		try {
			List<Employee> list = empService.getDummyEmployees();
			empResponse.setStatus(EmpConstants.EMP_API_STATUS_SUCCESS);
			empResponse.setData(list);
			empResponse.setMessage(EmpConstants.Emp_API_Message);
		} catch (Exception e) {
			empResponse.setStatus(EmpConstants.EMP_API_STATUS_FAILED);
			empResponse.setMessage(EmpConstants.Emp_API_NotFound_Message);
		}

		return empResponse;
	}

	@RequestMapping(value = EmpConstants.EMP_API_HI_PATH, method = RequestMethod.POST, produces = "application/json", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String getHi() {

		return " {\"message\":\"Good Morning\"} ";
	}

	
}
