package com.trello.Project.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloListTitle {

	WebDriver driver;

	public TrelloListTitle(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Enter list title…']")
	private WebElement ListTitleTextField;

	@FindBy(xpath = "//div[@class='js-list list-wrapper list-wrapper-with-margins']/descendant::textarea[contains(.,'CreatedListOne')]/ancestor::div[@class='list js-list-content']/descendant::span[text()='Add a card']")
	private WebElement AddaCardOne;

	@FindBy(xpath = "//textarea[@placeholder='Enter a title for this card…']")
	private WebElement EnterListForTheListCard;

	@FindBy(xpath = "//div[@class='list-card-details js-card-details']/descendant::span[text()='Selenium']")
	private WebElement DragAndDropFrom;

	@FindBy(xpath = "//textarea[text()='CreatedListTwo']")
	private WebElement DragAndDropTo;

	@FindBy(xpath = "//div[@class='js-list list-wrapper list-wrapper-with-margins']/descendant::textarea[text()='Selenium']//ancestor::div[@class='list js-list-content']/descendant::span[text()='Add a card']")
	private WebElement AddaCardOneToSelenium;

	
	
	
	public WebElement getDragAndDropTo() {
		return DragAndDropTo;
	}

	public WebElement getDragAndDropFrom() {
		return DragAndDropFrom;
	}

	public WebElement getEnterListForTheListCard() {
		return EnterListForTheListCard;
	}

	public WebElement getListTitleTextField() {
		return ListTitleTextField;
	}
	public WebElement getAddaCard() {
		return AddaCardOne;
	}

	public WebElement getAddaCardOneToSelenium() {
		return AddaCardOneToSelenium;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//div[@class='list-card-details js-card-details']/descendant::span[text()='OopsConcept']")
	private WebElement PickTheOopsConceptFromSelenium;
	
	@FindBy(xpath = "//div[@class='list-card-details js-card-details']/descendant::span[text()='Arrays']")
	private WebElement PickTheArraystConceptFromSelenium;
	
	@FindBy(xpath = "//textarea[text()='Java']")
	private WebElement DragAndDropToJava;

	public WebElement getPickTheOopsConceptFromSelenium() {
		return PickTheOopsConceptFromSelenium;
	}

	public WebElement getPickTheArraystConceptFromSelenium() {
		return PickTheArraystConceptFromSelenium;
	}

	public WebElement getDragAndDropToJava() {
		return DragAndDropToJava;
	}
	
	
	
	
	
	
}