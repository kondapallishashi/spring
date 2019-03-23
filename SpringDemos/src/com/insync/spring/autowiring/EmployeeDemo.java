package com.insync.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.autowiring.Employee;

public class EmployeeDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Autowiring.xml");
		Employee employee=context.getBean("employee",Employee.class);
		employee.displayEmployeeDetails();
	}

}
