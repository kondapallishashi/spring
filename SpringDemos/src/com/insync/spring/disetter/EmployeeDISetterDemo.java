package com.insync.spring.disetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.di.Employee;

public class EmployeeDISetterDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("EmployeeSetter.xml");
		Employee employee=(Employee)context.getBean("employee");
		employee.displayEmployeeInfo();
		
	}

}
