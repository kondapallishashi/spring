package com.insync.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.jdbc.Employee;
import com.insync.spring.beans.jdbc.EmployeeDaoRowMapper;


public class EmployeeJdbcRmDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("EmployeeJdbc.xml");
		EmployeeDaoRowMapper employees=(EmployeeDaoRowMapper)context.getBean("employeeDaoRm");
		List<Employee> employeesList=employees.getAllEmployeesRowMapper();
		for(Employee employee:employeesList)
			System.out.println(employee.displayEmployeeDetails());

	}
}

