package com.ahaslides.features.alert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.ahaslides.steps.AlertSteps;
import com.ahaslides.steps.HomeSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;

@RunWith(SerenityRunner.class)
public class WhenUserInteractAlertPopup {
	
	@Managed
	WebDriver webdriver;
	
	@Steps
	HomeSteps homeSteps;
	
	@Steps
	AlertSteps alertSteps;
	
	@Test
	@WithTag("alert")
	public void when_alertbox_pops_up_then_click_ok_button_to_proceed() {
		homeSteps.open_home_page();
	}
	
	@Test
	@WithTag("confirm")
	public void when_confirm_box_pops_up_then_click_OK_button_to_proceed() {
		homeSteps.open_home_page();
	}
	
	@Test
	@WithTag("confirm")
	public void when_confirm_box_pops_up_then_click_cancel_button_to_proceed() {
		homeSteps.open_home_page();
	}
	
	@Test
	@WithTag("promt")
	public void when_promt_box_pops_up_then_click_ok_button_to_proceed() {
		homeSteps.open_home_page();
	}
	
	@Test
	@WithTag("promt_cancel")
	public void when_promt_box_pops_up_then_click_cancel_button_to_proceed() {
		homeSteps.open_home_page();
		alertSteps.answer_the_prompt("Serenity online course");
		alertSteps.accept_alert_popup();
	}
	

}
