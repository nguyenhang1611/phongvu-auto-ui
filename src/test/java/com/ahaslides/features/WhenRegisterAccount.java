package com.ahaslides.features;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.ahaslides.models.Account;
import com.ahaslides.steps.HomeSteps;
import com.ahaslides.steps.RegisterSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;

@RunWith(SerenityRunner.class)
public class WhenRegisterAccount {

	private static final String EXPECT_ERR_MSG = "Message";
	Account account = new Account("hangnguyengmail.com","12345678","Nguyen Thi Hang");

	@Managed
	WebDriver driver;

	@Steps
	HomeSteps homeSteps;

	@Steps
	RegisterSteps registerSteps;

	@Test
	@WithTag("register")
	public void create_new_account_with() {
		homeSteps.open_home_page();
		registerSteps.register_new_account(account);
		registerSteps.should_see_error_message_correct(EXPECT_ERR_MSG);
	}
}
