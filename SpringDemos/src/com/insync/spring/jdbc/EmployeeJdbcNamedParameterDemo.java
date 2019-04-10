package com.insync.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.jdbc.Employee;
import com.insync.spring.beans.jdbc.EmployeeDaoNamedParameter;

public class EmployeeJdbcNamedParameterDemo {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("EmployeeJdbc.xml");
		EmployeeDaoNamedParameter employee=(EmployeeDaoNamedParameter) context.getBean("employeeDaoNP");
		employee.saveEmployee(new Employee(9,"Rama","Kondapalli",68));
	}

}
