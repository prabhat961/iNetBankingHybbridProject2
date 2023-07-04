package com.inetbanking_V2.testCases;

import org.testng.annotations.Test;

import com.inetbanking_V2.pageObjects.loginPage;

public class loginPageTest extends baseClass {
	@Test (priority = 1)
	public void loginTest() {
		loginPage lp = new loginPage(driver);
		lp.putUsername(userName);
		lp.putpasssword(passWord);
		lp.clickOnSubit();
	}
	
	@Test (priority = 2)
	public void titleTest() {
		String pageTitle = driver.getTitle();
		if(pageTitle.equals("GTPL Bank Manager HomePage")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}
	
	@Test (priority = 3)
	public void mainLogoTest() {
		loginPage lp = new loginPage(driver);
		if(lp.mainPageLogo()) {
		System.out.println("Test case passed");	
		}else {
		System.out.println("Test case Failed");
		}
	}
	
	@Test (priority = 4)
	public void testIconLogoTest() {
		loginPage lp = new loginPage(driver);
		if(lp.testIconLogo()) {
		System.out.println(" testIconLogo Test case passed");	
		}else {
		System.out.println("testIconLogo Test case Failed");
		}
	}
	
	@Test (priority = 5)
	public void selIconLogoTest() {
		loginPage lp = new loginPage(driver);
		if(lp.selIconLogo()) {
		System.out.println("selIconLogo Test case passed");	
		}else {
		System.out.println(" selIconLogo Test case Failed");
		}
	}
	
	@Test (priority = 6)
	public void javaIconLogoTest() {
		loginPage lp = new loginPage(driver);
		if(lp.javaIconLogo()) {
		System.out.println("javaIconLogo Test case passed");	
		}else {
		System.out.println("javaIconLogo Test case Failed");
		}
	}
	
	
	@Test (priority = 7)
	public void liveProjectLogoTest() {
		loginPage lp = new loginPage(driver);
		if(lp.liveProjectLogo()) {
		System.out.println("liveProjectLogo Test case passed");	
		}else {
		System.out.println("liveProjectLogo Test case Failed");
		}
	}

	@Test (priority = 8)
	public void countAllLink(){
		loginPage lp = new loginPage(driver);
		System.out.println("No of links present in the page:"+lp.countLinkInPage());
	}


}
	
	

