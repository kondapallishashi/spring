/*  This program Demonstrates JDBC Prepared Statement
 * 
 */
package com.insync.spring.beans.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class EmployeeDaoPs {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public Boolean saveEmployeeByPreparedStatement(final Employee employee){  
	    String query="insert into employees values(?,?,?,?)";  
	    return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
	    @Override  
	    public Boolean doInPreparedStatement(PreparedStatement ps)  
	            throws SQLException, DataAccessException {  
	              
	        ps.setInt(1,employee.getId());  
	        ps.setString(2,employee.getFirstName());  
	        ps.setString(3, employee.getLastName());
	        ps.setInt(4,employee.getAge());                
	        return ps.execute();  
	              
	    }  
	    });  
	}
}
