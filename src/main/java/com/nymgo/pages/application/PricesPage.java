package com.nymgo.pages.application;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PricesPage extends NymgoPage{

	public PricesPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	@FindBy (how = How.XPATH, using = "//section")
	public List<WebElement> sectionCount;

	@FindBy (how = How.XPATH, using = "//*[contains(@class,'normal')]//*[contains(@*,'general')]/*")
	public List<WebElement> countOfElementsOnFirstSection;
	
	@FindBy (how = How.XPATH, using = "//*[contains(@*, 'search-input')]/input")
	public WebElement searchInputHolder;
	
	@FindBy (how = How.XPATH, using = "//*[contains(@*, 'flag')]/img")
	public WebElement flag;
	
	@FindBy (how = How.XPATH, using = "//*[contains(@*, 'flag')]/following-sibling::*[contains(@*, 'country')]")
	public WebElement country;
	
	@FindBy (how = How.XPATH, using = "//*[contains(@*,'select-currency')]")
	public WebElement currencyDropDown;
	
	/*Pay as you go block*/
	
	@FindBy (how = How.XPATH, using = "//*[contains(@*,'block-title')]//*[contains(@*,'innerPadding')]")
	public WebElement blockTitle;
	
	@FindBy (how = How.XPATH, using = "//*[contains(@class,'block-title')]/following-sibling::*/*[contains(@class, 'first')]/*[@id]/*")
	public List<WebElement> headerColumnsPayAsYouGoBlock;
	
	@FindBy (how = How.XPATH, using = "//*[contains(@*,'search-result')]//*[contains(@class,'currency-change')] | //*[contains(@*,'search-result')]//*[contains(@*,'first')]/*[contains(@*,'padd')]")
	public List<WebElement> operatorsListPayAsYouGoBlock;
	
	@FindBy (how = How.XPATH, using = "//*[contains(@*,'like-see')]/text()")
	public WebElement textLikeWhatYouSee;
	
	@FindBy (how = How.XPATH, using = "//*[contains(@*,'like-see')]/a")
	public WebElement buttonJoinNow;
	
	@FindBy (how = How.XPATH, using = "//*[contains(@*, 'browse-by-country')]/h2")
	public WebElement browseByCountry;
	
	@FindBy (how = How.XPATH, using = "//*[contains(@*, 'letter-holder')]//a")
	public List<WebElement> letterHolder;
	
	public int sectionsCount(){
		return sectionCount.size();
	}
	public int countOfElementsAtFristSection(){
		return countOfElementsOnFirstSection.size();
	}
	public boolean searchInputHolderIsDisplayed(){
		return searchInputHolder.isDisplayed();
	}
	public String getTextFromSearchHolder(){
		return searchInputHolder.getAttribute("placeholder");
	}
	public boolean flagIsDisplayed(){
		return flag.isDisplayed();
	}
	public boolean blockTitleIsDisplayed(){
		return blockTitle.isDisplayed();
	}
	public int countOfheaderColumnsPayAsYouGoBlock(){
		return headerColumnsPayAsYouGoBlock.size();
	}
	
	/*public Prices chooseCountry(String country){
		
	}*/
	
}
