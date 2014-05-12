package com.shambhu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shambhu.service.ProjectService;

public class AopMain2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		ProjectService projectService = ctx.getBean("projectService", ProjectService.class);
		System.out.println("-----------------------------------------------------------");
		projectService.getProject();
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		projectService.setProject(null);
		System.out.println("-----------------------------------------------------------");
		//System.out.println(employeeService.getEmployee().getFirstName());

	}

}
