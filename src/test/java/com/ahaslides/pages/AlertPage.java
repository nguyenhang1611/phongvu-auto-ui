package com.ahaslides.pages;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ahaslides.MyPageObject;

public class AlertPage extends MyPageObject {
	private static final String IFRAME_RESULT = "iframeResult";
	public static final String TRY_IT_BTN = "//button[.='Try it']";
	public void answerThePromt(String answer) {
		getDriver().switchTo().frame(IFRAME_RESULT);
		$(TRY_IT_BTN).click();
		getAlert().sendKeys(answer);
	}

	public void acceptAlertPopup() {
		getAlert().accept();
	}

	public void cancelAlertPopup() {
		getAlert().dismiss();
	}

	public void waitForAlert() {
		new WebDriverWait(getDriver(), 60).ignoring(NoAlertPresentException.class)
				.until(ExpectedConditions.alertIsPresent());
	}
}
