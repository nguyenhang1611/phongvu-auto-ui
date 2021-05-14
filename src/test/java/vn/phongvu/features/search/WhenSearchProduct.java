package vn.phongvu.features.search;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import vn.phongvu.steps.HomeSteps;
import vn.phongvu.steps.ProductSteps;

public class WhenSearchProduct {
	private static final String SEARCH_DATA = "Điện thoại di động";

	@Managed
	WebDriver webdriver;
	
	@Steps
	HomeSteps homeSteps;
	
	@Steps
	ProductSteps productSteps;
	
	@Test
	@WithTag("open")
	public void should_see_product_name_in_search_result_contain() {
		homeSteps.open_home_page();
		homeSteps.click_on_close_ads();
		homeSteps.search_with(SEARCH_DATA);
		homeSteps.click_search();
		
		productSteps.product_name_should_as(SEARCH_DATA);
	}
}
