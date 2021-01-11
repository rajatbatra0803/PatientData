package com.javatpoint.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.javatpoint.model.Patient;

public class PatientRepositoryImpl {

	@Autowired
     JdbcTemplate jdbctemplate;
	
	
	public List<Patient> getpatientByName(String name) {
		return jdbctemplate.query("select name,gender,phonenumber from Patient where name like ?", new Object[]
				{"%" + name + "%" },
				new RowMapper<Patient>(){  
		    @Override  
		    public Patient mapRow(ResultSet rs, int rownumber) throws SQLException {  
		    	Patient e=new Patient();  
		       // e.setId(rs.getInt(1));  
		        e.setName(rs.getString(1));  
		        e.setGender(rs.getString(2));  
		        e.setPhoneNumber(rs.getString(3));  
		        return e;  
		    }  
		    });  
	}
	
	public void deleteByPhoneNumber(String phoneNumber) {
		 jdbctemplate.update("DELETE FROM Patient where phoneNumber = ?", 
				 phoneNumber );
	}
	
	
	
}
