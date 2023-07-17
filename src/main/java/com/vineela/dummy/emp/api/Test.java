package com.vineela.dummy.emp.api;

import com.vineela.dummy.emp.api.model.Employee;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpid(1);
		e1.setEmpname("Vineela");
		displayEmpData(e1);
		
		Employee e2 = new Employee();
		e2.setEmpid(2);
		e2.setEmpname("Srinu");
		
		displayEmpData(e2);
		
		Employee e3 = new Employee();
		e3.setEmpid(3);
		e3.setEmpname("Deekshita");
		
		displayEmpData(e3);
		
		
	}
	
	
	public static void displayEmpData(Employee e) {
		System.out.println("ID = "+ e.getEmpid());
		System.out.println("Name = "+ e.getEmpname());
		System.out.println("Sal = "+ e.getEmpsal());
		System.out.println("Age = "+ e.getEmpage());
		System.out.println("");
		
	}

}
