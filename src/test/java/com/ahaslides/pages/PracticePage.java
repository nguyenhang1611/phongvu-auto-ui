package com.ahaslides.pages;

import com.ahaslides.MyPageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class PracticePage extends MyPageObject {
	
	HomePage homePage;
	LoginPage loginPage;
	
	@FindBy(id="submit-signup")
	private WebElementFacade signUpBtn; 
	
	@FindBy(xpath="//a[@href='/terms/']")
	private WebElementFacade termsOfUseLinkText; 
	
	public void scrollToFooter() {
		scrollTo(signUpBtn);
		waitABit(3000);
	}
	
	public void highlightElement() {
		highLightElement(signUpBtn);
	}
	
	public void clickTeamsOfUseLinkText() {
		jSClickOn(termsOfUseLinkText);
		waitABit(3000);
	}
	
	public void openContentMenuOnTextBox(String value) {
		openContentMenu(homePage.searchAccessCodeTxt, value);
		waitABit(3000);
	}
	
	//Bam vao copy tren context menu
	public void copyTextFromSearchBoxByMouse() {
		pressItemContentMenu(5);
		waitABit(3000);
	}
	
	//Bam vao paste tren context menu
	public void pasteToEmailTextBoxByMouse() {
		selectElementToPaste(loginPage.emailTxt);
		pressItemContentMenu(2);
		waitABit(3000);
	}
	
}

