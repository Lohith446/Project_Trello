package com.trello.Project.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloPasswordPage {

	
	WebDriver driver;
	
	 public TrelloPasswordPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(xpath = "//input[@name='password']")
	 private WebElement passwordTextField;
	 
	 @FindBy(xpath = "//span[text()='Log in']")
	 private WebElement loginButton;

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
}

