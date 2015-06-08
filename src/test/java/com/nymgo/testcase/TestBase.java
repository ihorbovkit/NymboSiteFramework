package com.nymgo.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.nymgo.pages.application.HomePage;
import com.nymgo.webDriver.WebDriverFactory;


/*
 * Base class for all the test classes
 * 
 */

public class TestBase {

	protected WebDriver webDriver;
	protected HomePage home;

	@BeforeMethod
	@Parameters({ "browserName" })
	public void setup(String browserName) throws Exception {
		webDriver = WebDriverFactory.getInstance(browserName);
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		webDriver.manage().window().maximize();
		webDriver.get("http://www.nymgo.com/");
		home = PageFactory.initElements(webDriver, HomePage.class);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		if (webDriver != null) {
			WebDriverFactory.killDriverInstance();
		}
	}

}