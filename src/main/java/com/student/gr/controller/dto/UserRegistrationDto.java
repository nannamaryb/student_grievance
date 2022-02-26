package com.student.gr.controller.dto;

public class UserRegistrationDto {

	private String  name;
	private String email;
	private String department;
	private String password;
	
	public UserRegistrationDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRegistrationDto(String name, String email, String department, String password) {
		super();
		this.name = name;
		this.email = email;
		this.department = department;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
