package com.bestbuy.pages;

import com.bestbuy.MyPageObject;

public class HomePage extends MyPageObject {

	private static final String ACCOUNT_MENU_BTN = "//button[@data-lid=\"hdr_signin\"]";
	private static final String CREATE_ACCOUNT_BTN = "//header[contains(@class,\"menu-header\")]//a[contains(@href, \"createAccount\")]";
	
	
	public void clickAccountMenu() {
		element(ACCOUNT_MENU_BTN).click();
	}
	
	public void clickCreateAccount() {
		element(CREATE_ACCOUNT_BTN).click();
	}
}
