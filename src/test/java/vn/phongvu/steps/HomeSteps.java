package vn.phongvu.steps;


import net.thucydides.core.annotations.Step;
import vn.phongvu.pages.HomePage;

public class HomeSteps {
	HomePage homePage;


	@Step
	public void open_home_page() {
		homePage.open();
	}
	
	@Step
	public void click_on_close_ads() {
		homePage.clickOnCloseAds();
	}
	
	@Step
	public void search_with(String searchData) {
		homePage.searchWith(searchData);
	}
	
	@Step
	public void click_search() {
		homePage.clickSearch();
	}

}
