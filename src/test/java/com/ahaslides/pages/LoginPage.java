package com.ahaslides.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import com.ahaslides.MyPageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends MyPageObject{
	public static final String EMAIL_TXT = "//input[@type='email']";
	public static final String PASSWORD_TXT = "//input[@type='password']";
	public static final String LOGIN_BTN = "//span[contains(text(),'Log In')]//parent::button";
	
	@FindBy(xpath=EMAIL_TXT)
	public WebElementFacade emailTxt;

	public void enterEmail(String email) {
		element(EMAIL_TXT).type(email);
	}
	
	public void enterPassword(String password) {
		element(PASSWORD_TXT).type(password);
	}
	
	public void clickLogin() {
		element(LOGIN_BTN).click();
	}
	
	public void paste() {
		pasteTextInto(emailTxt);
	}
	
	public void switchToLoginTab(WebDriver driver) {
		ArrayList<String> tab2 = new ArrayList<String> (driver.getWindowHandles());
		if(tab2.size()>1) {
			driver.switchTo().window(tab2.get(1));
		}
	}
}
