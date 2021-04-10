package com.bestbuy.features.register;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.bestbuy.models.Account;
import com.bestbuy.steps.serenity.CreateAccountSteps;
import com.bestbuy.steps.serenity.HomeSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;

@RunWith(SerenityRunner.class)
public class WhenCreateAnAccount{
	
	Account infor = new Account("nguyen", "hang", "hangnguyenycn@gmail.com", "1234567890@A@", "1234555555", "0976668888");
	public static final String CONFIRM_PASSWORD_EXPECTED_ERR_MSG = "Passwords do not match.";

//	Account infor = new Account.fistName().withLastName().withEmailAdress()
//			.withPassWord()
//			.withConfirmPassword()
//			.withMobilePhoneNumber()
//			.build();
	
	@Managed(uniqueSession=true)
	WebDriver driver;
	
	@Steps
	HomeSteps homeSteps;
	
	@Steps
	CreateAccountSteps createAccountSteps;
	
	
	@Pending @Test
	@WithTag("best")
	public void create_an_account_with(Account infor) {
		homeSteps.redirect_to_create_account();
		
		createAccountSteps.create_account_with_infor(infor);
		
		createAccountSteps.should_see_error_message(CONFIRM_PASSWORD_EXPECTED_ERR_MSG);
	}
	

}
