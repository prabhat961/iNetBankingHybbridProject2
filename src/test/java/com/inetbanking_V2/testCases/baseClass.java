package com.inetbanking_V2.testCases;


import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	
	public String baseURL = "https://demo.guru99.com/V1/index.php";
	public String userName = "mngr512454";
	public String passWord ="jUzuqyp";
	public static WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
	@AfterMethod
	public void teerDown() {
		driver.quit();
	}

	public static String randomString() {
		String generateString = RandomStringUtils.randomAlphanumeric(8);
		return generateString;
	}

	public static String randomNum() {
		String generateNumbers = RandomStringUtils.randomNumeric(5);
		return generateNumbers;
	}

	

}
