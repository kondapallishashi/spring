package com.insync.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.EmployeeWithAddress;

public class DI_Has_A_Dependency_Constructor_Demo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Employee.xml");
		EmployeeWithAddress employee=(EmployeeWithAddress)context.getBean("employeeWithAddress");
		employee.showEmployeeInfo();
	}

}
