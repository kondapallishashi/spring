package com.insync.spring.beans.jdbc;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;  

public class EmployeeDaoSimpleJdbcTemplate {
	SimpleJdbcTemplate simpleJdbcTemplate;
	
	public EmployeeDaoSimpleJdbcTemplate(SimpleJdbcTemplate simpleJdbcTemplate) {
		this.simpleJdbcTemplate=simpleJdbcTemplate;
	}
	
	public int update (Employee employee){  
		String query="update employee set name=? where id=?";  
		return simpleJdbcTemplate.update(query,employee.getFirstName(),employee.getId());  
		  
		//String query="update employee set name=?,salary=? where id=?";  
		//return template.update(query,e.getName(),e.getSalary(),e.getId());  
		}  

}
