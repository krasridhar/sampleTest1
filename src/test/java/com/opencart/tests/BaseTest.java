package com.opencart.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.opencart.factory.DriverFactory;
import com.opencart.pages.LoginPage;
import com.opencart.pages.MyAccountPage;

public class BaseTest {

	WebDriver driver;
	DriverFactory df;
	
	LoginPage loginPage;
	MyAccountPage accountPage;
	
	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		driver = df.initDriver();
		 loginPage = new LoginPage(driver);
	}

	@AfterTest
	public void tearDown() {
		df.closeDriver();
	}

}
