package com.ahaslides.pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.ahaslides.MyPageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends MyPageObject {
	
	public static final String LOGIN_REDIRECT_LINK = "//a[contains(@class,\"login-link\")]";
	public static final String SEARCH_ACCESS_CODE_TXT ="//div[contains(@class,'box-search-accesscode')]";
	
	@FindBy(xpath = SEARCH_ACCESS_CODE_TXT)
	private WebElementFacade searchAccessCodeTxt;
	
	public void clickOnLoginLinkText() {
		element(LOGIN_REDIRECT_LINK).click();
	}
	
	public void cut(String value) {
		cutTextFrom(searchAccessCodeTxt, value);
	}
	
	private WebElementFacade uploadmode1;
	public void uploadFileToSomeWhere(String pathFile, WebDriver webdriver) {
		element(uploadmode1).click();
//		Set<String> handles = webdriver.getWindowHandles();

		
		uploadFile(pathFile, webdriver);
	}
}
