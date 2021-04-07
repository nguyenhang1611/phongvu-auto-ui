package com.bestbuy.steps.serenity;

import com.bestbuy.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class HomeSteps {
	
	HomePage homePage;
	
	@Step
	public void redirect_to_create_account() {
		open_home_page();
		click_account_menu();
		click_create_account();
	}
	
	@Step
	public void open_home_page() {
		homePage.open();
	}
	
	@Step
	public void click_account_menu() {
		homePage.clickAccountMenu();
	}
	
	@Step
	public void click_create_account() {
		homePage.clickCreateAccount();
	}

}
