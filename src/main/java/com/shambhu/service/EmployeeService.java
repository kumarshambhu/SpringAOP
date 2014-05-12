package com.shambhu.service;

import com.shambhu.model.Employee;

public class EmployeeService {
	private Employee employee;

	public Employee getEmployee() {
		System.out.println("Returning Employee");
		return employee;
	}

	public void setEmployee(Employee employee) {
		System.out.println("Setting Employee");
		this.employee = employee;
	}

}
