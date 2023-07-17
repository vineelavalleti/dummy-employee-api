package com.vineela.dummy.emp.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vineela.dummy.emp.api.model.Employee;

@Service
public class EmployeeService {
	public List<Employee> getDummyEmployees() {
		List<Employee> list = new ArrayList<>();

		Employee emp = new Employee();
		emp.setEmpid(1);
		emp.setEmpname("Tiger Nixon");
		emp.setEmpsal(320800);
		emp.setEmpage(61);

		Employee emp1 = new Employee();
		emp1.setEmpid(2);
		emp1.setEmpname("Garrett Winters");
		emp1.setEmpsal(170750);
		emp1.setEmpage(63);

		Employee emp2 = new Employee();
		emp2.setEmpid(3);
		emp2.setEmpname("Tiger Nixon");
		emp2.setEmpsal(86000);
		emp2.setEmpage(66);

		Employee emp3 = new Employee();
		emp3.setEmpid(4);
		emp3.setEmpname("Cedric Kelly");
		emp3.setEmpsal(433060);
		emp3.setEmpage(22);

		Employee emp4 = new Employee();
		emp4.setEmpid(5);
		emp4.setEmpname("Airi Satou");
		emp4.setEmpsal(162700);
		emp4.setEmpage(33);

		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);

		return list;

	}
	

}
