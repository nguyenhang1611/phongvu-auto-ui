package vn.phongvu.pages;

import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject{
	public static final String CLOSE_ADS = "//span[@color='#333']";
	public static final String SEARCH_TXT ="//input[contains(@class,'search-input')]";
	public static final String SEARCH_BTN ="//button[@aria-label='Search']";
	
	public void clickOnCloseAds() {
		element(CLOSE_ADS).click();
	}
	
	public void searchWith(String searchData) {
		element(SEARCH_TXT).type(searchData);
	}
	
	public void clickSearch() {
		element(SEARCH_BTN).click();
	}
}
