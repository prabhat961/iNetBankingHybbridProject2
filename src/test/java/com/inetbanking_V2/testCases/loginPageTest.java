package com.inetbanking_V2.testCases;

import org.testng.annotations.Test;

import com.inetbanking_V2.pageObjects.loginPage;

public class loginPageTest extends baseClass {
	@Test
	public void loginTest() {
		driver.get(baseURL);
		loginPage lp = new loginPage(driver);
		lp.putUsername(userName);
		lp.putpasssword(passWord);
		lp.clickOnSubit();
	}
	
	@Test
	public void titleTest() {
		String pageTitle = driver.getTitle();
		if(pageTitle.equals("GTPL Bank Manager HomePage")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}
	
	@Test
	public void mainLogoTest() {
		loginPage lp = new loginPage(driver);
		if(lp.mainPageLogo()) {
		System.out.println("Test case passed");	
		}
		System.out.println("Test case Failed");
	}
	
	@Test
	public void testIconLogoTest() {
		loginPage lp = new loginPage(driver);
		if(lp.testIconLogo()) {
		System.out.println(" testIconLogo Test case passed");	
		}
		System.out.println("testIconLogo Test case Failed");
	}
	
	@Test
	public void selIconLogoTest() {
		loginPage lp = new loginPage(driver);
		if(lp.selIconLogo()) {
		System.out.println("selIconLogo Test case passed");	
		}
		System.out.println(" selIconLogo Test case Failed");
	}
	
	@Test
	public void javaIconLogoTest() {
		loginPage lp = new loginPage(driver);
		if(lp.javaIconLogo()) {
		System.out.println("javaIconLogo Test case passed");	
		}
		System.out.println("javaIconLogo Test case Failed");
	}
	
	@Test
	public void liveProjectLogoTest() {
		loginPage lp = new loginPage(driver);
		if(lp.liveProjectLogo()) {
		System.out.println("liveProjectLogo Test case passed");	
		}
		System.out.println("liveProjectLogo Test case Failed");
	}
	
	
}
