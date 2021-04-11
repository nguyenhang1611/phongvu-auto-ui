package com.ahaslides.steps;

import com.ahaslides.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class HomeSteps {

	HomePage homePage;

	@Step
	public void open_home_page() {
		homePage.open();
	}
	
	@Step
	public void click_on_login_link_text() {
		homePage.clickOnLoginLinkText();
	}
	
	@Step
	public void cut_string(String value) {
		homePage.cut(value);
	}
}
