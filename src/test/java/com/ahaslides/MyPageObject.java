package com.ahaslides;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyPageObject extends PageObject{

	public void highLightElement(WebElementFacade webElement) {
		evaluateJavascript("arguments[0].setAttribute('style', arguments[1]);", webElement, "color: red; border: 2px solix red;");
		}

	public void scrollTo(WebElementFacade webElement) {
		evaluateJavascript("arguments[0].scrollIntoView(true);", webElement);
	}
	public void cutTextFrom(WebElementFacade webElement, String value) {
		withAction()
		.moveToElement(webElement)
		.click()
		.keyDown(webElement, Keys.SHIFT)
		.sendKeys(webElement, value)
		.keyUp(webElement, Keys.SHIFT)
		.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.CONTROL)
		.keyDown(Keys.COMMAND).sendKeys("x").keyUp(Keys.CONTROL)
		.build()
		.perform();
		
	waitABit(3000);
	}
	
	public void pasteTextInto(WebElementFacade webElement) {
		withAction()
		.moveToElement(webElement)
		.click()
		.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.CONTROL)
		.contextClick()
		.build()
		.perform();
	}
}
