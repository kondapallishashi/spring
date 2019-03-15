package com.insync.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.EmployeeWithAddress;

//This class demonstrates inheritance in beans.
//This class reuses the Employee, EmployeeWithAddress and Address classes

public class BeanInheritanceDemo {
	public static void main(String[] args ) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Employee.xml");
	EmployeeWithAddress employee=(EmployeeWithAddress)context.getBean("employeeSubObj");
	employee.showEmployeeInfo();
	}
}
