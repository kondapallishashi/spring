package com.insync.spring.beans.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public int saveEmployee(Employee employee) {
		String query="insert into employees values('"+employee.getId()+"','"+employee.getFirstName()+"','"
	+employee.getLastName()+"','"+employee.getAge()+"')";
		return jdbcTemplate.update(query);
	}
	
	public int updateEmployee(Employee employee) {
		/*
		String firstname=employee.getFirstName();
		String lastname=employee.getLastName();
		int age=employee.getAge();
		int id=employee.getId();
		*/
		
		//String query="update emploees set firstname="+firstname+",lastname="+lastname+",age="+age+" where id="+id;
		String query="update emploees set firstname="+employee.getFirstName()+",lastname="+employee.getLastName()+",age="+employee.getAge()+" where id="+employee.getId();
		return jdbcTemplate.update(query);
	}
	
	public int deleteEmployee(Employee employee){  
	    String query="delete from employees where id='"+employee.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
}
