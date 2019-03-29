package com.insync.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.jdbc.Employee;
import com.insync.spring.beans.jdbc.EmployeeDao;

public class EmployeeJdbcDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("EmployeeJdbc.xml");
		EmployeeDao employeeDao=(EmployeeDao)context.getBean("employeeDao");
		int status=employeeDao.saveEmployee(new Employee(8,"Murali","Vijay",28));
		System.out.println(status);
	}

}
