package com.ahaslides.features.register;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.ahaslides.steps.HomeSteps;
import com.ahaslides.steps.LoginSteps;
import com.ahaslides.steps.PracticeSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;

@RunWith(SerenityRunner.class)
public class WhenOpenApplication {
	
	private static final String TEACHING_WEBDRIVER_ONLINE = "Teaching webdriver online";
	private static final String PATH_FILE = "/Users/hangnt/Documents/image.jpg";

	@Managed
	WebDriver webdriver;
	
	@Steps
	HomeSteps homeSteps;
	
	@Steps
	LoginSteps loginSteps;
	
	@Steps
	PracticeSteps practiceSteps;
	
	@Test
	@WithTag("open")
	public void should_see_homepage_is_visited() {
		homeSteps.open_home_page();
		homeSteps.cut_string(TEACHING_WEBDRIVER_ONLINE);
		homeSteps.click_on_login_link_text();
		loginSteps.switch_to_login_tab(webdriver);
		
		loginSteps.paste();
	}
	
	@Test
	@WithTag("upload_image")
	public void upload_image() {
		homeSteps.open_home_page();
		homeSteps.upload(PATH_FILE);
	}
	
	@Test
	@WithTag("practice_js")
	public void practice_js() {
		homeSteps.open_home_page();
		practiceSteps.practice_steps();
	}

	@Test
	@WithTag("robot_other")
	public void should_copy_paste_text_by_robot() {
		homeSteps.open_home_page();
		practiceSteps.copy_by_mouse(TEACHING_WEBDRIVER_ONLINE);
		homeSteps.click_on_login_link_text();
		loginSteps.switch_to_login_tab(webdriver);
		practiceSteps.paste_by_mouse();
		
	}
}
