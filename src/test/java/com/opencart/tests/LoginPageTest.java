package com.opencart.tests;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

	@Test (enabled=true)
	public void getPageTitleTest() {
		String title = loginPage.getPageTitle();;
		System.out.println("Title :"+ title );
	}
	
	@Test (enabled=true)
	public void getPageLogoTest() {
		String logo = loginPage.getPageLogo();	;
		System.out.println("Logo :"+ logo);
	}
	
	@Test (enabled=true)
	public void doLoginTest() {
		loginPage.doLogin();
	}
}
