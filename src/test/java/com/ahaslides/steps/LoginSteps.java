package com.ahaslides.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.ahaslides.models.Account;
import com.ahaslides.pages.LoginPage;
import com.ahaslides.pages.MyPresentationPage;

import net.thucydides.core.annotations.Step;

public class LoginSteps {
	
	LoginPage loginPage;
	
	MyPresentationPage myPresentationPage;
	
	@Step
	public void login_with(Account account) {		
		enter_email(account.getEmail());
		enter_password(account.getPassword());
		click_login();
		
	}
	
	@Step
	public void fullname_should_as(String fullnameExpected) {
		assertEquals(fullnameExpected, get_fullname());
	}
	@Step
	public void enter_email(String email) {
		loginPage.enterEmail(email);
	}
	
	@Step
	public void enter_password(String password) {
		loginPage.enterPassword(password);
	}
	
	@Step
	public void click_login() {
		loginPage.clickLogin();
	}
	
	@Step
	public String get_fullname() {
		return myPresentationPage.getFullname();
	}
	
	@Step
	public void paste() {
		loginPage.paste();
	}
	
	@Step
	public void switch_to_login_tab(WebDriver driver) {
		loginPage.switchToLoginTab(driver);
	}
	
}
