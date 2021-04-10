package com.ahaslides.steps;

import com.ahaslides.pages.AlertPage;

import net.thucydides.core.annotations.Step;

public class AlertSteps {

	AlertPage alertPage; 
	
	@Step
	public void answer_the_prompt(String answer) {
		alertPage.answerThePromt(answer);
		
	}

	@Step
	public void accept_alert_popup() {
		alertPage.acceptAlertPopup();
	}
	
	@Step
	public void cancel_alert_popup() {
		alertPage.cancelAlertPopup();
	}

}
