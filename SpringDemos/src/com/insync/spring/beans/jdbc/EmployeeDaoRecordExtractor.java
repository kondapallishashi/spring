package com.insync.spring.beans.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeDaoRecordExtractor {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public List<Employee> getAllEmployees() {
		//Define ResultSetExtractor anonymous class.
		return jdbcTemplate.query("SELECT * FROM employees", new ResultSetExtractor<List<Employee>>() {
			@Override
			public List<Employee> extractData(ResultSet resultSet) throws SQLException,DataAccessException {
				List<Employee> employeeList=new ArrayList<Employee>();
				while(resultSet.next()) {
					Employee employee=new Employee();
					employee.setId(resultSet.getInt(1));
					employee.setFirstName(resultSet.getString(2));
					employee.setLastName(resultSet.getString(3));
					employee.setAge(resultSet.getInt(4));
					employeeList.add(employee);
				}
				
				return employeeList;
			}
		});
	}

}
