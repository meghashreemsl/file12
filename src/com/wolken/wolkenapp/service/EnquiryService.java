package com.wolken.wolkenapp.service;

import java.sql.SQLException;

import com.wolken.wolkenapp.dto.EnquiryDTO;

public interface EnquiryService {
	
	public void validateAndSave(EnquiryDTO enquiryDTO) throws SQLException;

}
