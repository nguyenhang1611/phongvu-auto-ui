package com.bestbuy.steps.serenity;

import static org.junit.Assert.assertEquals;

import com.bestbuy.models.Account;
import com.bestbuy.pages.CreateAccountPage;

import net.thucydides.core.annotations.Step;

public class CreateAccountSteps {
	
	CreateAccountPage createAccountPage;
	
	@Step
	public void create_account_with_infor(Account infor) {
		enter_first_name(infor.getFirstName());
		enter_last_name(infor.getLastName());
		enter_email_address(infor.getEmailAdress());
		enter_password(infor.getPassword());
		enter_confirm_password(infor.getConfirmPassword());
		enter_mobile_phone_number(infor.getMobilePhoneNumber());
	}
	
	@Step
	public void enter_first_name(String firstName) {
		createAccountPage.enterFirstName(firstName);
	}
	
	@Step
	public void enter_last_name(String lastName) {
		createAccountPage.enterLastName(lastName);
	}
	
	@Step
	public void enter_email_address(String emailAdress) {
		createAccountPage.enterEmailAddress(emailAdress);
	}
	
	@Step
	public void enter_password(String password) {
		createAccountPage.enterPassword(password);
	}
	
	@Step
	public void enter_confirm_password(String confirmPassword) {
		createAccountPage.enterConfirmPassword(confirmPassword);
	}
	@Step
	public void enter_mobile_phone_number(String mobilePhoneNumber) {
		createAccountPage.enterMobilePhoneNumber(mobilePhoneNumber);
	}
	
	@Step
	public void click_create_an_account() {
		createAccountPage.clickCreateAnAccount();
	}
	
	@Step
	public void should_see_error_message(String expectedErrMsg) {
		assertEquals(expectedErrMsg, createAccountPage.getConfirmErrMsg());
	}

}
