package vn.phongvu.pages;

import net.serenitybdd.core.pages.PageObject;

public class ProductPage  extends PageObject{
	
	public static final String PRODUCT_LBL = "(//a[@class='css-1rhapru'])[{param1}]//div[contains(@class,'product-card__info')]/div[1]";
	
	public String getProductName() {
		
		String productLbl = "";
		for (int i=0; i<80; i++) {
			productLbl = element(PRODUCT_LBL.replace("{param1}",String.valueOf(i))).getText();
		}
		return productLbl;
	}
}
