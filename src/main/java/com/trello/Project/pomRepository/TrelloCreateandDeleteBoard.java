package com.trello.Project.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloCreateandDeleteBoard {

	WebDriver driver;

	public TrelloCreateandDeleteBoard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@aria-label='Show menu']/descendant::span[@data-testid='OverflowMenuHorizontalIcon']")
	private WebElement ShowMenuOptions;

	@FindBy(xpath = "//a[contains(.,'More')]")
	private WebElement MoreOptions;

	@FindBy(xpath = "//a[contains(.,'Close board…')]")
	private WebElement CloseBoard;

	@FindBy(xpath = "//input[@value='Close']")
	private WebElement CloseButton;

	@FindBy(xpath = "//button[text()='Permanently delete board']")
	private WebElement PermanentlyDeleteBoard;

	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement Deletebutton;

	
	
	
	
	public WebElement getShowMenuOptions() {
		return ShowMenuOptions;
	}

	public WebElement getMoreOptions() {
		return MoreOptions;
	}

	public WebElement getCloseBoard() {
		return CloseBoard;
	}

	public WebElement getCloseButton() {
		return CloseButton;
	}

	public WebElement getPermanentlyDeleteBoard() {
		return PermanentlyDeleteBoard;
	}

	public WebElement getDeletebutton() {
		return Deletebutton;
	}

}
