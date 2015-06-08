package com.nymgo.testcase.testcategories.pricestests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nymgo.pages.application.PricesPage;
import com.nymgo.testcase.TestBase;

public class PricesTest extends TestBase{

	//	Header Tests
	@Test
	public void pricesTitleCheckTest(){
		PricesPage price = home.clickOnPricesNavigationButton("prices");
		Assert.assertEquals(price.getTitle(), "Nymgo's international call rates", "Correct Title on PricesPage");
	}
	@Test
	public void headerLogoTest(){
		PricesPage price = home.clickOnPricesNavigationButton("prices");
		Assert.assertTrue(price.isLogoDisplayed(), "Logo is displayed");
	}
	@Test
	public void clickOnHeaderLogoTest(){
		PricesPage price = home.clickOnPricesNavigationButton("prices");
		price.clickOnLogo();
		Assert.assertEquals(price.getTitle(), "Nymgo | Cheap International Calls", "Correct Title on HomePage");
	}
	@Test
	public void headerNavigationMenuTest(){
		PricesPage price = home.clickOnPricesNavigationButton("prices");
		Assert.assertEquals(price.countOfMenuNavigationButtons(), 4, "Count of buttons");
	}
	@Test
	public void headerJoinMenuTest(){
		PricesPage price = home.clickOnPricesNavigationButton("prices");
		Assert.assertEquals(price.countOfJoinMenuButtons(), 2, "Count of buttons");
	}
	
	//FOOTER tests
	@Test
	public void footerTest(){
		PricesPage price = home.clickOnPricesNavigationButton("prices");
		Assert.assertTrue(price.isFooterDisplayed(), "Footer is displayed");
	}
	@Test
	public void footerNavigagionButtonsTest(){
		PricesPage price = home.clickOnPricesNavigationButton("prices");
		Assert.assertEquals(price.countOfNavigationButtonsFooter(), 5, "Count of buttons");
	}
	@Test
	public void footerStoreButtonsTest(){
		PricesPage price = home.clickOnPricesNavigationButton("prices");
		Assert.assertEquals(price.countOfStoreButtonsFooter(), 2, "Count of buttons");
	}
	@Test
	public void footerCopiright(){
		PricesPage price = home.clickOnPricesNavigationButton("prices");
		Assert.assertTrue(price.isCopyrightAvailable(), "Copiright is available");
	}
	@Test
	public void footerPrivacyLinksTest(){
		PricesPage price = home.clickOnPricesNavigationButton("prices");
		Assert.assertEquals(price.countOfPrivacyLinks(), 2, "Count of links");
	}
	@Test
	public void footerSocialIconsTest(){
		PricesPage price = home.clickOnPricesNavigationButton("prices");
		Assert.assertEquals(price.countOfSocialIcons(), 4, "Count of icons");
	}
	@Test
	public void selectedLanguageTest(){
		PricesPage price = home.clickOnPricesNavigationButton("prices");
		Assert.assertEquals(price.getSelectedLanguage(), "English", "Selected language");
	}
	@Test
	public void languageChangeFrenchTest(){
		PricesPage price = home.clickOnPricesNavigationButton("prices").changeLanguage("Français");
		Assert.assertEquals(price.getSelectedLanguage(), "Français", "Selected language");
	}
	@Test
	public void languageChangeArabicTest(){
		PricesPage price = home.clickOnPricesNavigationButton("prices").changeLanguage("العربية");
		Assert.assertEquals(price.getSelectedLanguage(), "العربية", "Selected language");
	}
	//Prices page tests
	@Test
	public void pricesPageSectionsTest(){
		PricesPage price = home.clickOnPricesNavigationButton("prices");
		Assert.assertEquals(price.sectionsCount(), 3, "Count of sections at Prices Page");
	}
	@Test
	public void firstSectionsTest(){
		PricesPage price = home.clickOnPricesNavigationButton("prices");
		Assert.assertEquals(price.countOfElementsAtFristSection(), 2, "Count of elements on first section");
	}
	@Test
	public void secondSectionsTest(){
		PricesPage price = home.clickOnPricesNavigationButton("prices");
		Assert.assertTrue(price.searchInputHolderIsDisplayed(), "Search holder is displayed on second section");
		Assert.assertEquals(price.getTextFromSearchHolder(), "Where do you want to call", "Text from search placeholder");
	}
	
}
