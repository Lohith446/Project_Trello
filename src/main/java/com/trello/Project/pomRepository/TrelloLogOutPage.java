package com.trello.Project.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLogOutPage {

	WebDriver driver;
	
	public TrelloLogOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath = "//span[text()='Log out']")
	private WebElement logoutButton;

	public WebElement getLogoutButton() {
		return logoutButton;
	}
}
