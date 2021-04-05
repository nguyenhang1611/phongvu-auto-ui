package com.ahaslides.pages;

import com.ahaslides.MyPageObject;

public class HomePage extends MyPageObject {
	
	public static final String LOGIN_REDIRECT_LINK = "//a[contains(text(),\"Log In\")]";
	
	public void clickOnLoginLinkText() {
		element(LOGIN_REDIRECT_LINK).click();
	}
}
