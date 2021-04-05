package com.wolken.wolkenapp.dao;

import java.sql.SQLException;

import com.wolken.wolkenapp.dto.EnquiryDTO;

public interface EnquiryDAO {
	
	public void add(EnquiryDTO enquiryDTO) throws SQLException;

}
