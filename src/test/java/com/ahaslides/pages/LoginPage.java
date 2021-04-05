package com.ahaslides.pages;

import com.ahaslides.MyPageObject;

public class LoginPage extends MyPageObject{
	public static final String EMAIL_TXT = "//input[@type=\"email\"]";
	public static final String PASSWORD_TXT = "//input[@type=\"password\"]";
	public static final String LOGIN_BTN = "//span[contains(text(),\"Log In\")]//parent::button";
	

	public void enterEmail(String email) {
		element(EMAIL_TXT).type(email);
	}
	
	public void enterPassword(String password) {
		element(PASSWORD_TXT).type(password);
	}
	
	public void clickLogin() {
		element(LOGIN_BTN).click();
	}
}
