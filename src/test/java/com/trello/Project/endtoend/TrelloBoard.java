package com.trello.Project.endtoend;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.trello.Project.Genaricutility.BaseClass;
import com.trello.Project.pomRepository.TrelloBoardPage;
import com.trello.Project.pomRepository.TrelloCreateandDeleteBoard;
import com.trello.Project.pomRepository.TrelloEmailPage;
import com.trello.Project.pomRepository.TrelloHomePage;
import com.trello.Project.pomRepository.TrelloListTitle;
import com.trello.Project.pomRepository.TrelloLogOutPage;
import com.trello.Project.pomRepository.TrelloPasswordPage;

public class TrelloBoard extends BaseClass {

	@Test
	public void TrelloHomePageCheck() {
		WebdriverUtility.implicitiWait(driver);
		Reporter.log("Title = " + driver.getTitle());
	}

	@Test
	public void TrelloHomePagelogin() {
		WebdriverUtility.implicitiWait(driver);
		Reporter.log("Title = " + driver.getTitle());
		TrelloBoardPage LoginButton = new TrelloBoardPage(driver);
		LoginButton.getLogintoTrello().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL " + driver.getCurrentUrl());

	}

	@Test
	public void LoginInToTrello() throws IOException {
		WebdriverUtility.implicitiWait(driver);
		Reporter.log("Title = " + driver.getTitle());

		TrelloBoardPage LoginButton = new TrelloBoardPage(driver);
		LoginButton.getLogintoTrello().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());

		TrelloEmailPage TrelloEnterEmailTextField = new TrelloEmailPage(driver);
		WebdriverUtility.implicitiWait(driver);
		WebdriverUtility.waitUntillElementToBeClickable(driver, TrelloEnterEmailTextField.getEnterEmailIntextField())
				.sendKeys(fileUtils.readCommonData("username"));
		TrelloEnterEmailTextField.getContinueButton().click();

		TrelloPasswordPage trelloEnterPasswordTextField = new TrelloPasswordPage(driver);
		WebdriverUtility.implicitiWait(driver);
		WebdriverUtility.waitUntillElementToBeClickable(driver, trelloEnterPasswordTextField.getPasswordTextField())
				.sendKeys(fileUtils.readCommonData("password"));
		trelloEnterPasswordTextField.getLoginButton().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL " + driver.getCurrentUrl());

		TrelloHomePage HomePage = new TrelloHomePage(driver);
		WebdriverUtility.implicitiWait(driver);
		HomePage.getProfileIconMenu().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL " + driver.getCurrentUrl());
		if (HomePage.getLogOutButton().isEnabled()) {
			Reporter.log("LOGOUT IS ENABLE");
		} else {
			Reporter.log("LOGOUT IS NOTENABLE");
		}
		HomePage.getLogOutButton().click();
		TrelloLogOutPage logout = new TrelloLogOutPage(driver);
		WebdriverUtility.implicitiWait(driver);
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL " + driver.getCurrentUrl());
		logout.getLogoutButton().click();

		TrelloHomePage homepageicon = new TrelloHomePage(driver);
		homepageicon.getHomePageIcon().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());
	}

	@Test
	public void TrelloCreateAndDeleteBoard() throws IOException {
		WebdriverUtility.implicitiWait(driver);
		Reporter.log("Title = " + driver.getTitle());

		TrelloBoardPage homepage = new TrelloBoardPage(driver);
		homepage.getLogintoTrello().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());

		TrelloEmailPage emailtextPage = new TrelloEmailPage(driver);
		WebdriverUtility.implicitiWait(driver);
		WebdriverUtility.waitUntillElementToBeClickable(driver, emailtextPage.getEnterEmailIntextField())
				.sendKeys(fileUtils.readCommonData("username"));
		emailtextPage.getContinueButton().click();

		TrelloPasswordPage passWordPage = new TrelloPasswordPage(driver);
		WebdriverUtility.waitUntillElementToBeClickable(driver, passWordPage.getPasswordTextField())
				.sendKeys(fileUtils.readCommonData("password"));
		passWordPage.getLoginButton().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());

		TrelloHomePage HomePage = new TrelloHomePage(driver);
		WebdriverUtility.implicitiWait(driver);
		HomePage.getProfileIconMenu().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());
		if (HomePage.getLogOutButton().isEnabled()) {
			Reporter.log("LOGOUT IS ENABLE");
		} else {
			Reporter.log("LOGOUT IS NOTENABLE");
		}
		if (HomePage.getCreateNewboard().isEnabled()) {
			Reporter.log("Create Board Button is Vissibale");
		} else {
			Reporter.log("Create Board Button is NotVissibale");
		}
		HomePage.getCreateNewboard().click();
		HomePage.getBoardTitle().sendKeys(fileUtils.readCommonData("enterlisttitletextfield"));
		WebdriverUtility.waitUntillElementToBeClickable(driver, HomePage.getBoardCreated()).click();

		TrelloCreateandDeleteBoard CraeteandDeleteBoard = new TrelloCreateandDeleteBoard(driver);
		CraeteandDeleteBoard.getShowMenuOptions().click();
		CraeteandDeleteBoard.getMoreOptions().click();
		CraeteandDeleteBoard.getCloseBoard().click();
		CraeteandDeleteBoard.getCloseButton().click();
		CraeteandDeleteBoard.getPermanentlyDeleteBoard().click();
		CraeteandDeleteBoard.getDeletebutton().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());
		WebdriverUtility.implicitiWait(driver);
		HomePage.getProfileIconMenu().click();
		HomePage.getLogOutButton().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());

		TrelloLogOutPage logout = new TrelloLogOutPage(driver);
		WebdriverUtility.implicitiWait(driver);
		logout.getLogoutButton().click();

		TrelloHomePage homepageicon = new TrelloHomePage(driver);
		homepageicon.getHomePageIcon().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());
	}

	@Test
	public void TrelloCreateListAndSwapInCreatedBoard() throws IOException, InterruptedException {
		WebdriverUtility.implicitiWait(driver);
		Reporter.log("Title = " + driver.getTitle());
		TrelloBoardPage homepage = new TrelloBoardPage(driver);
		homepage.getLogintoTrello().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());

		TrelloEmailPage emailtextPage = new TrelloEmailPage(driver);
		WebdriverUtility.implicitiWait(driver);
		WebdriverUtility.waitUntillElementToBeClickable(driver, emailtextPage.getEnterEmailIntextField())
				.sendKeys(fileUtils.readCommonData("username"));
		emailtextPage.getContinueButton().click();

		TrelloPasswordPage passWordPage = new TrelloPasswordPage(driver);
		WebdriverUtility.waitUntillElementToBeClickable(driver, passWordPage.getPasswordTextField())
				.sendKeys(fileUtils.readCommonData("password"));
		passWordPage.getLoginButton().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());

		TrelloHomePage HomePage = new TrelloHomePage(driver);
		WebdriverUtility.implicitiWait(driver);
		HomePage.getProfileIconMenu().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());
		if (HomePage.getLogOutButton().isEnabled()) {
			Reporter.log("LOGOUT IS ENABLE");
		} else {
			Reporter.log("LOGOUT IS NOTENABLE");
		}
		if (HomePage.getCreateNewboard().isEnabled()) {
			Reporter.log("Create Board Button is Vissibale");
		} else {
			Reporter.log("Create Board Button is NotVissibale");
		}
		HomePage.getCreateNewboard().click();
		HomePage.getBoardTitle().sendKeys(fileUtils.readCommonData("enterlisttitletextfield"));
		WebdriverUtility.waitUntillElementToBeClickable(driver, HomePage.getBoardCreated()).click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());

		TrelloListTitle createNewList = new TrelloListTitle(driver);
		WebdriverUtility.implicitiWait(driver);
		createNewList.getListTitleTextField().sendKeys(fileUtils.readCommonData("firstTrelloList"));
		WebdriverUtility.readActions(driver).sendKeys(Keys.ENTER).build().perform();
		WebdriverUtility.waitUntillElementToBeClickable(driver, driver.switchTo().activeElement())
				.sendKeys(fileUtils.readCommonData("SecondTrelloList"));
		WebdriverUtility.readActions(driver).sendKeys(Keys.ENTER).build().perform();
		createNewList.getAddaCard().click();
		createNewList.getEnterListForTheListCard().sendKeys(fileUtils.readCommonData("ListCardName"));
		createNewList.getEnterListForTheListCard().sendKeys(Keys.ENTER);
		WebdriverUtility.readActions(driver)
				.dragAndDrop(createNewList.getDragAndDropFrom(), createNewList.getDragAndDropTo()).build().perform();

		TrelloCreateandDeleteBoard CraeteandDeleteBoard = new TrelloCreateandDeleteBoard(driver);
		CraeteandDeleteBoard.getShowMenuOptions().click();
		CraeteandDeleteBoard.getMoreOptions().click();
		CraeteandDeleteBoard.getCloseBoard().click();
		CraeteandDeleteBoard.getCloseButton().click();
		CraeteandDeleteBoard.getPermanentlyDeleteBoard().click();
		CraeteandDeleteBoard.getDeletebutton().click();
		Reporter.log("Title = " + driver.getTitle());

		WebdriverUtility.implicitiWait(driver);
		HomePage.getProfileIconMenu().click();
		HomePage.getLogOutButton().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());

		TrelloLogOutPage logout = new TrelloLogOutPage(driver);
		logout.getLogoutButton().click();

		TrelloHomePage homepageicon = new TrelloHomePage(driver);
		homepageicon.getHomePageIcon().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());
	}

	@Test
	public void TrelloCreateMultipleListAndSwapInCreatedBoard() throws IOException {
		TrelloBoardPage BordPage = new TrelloBoardPage(driver);
		BordPage.getLogintoTrello().click();

		TrelloEmailPage EmailPage = new TrelloEmailPage(driver);
		EmailPage.getEnterEmailIntextField().sendKeys(fileUtils.readCommonData("username"));
		EmailPage.getContinueButton().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());

		TrelloPasswordPage PasswordPage = new TrelloPasswordPage(driver);
		WebdriverUtility.implicitiWait(driver);
		WebdriverUtility.waitUntillElementToBeClickable(driver, PasswordPage.getPasswordTextField())
				.sendKeys(fileUtils.readCommonData("password"));
		PasswordPage.getLoginButton().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());
		TrelloHomePage HomePage = new TrelloHomePage(driver);
		WebdriverUtility.implicitiWait(driver);
		HomePage.getProfileIconMenu().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());
		if (HomePage.getLogOutButton().isEnabled()) {
			Reporter.log("LOGOUT IS ENABLE");
		} else {
			Reporter.log("LOGOUT IS NOTENABLE");
		}
		if (HomePage.getCreateNewboard().isEnabled()) {
			Reporter.log("Create Board Button is Vissibale");
		} else {
			Reporter.log("Create Board Button is NotVissibale");
		}
		HomePage.getCreateNewboard().click();
		HomePage.getBoardTitle().sendKeys(fileUtils.readCommonData("enterlisttitletextfield"));
		WebdriverUtility.waitUntillElementToBeClickable(driver, HomePage.getBoardCreated()).click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());

		TrelloListTitle createNewList = new TrelloListTitle(driver);
		WebdriverUtility.implicitiWait(driver);
		createNewList.getListTitleTextField().sendKeys(fileUtils.readCommonData("ListNumberOne"));
		WebdriverUtility.readActions(driver).sendKeys(Keys.ENTER).build().perform();
		WebdriverUtility.waitUntillElementToBeClickable(driver, driver.switchTo().activeElement())
				.sendKeys(fileUtils.readCommonData("ListNumberTwo"));
		WebdriverUtility.readActions(driver).sendKeys(Keys.ENTER).build().perform();
		createNewList.getAddaCardOneToSelenium().click();
		createNewList.getEnterListForTheListCard().sendKeys(fileUtils.readCommonData("javaTopic1"));
		WebdriverUtility.readActions(driver).sendKeys(Keys.ENTER).build().perform();
		WebdriverUtility.waitUntillElementToBeClickable(driver, createNewList.getEnterListForTheListCard()).sendKeys(fileUtils.readCommonData("javaTopic2"));
		WebdriverUtility.readActions(driver).sendKeys(Keys.ENTER).build().perform();
		createNewList.getEnterListForTheListCard().sendKeys(fileUtils.readCommonData("SeleniumTopic1"));
		WebdriverUtility.readActions(driver).sendKeys(Keys.ENTER).build().perform();
		createNewList.getEnterListForTheListCard().sendKeys(fileUtils.readCommonData("SeleniumTopic2"));
		WebdriverUtility.readActions(driver).sendKeys(Keys.ENTER).build().perform();
		createNewList.getEnterListForTheListCard().sendKeys(fileUtils.readCommonData("SeleniumTopic3"));
		WebdriverUtility.readActions(driver).sendKeys(Keys.ENTER).build().perform();
		createNewList.getEnterListForTheListCard().sendKeys(fileUtils.readCommonData("SeleniumTopic4"));
		WebdriverUtility.readActions(driver).sendKeys(Keys.ENTER).build().perform();

		WebdriverUtility.readActions(driver).dragAndDrop(createNewList.getPickTheOopsConceptFromSelenium(),
				createNewList.getDragAndDropToJava()).build().perform();
		WebdriverUtility.readActions(driver).dragAndDrop(createNewList.getPickTheArraystConceptFromSelenium(),
				createNewList.getDragAndDropToJava()).build().perform();

		TrelloCreateandDeleteBoard CraeteandDeleteBoard = new TrelloCreateandDeleteBoard(driver);
		CraeteandDeleteBoard.getShowMenuOptions().click();
		CraeteandDeleteBoard.getMoreOptions().click();
		CraeteandDeleteBoard.getCloseBoard().click();
		CraeteandDeleteBoard.getCloseButton().click();
		CraeteandDeleteBoard.getPermanentlyDeleteBoard().click();
		CraeteandDeleteBoard.getDeletebutton().click();
		Reporter.log("Title = " + driver.getTitle());

		WebdriverUtility.implicitiWait(driver);
		HomePage.getProfileIconMenu().click();
		HomePage.getLogOutButton().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());

		TrelloLogOutPage logout = new TrelloLogOutPage(driver);
		logout.getLogoutButton().click();

		TrelloHomePage homepageicon = new TrelloHomePage(driver);
		homepageicon.getHomePageIcon().click();
		Reporter.log("Title = " + driver.getTitle());
		Reporter.log("URL = " + driver.getCurrentUrl());
		
	}

}
