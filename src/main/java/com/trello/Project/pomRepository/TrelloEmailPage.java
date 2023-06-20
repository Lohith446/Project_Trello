package com.trello.Project.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloEmailPage {

	WebDriver driver;
	 
	public TrelloEmailPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//input[@id='user']")
	private WebElement enterEmailIntextField;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;

	
	public WebElement getEnterEmailIntextField() {
		return enterEmailIntextField;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}
	
	
	
	
}
