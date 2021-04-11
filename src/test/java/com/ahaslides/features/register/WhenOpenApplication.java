package com.ahaslides.features.register;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.ahaslides.steps.HomeSteps;
import com.ahaslides.steps.LoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;

@RunWith(SerenityRunner.class)
public class WhenOpenApplication {
	
	private static final String TEACHING_WEBDRIVER_ONLINE = "Teaching webdriver online";

	@Managed
	WebDriver webdriver;
	
	@Steps
	HomeSteps homeSteps;
	
	@Steps
	LoginSteps loginSteps;
	
	
	@Test
	@WithTag("open")
	public void should_see_homepage_is_visited() {
		homeSteps.open_home_page();
		homeSteps.cut_string(TEACHING_WEBDRIVER_ONLINE);
		homeSteps.click_on_login_link_text();
		loginSteps.switch_to_login_tab(webdriver);
		
		loginSteps.paste();
	}

}
