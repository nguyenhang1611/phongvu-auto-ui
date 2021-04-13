package com.ahaslides.steps;

import com.ahaslides.pages.PracticePage;

import net.thucydides.core.annotations.Step;

public class PracticeSteps {
	
	PracticePage onPracticePage;
	
	
	@Step
	public void practice_steps() {
		onPracticePage.scrollToFooter();
		onPracticePage.highlightElement();
		onPracticePage.clickTeamsOfUseLinkText();
	}
	;;
	@Step
	public void copy_by_mouse(String value) {
		onPracticePage.openContentMenuOnTextBox(value);
		onPracticePage.copyTextFromSearchBoxByMouse();
	}
	
	@Step
	public void paste_by_mouse() {
		onPracticePage.pasteToEmailTextBoxByMouse();
	}
}
