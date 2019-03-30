package com.insync.spring.beans.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDaoRowMapper {
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public List<Employee> getAllEmployeesRowMapper() {
		
		return jdbcTemplate.query("SELECT * FROM employees",new RowMapper<Employee>() {
				@Override
				public Employee mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
					Employee employee=new Employee();
					employee.setId(resultSet.getInt(1));
					employee.setFirstName(resultSet.getString(2));
					employee.setLastName(resultSet.getString(3));
					employee.setAge(resultSet.getInt(4));
					return employee;						
				}//End of mapRow.
	});//End of Anonymous Class
		
	}//End of getAllEmployeesRowMapper() method

}
