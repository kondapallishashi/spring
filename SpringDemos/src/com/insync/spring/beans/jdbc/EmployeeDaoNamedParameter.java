package com.insync.spring.beans.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmployeeDaoNamedParameter {
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public EmployeeDaoNamedParameter(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate=namedParameterJdbcTemplate;
	}
	
	public void saveEmployee(Employee employee) {
		String query="INSERT INTO employees VALUES(:id,:firstname,:lastname,:age)";
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("id",employee.getId());
		map.put("firstname",employee.getFirstName());
		map.put("lastname",employee.getLastName());
		map.put("age",employee.getAge());
		
		namedParameterJdbcTemplate.execute(query,map,new PreparedStatementCallback() {
			@Override
			public Object doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
				return preparedStatement.executeUpdate();
			}
		});
	}

}
