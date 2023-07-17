package com.vineela.dummy.emp.api.model;

import java.util.List;

import lombok.Data;

@Data
public class Employee1 {
	private int id;
	private String employee_name;
	private int employee_sal;
	private int employee_age;
	private String profile_image;
	private List<Address> address;
}
