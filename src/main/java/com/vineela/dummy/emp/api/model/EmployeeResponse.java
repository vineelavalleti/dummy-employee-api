package com.vineela.dummy.emp.api.model;

import java.util.List;

import lombok.Data;

@Data
public class EmployeeResponse {
	private String status;
	private List<Employee> data;
	private String message;
}
