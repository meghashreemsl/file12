package com.wolken.wolkenapp.service;

import java.sql.SQLException;

import com.wolken.wolkenapp.dao.EnquiryDAO;
import com.wolken.wolkenapp.dao.EnquiryDAOImpl;
import com.wolken.wolkenapp.dto.EnquiryDTO;


public class EnquiryServiceImpl implements EnquiryService{
	
	EnquiryDTO enquiryDTO = new EnquiryDTO();
	
	EnquiryDAO enquiryDAO = new EnquiryDAOImpl();

	@Override
	public void validateAndSave(EnquiryDTO enquiryDTO) throws SQLException {
		// TODO Auto-generated method stub
		if(enquiryDTO!=null) {
			if(enquiryDTO.getName()!=null) {
				enquiryDAO.add(enquiryDTO);
			}else {
				System.out.println("name is not valid");
			}
		}else {
			System.out.println(" invalid");
		}
				
		
	}

}
