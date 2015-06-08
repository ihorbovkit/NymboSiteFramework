package com.nymgo.pages.application;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.nymgo.pages.Page;

public class NymgoPage extends Page {
	/**
	 * This class contains footer and header. All other pages extends this class
	 */

	public NymgoPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	/* HEADER elements */

	@FindBy(how = How.XPATH, using = "//header")
	public WebElement header;

	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'logo')]//img")
	public WebElement logo;

	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'menu-full-site')]")
	public WebElement fullSiteMenu;

	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'menu-full-site')]/a")
	public List<WebElement> buttonsNavigationMenu;

	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'join-menu')]//a")
	public List<WebElement> buttonsJoinMenu;

	/* FOOTER elements */

	@FindBy(how = How.XPATH, using = "//footer")
	public WebElement footer;

	@FindBy(how = How.XPATH, using = "//footer//*[contains(@class, 'first')]//*[contains(@class, 'general')]/a")
	public List<WebElement> buttonsNavigationMenuFooter;

	@FindBy(how = How.XPATH, using = "//footer//*[contains(@class, 'stores')]//a")
	public List<WebElement> buttonsStoreFooter;

	@FindBy(how = How.XPATH, using = "//span[contains(@class, 'copyright')]")
	public WebElement copyright;

	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'terms-privacy')]//li[not(position() > last() -2)]")
	public List<WebElement> privacyLinks;

	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'hideTabMob')]")
	public WebElement languageDropDown;

	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'selected-lan')]")
	public WebElement selectedLanguage;

	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'language-list')]")
	public List<WebElement> languageBlock;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class, 'language-list')]/a")
	public List<WebElement> languages;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'social')]//a")
	public List<WebElement> socialIcons;

	public boolean isHeaderDisplayed() {
		return header.isDisplayed();
	}

	public boolean isLogoDisplayed() {
		return logo.isDisplayed();
	}

	public HomePage clickOnLogo() {
		waitForElementPresent(logo);
		logo.click();
		return PageFactory.initElements(webDriver, HomePage.class);
	}

	public int countOfMenuNavigationButtons() {
		return buttonsNavigationMenu.size();
	}

	public int countOfJoinMenuButtons() {
		return buttonsJoinMenu.size();
	}

	// Footer
	public boolean isFooterDisplayed() {
		return footer.isDisplayed();
	}

	public int countOfNavigationButtonsFooter() {
		return buttonsNavigationMenuFooter.size();
	}

	public int countOfStoreButtonsFooter() {
		return buttonsStoreFooter.size();
	}

	public boolean isCopyrightAvailable() {
		return copyright.isDisplayed();
	}

	public int countOfPrivacyLinks() {
		return privacyLinks.size();
	}

	public String getSelectedLanguage() {
		return selectedLanguage.getText();
	}

	public PricesPage changeLanguage(String language){
		waitForElementPresent(languageDropDown);
		/*added display block to choose correct language*/
		((JavascriptExecutor) webDriver).executeScript("for(var i = 0; i < document.getElementsByClassName('language-list').length; i++) {    document.getElementsByClassName('language-list')[i].style.display = 'block';}", languageBlock);
		for (int i=0; i< languages.size(); i++){
			if(languages.get(i).getText().equals(language)){
				languages.get(i).click();
				break;
			}
		}
		waitForElementPresent(languageDropDown);
		return PageFactory.initElements(webDriver, PricesPage.class);
	}

	public int countOfSocialIcons() {
		return socialIcons.size();
	}

	public PricesPage clickOnPricesNavigationButton(String buttonText) {
		waitForElementPresent(header);
		for (int i = 0; i < buttonsNavigationMenu.size(); i++) {
			if (buttonsNavigationMenu.get(i).getText()
					.equalsIgnoreCase(buttonText)) {
				buttonsNavigationMenu.get(i).click();
				break;
			}
		}
		return PageFactory.initElements(webDriver, PricesPage.class);
	}
}
