package com.ahaslides.steps;

import static org.junit.Assert.assertEquals;

import com.ahaslides.models.Account;
import com.ahaslides.pages.RegisterPage;

import net.thucydides.core.annotations.Step;

public class RegisterSteps {

	RegisterPage registerPage;

	@Step
	public void register_new_account(Account account) {
		enter_email(account.getEmail());
		enter_password(account.getPassword());
		enter_fullname(account.getFullname());
		click_signup();
	}

	@Step
	public void enter_email(String email) {
		registerPage.enterTextIntoEmail(email);

	}

	@Step
	public void enter_password(String password) {
		registerPage.enterTextIntoPassword(password);

	}

	@Step
	public void enter_fullname(String fullname) {
		registerPage.enterTextIntoFullName(fullname);

	}
	
	@Step
	public void click_signup() {
		registerPage.clickSignupButton();
	}
	
	@Step
	public void should_see_error_message_correct(String expectedErrMsg) {
		assertEquals(expectedErrMsg,"Message");
	}
	
}
