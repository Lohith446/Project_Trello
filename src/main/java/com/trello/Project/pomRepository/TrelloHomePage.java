package com.trello.Project.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloHomePage {

	WebDriver driver;

	public TrelloHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@data-testid='header-member-menu-button']/descendant::div[@class]")
	private WebElement profileIconMenu;

	@FindBy(xpath = "//span[text()='Log out']")
	private WebElement LogOutButton;

	@FindBy(xpath = "//div[@class='board-tile mod-add']/descendant::span[text()='Create new board']")
	private WebElement CreateNewboard;

	@FindBy(xpath = "//input[@data-testid='create-board-title-input']")
	private WebElement BoardTitle;

	@FindBy(xpath = "//button[text()='Create']")
	private WebElement BoardCreated;

	@FindBy(xpath = "//div[contains(@class,'BigNavstyles__NavBar')]/descendant::a[@data-testid='logo_link']")
	private WebElement HomePageIcon;
	
	
	
	

	public WebElement getHomePageIcon() {
		return HomePageIcon;
	}

	public WebElement getBoardTitle() {
		return BoardTitle;
	}

	public WebElement getBoardCreated() {
		return BoardCreated;
	}

	public WebElement getCreateNewboard() {
		return CreateNewboard;
	}

	public WebElement getProfileIconMenu() {
		return profileIconMenu;
	}

	public WebElement getLogOutButton() {
		return LogOutButton;
	}

}
