package com.bestbuy.pages;

import com.bestbuy.MyPageObject;

public class CreateAccountPage extends MyPageObject {
	public static final String FIRST_NAME_TXT = "firstName";
	public static final String LAST_NAME_TXT = "lastName";
	public static final String EMAIL_ADDRESS_TXT = "email";
	public static final String PASSWORD_TXT = "fld-p1";
	public static final String CONFIRM_PASSWORD_TXT="reenterPassword";
	public static final String MOBILE_PHONE_NUMBER_TXT = "phone";
	public static final String CREATE_AN_ACCOUNT_BTN = "//button[@data-track=\"Create Account\"]";
	public static final String CONFIRM_PASSWORD_ERROR_LBL = "reenterPassword-text";
	
	public void enterFirstName(String firstName) {
		element(FIRST_NAME_TXT).type(firstName);
	}
	
	public void enterLastName(String lastName) {
		element(LAST_NAME_TXT).type(lastName);
	}
	
	public void enterEmailAddress(String emailAddress) {
		element(EMAIL_ADDRESS_TXT).type(emailAddress);
	}
	
	public void enterPassword(String password) {
		element(PASSWORD_TXT).type(password);
	}
	
	public void enterConfirmPassword(String confirmPassword) {
		element(PASSWORD_TXT).type(confirmPassword);
	}
	
	public void enterMobilePhoneNumber(String mobilePhoneNumber) {
		element(MOBILE_PHONE_NUMBER_TXT).type(mobilePhoneNumber);
	}
	
	public void clickCreateAnAccount() {
		element(CREATE_AN_ACCOUNT_BTN).click();
	}
	
	public String getConfirmErrMsg() {
		return element(CONFIRM_PASSWORD_ERROR_LBL).getText();
	}
}
