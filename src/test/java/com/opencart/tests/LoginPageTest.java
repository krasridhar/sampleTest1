package com.opencart.tests;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

	@Test
	public void getPageTitleTest() {
		String title = loginPage.getPageTitle();;
		System.out.println("Title :"+ title );
	}
	
	@Test
	public void getPageLogoTest() {
		String logo = loginPage.getPageLogo();	;
		System.out.println("Logo :"+ logo);
	}
	
	@Test
	public void doLoginTest() {
		loginPage.doLogin();
	}
}
