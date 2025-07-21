package com.ect.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPages {

	WebDriver driver;

	public SearchPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/products']")
	WebElement productsBtn;
	
	
	
	public void clickProducts() {
		productsBtn.click();
	}
	
	
}
