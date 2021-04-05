package com.wolken.wolkenapp.dto;

public class EnquiryDTO {
	private String name;
	private int  userid;
	private Long contactno;
	private int  age;
	private String place;
	
	public EnquiryDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("inside the constructor" +getClass());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Long getContactno() {
		return contactno;
	}

	public void setContactno(Long contactno) {
		this.contactno = contactno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
