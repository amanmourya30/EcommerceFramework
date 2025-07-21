package com.ect.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.ect.utility.BrowserFactory;
import com.ect.utility.ConfigDataProvider;

public class BaseClass {
	public WebDriver driver;
	public LoginPage lp;
	public SearchPages sp;

	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getTestUrl());
		lp = new LoginPage(driver);
		sp = new SearchPages(driver);
	}

	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}

	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//screenshots//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//screenshots//" + testCaseName + ".png";
	}
	
	

	ConfigDataProvider config = new ConfigDataProvider();
}
