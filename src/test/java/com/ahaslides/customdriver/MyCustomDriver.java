package com.ahaslides.customdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.thucydides.core.webdriver.DriverSource;

public class MyCustomDriver implements DriverSource {

    @Override
    public WebDriver newDriver(){
        // 1. Profile
    	FirefoxProfile profile = new FirefoxProfile();
    	profile.setPreference("browser.startup.homepage", "http://www.google.com");
//    	profile.setPreference("browser.privatebrowsing.autostart", true);
		
    	// 2 DesiredCapabilities
    	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		
		// 3. Options
    	FirefoxOptions options = new FirefoxOptions(capabilities);
    	options.addArguments("--headless");
    	// options.addArguments("--width=800");
    	// options.addArguments("--height=800");
//    	options.addArguments("-private");
    	
		// 4. Constructor
		return new FirefoxDriver(options);
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
