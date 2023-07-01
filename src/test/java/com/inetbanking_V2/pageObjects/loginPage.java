package com.inetbanking_V2.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
 WebDriver ldriver;
 
 public loginPage(WebDriver rdriver){
	 ldriver = rdriver;
	 PageFactory.initElements(rdriver, this);
	 }
 @FindBy(name ="uid")
 @CacheLookup
 WebElement userName;
 
 @FindBy(name = "password")
 @CacheLookup
 WebElement password;
 
 @FindBy(name = "btnLogin")
 @CacheLookup
 WebElement loginButton;
 
 @FindBy(xpath = "/html/body/div[3]/div/ul/li[10]/a")
 @CacheLookup
 WebElement logoutBtn;
 
 @FindBy(linkText = "Demo Site")
 @CacheLookup
 WebElement SiteLogo;
 
 @FindBy(xpath = "//tbody/tr/td[1]/a[1]/img[1]")
 @CacheLookup
 WebElement TestingLogo;
 
 @FindBy(xpath = "//tbody//tr//td//a[contains(text(),'Selenium')]")
 @CacheLookup
 WebElement SeleniumLogo;
 
 @FindBy(xpath = " //a[normalize-space()='Live Project']")
 @CacheLookup
 WebElement LiveProjectLogo;
 
 @FindBy(xpath = "//tbody/tr/td[4]/a[1]/img[1]")
 @CacheLookup
 WebElement JavaLogo;
 

 
 
 
 public void putUsername(String uname) {
	 userName.sendKeys(uname); 
 }
 
 public void putpasssword(String pwd) {
	 password.sendKeys(pwd);
 }
 
 public void clickOnSubit() {
	 loginButton.click();
 }
 
 public void clickToLogout() {
	 logoutBtn.click();
 }
 
 public boolean mainPageLogo() {
	 SiteLogo.isDisplayed();
	 return true;
 }
 
 public boolean testIconLogo() {
	 TestingLogo.isDisplayed();
	 return true;
 }
 
 public boolean selIconLogo() {
	 SeleniumLogo.isDisplayed();
	 return true;
 }
 
 public boolean javaIconLogo() {
	 JavaLogo.isDisplayed();
	 return true;
 }
 
 public boolean liveProjectLogo() {
	 LiveProjectLogo.isDisplayed();
	 return true;
 }
 
}
