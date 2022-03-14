package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// private By Locators
	private By logo = By.xpath("//div[@id='logo']/h1/a");
	private By email = By.xpath("//input[@name='email']");
	private By password = By.xpath("//input[@name='password']");
	private By loginButton = By.xpath("//input[@value='Login']");
		
	
	
	// actions/methods of Login Page
	public String getPageTitle() {
		return  driver.getTitle();
	}
	
	public String getPageLogo() {
		return driver.findElement(logo).getText();
	}
	
	public MyAccountPage doLogin() {
		driver.findElement(email).sendKeys("sritest@gmail.com");
		driver.findElement(password).sendKeys("test@123");
		driver.findElement(loginButton).click();
		return new MyAccountPage();
	}
	
}
