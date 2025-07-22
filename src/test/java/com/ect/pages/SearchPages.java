package com.ect.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPages extends BaseClass {

	WebDriver driver;

	public SearchPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/products']")
	WebElement productsBtn;

	@FindBy(xpath = "//button[@id='submit_search']")
	WebElement submitSearch;
	@FindBy(xpath = "//input[@id='search_product']")
	WebElement searchProduct;

	@FindBy(linkText = "Add to cart")
	WebElement AddtoCart;
	
	@FindBy(xpath = "//img[@alt='ecommerce website products']")
	WebElement image;

	@FindBy(xpath = "//u[normalize-space()='View Cart']")
	WebElement ViewCartLink;
	@FindBy(css = ".btn.btn-default.check_out")
	WebElement proceedToCheckout;

	@FindBy(css = ".btn.btn-default.check_out")
	WebElement placeOrder;

	public void clickProducts() {
		productsBtn.click();
	}

	public void searchProduct() {
		clickProducts();
		searchProduct.sendKeys("Premium Polo T-Shirts");
		submitSearch.click();
//		scrollIntoView(image, driver);
		scrollIntoView(AddtoCart, driver);
		AddtoCart.click();
		ViewCartLink.click();
		proceedToCheckout.click();
	}

}
