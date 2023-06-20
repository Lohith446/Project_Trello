package com.trello.Project.Genaricutility;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {

	/**
	 * The class WebdriverUtility helps us to perform functions related to WebDriver
	 * Methods
	 * 
	 * @author Lohith
	 */

	public void implicitiWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public boolean verifyTheCompleteURL(WebDriver driver, String expectedTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean result = wait.until(ExpectedConditions.titleIs(expectedTitle));
		return result;
	}

	public boolean verifyThePartialURL(WebDriver driver, String partialTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean result = wait.until(ExpectedConditions.titleContains(partialTitle));
		return result;
	}

	public WebDriver switchFrameAsElement(WebDriver driver, WebElement feameElement) {
		WebDriver frameDriver = driver.switchTo().frame(feameElement);
		return frameDriver;
	}

	public WebElement waitUntillElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));
		return clickableElement;
	}

	public String getTitle(WebDriver driver) {
		return getTitle(driver);
	}

	public boolean isEnable(WebDriver driver) {
		return isEnable(driver);
	}

	public java.awt.Robot Robot(WebDriver driver) throws AWTException {
		java.awt.Robot robot = new java.awt.Robot();
		return robot;

	}

	public Actions readActions(WebDriver driver) {
		Actions action = new Actions(driver);
		return action;
	}

	public void alertOkButton(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void alertDismissButton(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public void enums(WebDriver driver) {

		driver.switchTo().activeElement().sendKeys(Keys.TAB);

		driver.switchTo().activeElement().sendKeys(Keys.ENTER);

	}

	/**
	 * 
	 * @param driver
	 * @param frameIndex
	 * @return void
	 */
	public void switchToImmediateFrameByIndex(WebDriver driver, int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}

}
