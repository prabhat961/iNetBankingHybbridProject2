package com.inetbanking_V2.testCases;

import org.openqa.selenium.WebElement;
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

}
