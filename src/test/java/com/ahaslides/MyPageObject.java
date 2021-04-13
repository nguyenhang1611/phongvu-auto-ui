package com.ahaslides;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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
	
	public void jSClickOn(WebElementFacade webElement) {
		evaluateJavascript("arguments[0].click();", webElement);
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
	
	public void openContentMenu(WebElementFacade webElement, String value) {
		withAction()
		.moveToElement(webElement)
		.click()
		.sendKeys(webElement, value)
		.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND)
		.contextClick()
		.build()
		.perform();
		waitABit(3000);
	
	}
	
	public void pressItemContentMenu(int indexItem) {
		Robot robot;
		try {
			robot = new Robot();
			robot.setAutoDelay(500);
			for (int i = 1; i<= indexItem; i++) {
				robot.keyPress(KeyEvent.VK_DOWN);
			}
			robot.keyPress(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
	}
	
	public void selectElementToPaste(WebElementFacade webElement) {
		withAction()
		.moveToElement(webElement)
		.click()
		.contextClick()
		.build()
		.perform();
		waitABit(3000);
	}
	
	public static void setClipboardData(String pathFile) {
		//StringSelection is a class that can be used for copy and paste operations
		StringSelection stringSelection = new StringSelection(pathFile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}
	
	
	public static void uploadFile(String fileLocation) {
		// Setting clipboard with file location
		setClipboardData(fileLocation);
		//native key strokes for COMMAND, V and ENTER keys
		Robot robot;
		try {
			robot = new Robot();

			//Windows
			/*robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);*/
			
		    // Cmd + Tab is needed since it launches a Java app and the browser looses focus
			robot.keyPress(KeyEvent.VK_META);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_META);
			robot.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			robot.delay(9000);
			System.out.print("Delay");

		    //Open Goto window
			robot.keyPress(KeyEvent.VK_META);
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_G);
			robot.keyRelease(KeyEvent.VK_META);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_G);
			robot.delay(9000);
			
			//Paste the clipboard value
			robot.keyPress(KeyEvent.VK_META);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_META);
			robot.keyRelease(KeyEvent.VK_V);
			//Press Enter key to close the Goto window and Upload window
			robot.keyPress(KeyEvent.VK_ENTER);			
			robot.keyRelease(KeyEvent.VK_ENTER);
		    robot.delay(500);
			robot.keyPress(KeyEvent.VK_ENTER);			
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			robot.delay(900);
			
			
		} catch (AWTException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
