package com.inetbanking_V2.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseClass {
	
	public String baseURL = "https://demo.guru99.com/V1/index.php";
	public String userName = "mngr512454";
	public String passWord ="jUzuqyp";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe" );
		driver = new ChromeDriver();
	}
	
	
	@AfterClass
	public void teerDown() {
		driver.quit();
	}

	

}
