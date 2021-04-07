package com.bestbuy.models;

import com.ahaslides.models.Account.AccountBuilder;

public class Account {

	
	private String firstName;
	private String lastName;
	private String emailAdress;
	private String password;
	private String confirmPassword;
	private String mobilePhoneNumber;
	
	public Account(String firstName, String lastName, String emailAdress, String password, String confirmPassword,
			String mobilePhoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAdress = emailAdress;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}
	
	
	

}
