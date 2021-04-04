package com.ahaslides.pages;

import com.ahaslides.MyPageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends MyPageObject {
	private static final String EMAIL_LBL = "//input[@type=\"email\"]";
	private static final String PASSWORD_LBL = "//input[@type=\"password\"]";
	private static final String FULLNAME_LBL = "//input[@placeholder=\"Your full name\"]";
	private static final String SIGNUP_BTN = "//button[contains(text(),\"Sign Up\")]";
	
	@FindBy(xpath=SIGNUP_BTN)
	WebElementFacade signupBtn;
	
	public void enterTextIntoEmail(String email) {
		element(EMAIL_LBL).type(email);
	}
	
	public void enterTextIntoPassword(String password) {
		element(PASSWORD_LBL).type(password);
	}
	
	public void enterTextIntoFullName(String fullName) {
		element(FULLNAME_LBL).type(fullName);
	}
	
	public void clickSignupButton() {
		highLightElement(signupBtn);
		signupBtn.click();
	}

}
