package com.ahaslides.features.register;

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
	Account infor = new Account("hangnguyenycn@gmail.com", "hangnguyenycn12", "Nguyễn Thị Hằng");
	public static final String EXPECTED_ERR_MSG = "Message";
	@Managed(uniqueSession=true)
	public WebDriver driver;
	
	@Steps
	HomeSteps homeSteps;
	
	@Steps
	RegisterSteps registerSteps;
	

	@Test
//	@WithTag("ahaslides")
	public void login_with() {
		homeSteps.open_home_page();		
		registerSteps.register_new_account(infor);
		registerSteps.should_see_error_message_correct(EXPECTED_ERR_MSG);
	}
}
