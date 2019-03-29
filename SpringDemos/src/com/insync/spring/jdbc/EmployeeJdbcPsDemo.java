package com.insync.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.jdbc.Employee;
import com.insync.spring.beans.jdbc.EmployeeDaoPs;

public class EmployeeJdbcPsDemo {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("EmployeeJdbc.xml");
	EmployeeDaoPs employee=(EmployeeDaoPs)context.getBean("employeeDaoPs");
	employee.saveEmployeeByPreparedStatement(new Employee(8,"Gopi","Mallala",26));	
}
}
