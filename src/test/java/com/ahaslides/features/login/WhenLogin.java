package com.ahaslides.features.login;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.ahaslides.models.Account;
import com.ahaslides.steps.HomeSteps;
import com.ahaslides.steps.LoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;

@RunWith(SerenityRunner.class)
public class WhenLogin {
//	Account infor = new Account("hangnguyenycn@gmail.com", "hangnguyenycn12", "Nguyễn Thị Hằng");
	Account infor = Account
			.emailAdress("hangnguyenycn@gmail.com")
			.withPassword("hangnguyenycn12")
			.build(); 
	@Managed
	//(uniqueSession=true)
	public WebDriver driver;
	
	@Steps
	HomeSteps homeSteps;
	
	@Steps
	LoginSteps loginSteps;
	

	@Test
	@WithTag("ahaslides-login")
	public void login_with() {
		homeSteps.open_home_page();
		homeSteps.click_on_login_link_text();
		
		loginSteps.login_with(infor);
		loginSteps.fullname_should_as(infor.getFullname());
	}
}
