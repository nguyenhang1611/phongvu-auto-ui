package vn.phongvu.steps;

import static org.junit.Assert.assertTrue;

import net.thucydides.core.annotations.Step;
import vn.phongvu.pages.ProductPage;

public class ProductSteps {
	
	ProductPage productPage;
	
	@Step
	public void product_name_should_as(String productName) {
		assertTrue(productPage.getProductName().contains(productName));
	}
}
