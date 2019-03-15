package com.insync.spring.disetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.di.EmployeeWithAddress;

public class EmployeeWithAddressSetterDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("EmployeeSetter.xml");
		EmployeeWithAddress employee=(EmployeeWithAddress)context.getBean("employeeWithAddress");
		employee.displayEmployeeInfo();
	}

}
