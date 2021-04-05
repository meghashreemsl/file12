package com.wolken.wolkenapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wolken.wolkenapp.dto.EnquiryDTO;

public class EnquiryDAOImpl implements EnquiryDAO {

	@Override
	public void add(EnquiryDTO enquiryDTO) throws SQLException {
		// TODO Auto-generated method stub
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");  
			try(Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306?user=root&password=Msk@9620507639")){
			try (PreparedStatement preparedStatements = con.prepareStatement("insert into jdbc.enquiry_table values(?,?,?,?,?)");) {
		
				preparedStatements.setString(1, enquiryDTO.getName());
				 preparedStatements.setInt(2, enquiryDTO.getUserid());
				 preparedStatements.setLong(3, enquiryDTO.getContactno());
				 preparedStatements.setString(4, enquiryDTO.getPlace());
				 preparedStatements.setInt(5, enquiryDTO.getAge());

					preparedStatements.executeUpdate();
					System.out.println(" details added");
					preparedStatements.close();
				}
			con.close();
				
		    }
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	}

		
		