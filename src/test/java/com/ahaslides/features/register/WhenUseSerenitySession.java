package com.ahaslides.features.register;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.ahaslides.steps.RegisterSteps;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;

@RunWith(SerenityRunner.class)

public class WhenUseSerenitySession {
	@Managed(uniqueSession=true)
	public WebDriver driver;
	
	@Steps(shared=true)
	RegisterSteps registerSteps;
	
	@Test
	@WithTag("register")
	public void verify_fullname_variable_session() {
		assertEquals("Nguyễn Thị Hằng", Serenity.sessionVariableCalled("Fullname"));
	}
}
