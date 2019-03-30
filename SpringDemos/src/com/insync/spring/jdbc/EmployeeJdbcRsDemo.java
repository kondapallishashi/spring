package com.insync.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.jdbc.Employee;
import com.insync.spring.beans.jdbc.EmployeeDaoRecordExtractor;

public class EmployeeJdbcRsDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("EmployeeJdbc.xml");
		EmployeeDaoRecordExtractor employees=(EmployeeDaoRecordExtractor)context.getBean("employeeDaoRs");
		List<Employee> employeeList=employees.getAllEmployees();
		
		for(Employee employee:employeeList)
			System.out.println(employee.displayEmployeeDetails());
	}

}
