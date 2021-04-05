package com.wolken.wolkenapp.enquiry;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.dto.EnquiryDTO;
import com.wolken.wolkenapp.service.EnquiryService;
import com.wolken.wolkenapp.service.EnquiryServiceImpl;

//@WebServlet("/enquiry")
@WebServlet(urlPatterns ="/enquiry", loadOnStartup= +224)


public class EnquiryServlet extends HttpServlet {
	public EnquiryServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("inside the constructor" +getClass());
	}
	
	EnquiryDTO enquiryDTO = new EnquiryDTO();
	
	 EnquiryService enquiryService = new EnquiryServiceImpl();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(req, resp);
		String name = req.getParameter("name");
		String userid = req.getParameter("userid");
		int userid1 = Integer.parseInt(userid);
		String contactno = req.getParameter("contactno");
		 long contactno1 = Long.parseLong(contactno);
		 String age = req.getParameter("age");
		 int age1 = Integer.parseInt(age);
		 String place = req.getParameter("place");
		 
		 enquiryDTO.setName(name);;
		 enquiryDTO.setUserid(userid1);
		 enquiryDTO.setContactno(contactno1);
		 enquiryDTO.setPlace(place);
		 enquiryDTO.setAge(age1);
		 
		 try {
			enquiryService.validateAndSave(enquiryDTO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 PrintWriter printWriter = resp.getWriter();
		 printWriter.print(" Welcome " +name);
			
		 printWriter.flush();
		 printWriter.close();
	}

}
