package com.trello.Project.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloHomePageCheck {
	WebDriver driver;

	public TrelloHomePageCheck(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI']/descendant::a[text()='Log in']")
	private WebElement logintoTrello;

	public WebElement getLogintoTrello() {
		return logintoTrello;
	}

}
