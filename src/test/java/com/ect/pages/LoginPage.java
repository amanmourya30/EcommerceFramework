package com.ect.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//input[@data-qa='login-email']")
	WebElement email;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement submitBtn;
	@FindBy(css="a[href='/logout']")
	WebElement logoutBtn;
	
	public void logout() {
		logoutBtn.click();
		}
	
	public void performLogin(String usr, String pwd) {
		email.sendKeys(usr);
		password.sendKeys(pwd);
		submitBtn.click();
	}
}
