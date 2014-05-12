package com.shambhu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shambhu.service.EmployeeService;

public class AopMain1 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		System.out.println("-----------------------------------------------------------");
		employeeService.getEmployee();
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		employeeService.setEmployee(null);
		System.out.println("-----------------------------------------------------------");
		//System.out.println(employeeService.getEmployee().getFirstName());

	}

}
