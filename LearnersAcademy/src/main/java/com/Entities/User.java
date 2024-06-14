package com.Entities;

public class User {
	
	private String userName;
	private String password;

	public String getuserName() {
		return userName;
	}

	public void setUname(String userName) {
		this.userName = userName;
		System.out.println("userName called");
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
		System.out.println("Password called");
	}

	
	

}
