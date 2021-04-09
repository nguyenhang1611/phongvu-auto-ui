package com.ahaslides.capabilites.firefox;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.serenitybdd.core.webdriver.enhancers.BeforeAWebdriverScenario;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.SupportedWebDriver;

public class FirefoxCapabilityEnhancer implements BeforeAWebdriverScenario {

	@Override
	public DesiredCapabilities apply(EnvironmentVariables environmentVariables, SupportedWebDriver driver,
			TestOutcome testOutcome, DesiredCapabilities capabilities) {
		// 1. Profile
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.startup.homepage", "http://www.google.com");
		profile.setPreference("browser.privatebrowsing.autostart", true);

		// 2. DesiredCapabilities
		capabilities.setCapability(CapabilityType.TAKES_SCREENSHOT, false);
		capabilities.setCapability(FirefoxDriver.PROFILE, profile);
		capabilities.setJavascriptEnabled(true);
		capabilities.setCapability("networkConnectionEnabled", false);
		capabilities.setCapability("browserConnectionEnabled", false);

		return capabilities;
	}
}
