package com.inetbanking_V2.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static com.inetbanking_V2.testCases.baseClass.driver;

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
 
 @FindBy(xpath = "//tbody//tr//td//a[contains(text(),'Testing')]")
 @CacheLookup
 WebElement TestingLogo;
 
 @FindBy(xpath = "//tbody//tr//td//a[contains(text(),'Selenium')]")
 @CacheLookup
 WebElement SeleniumLogo;
 
 @FindBy(xpath = "//tbody//tr//td//a[contains(text(),'Live Project')]")
 @CacheLookup
 WebElement LiveProjectLogo;
 
 @FindBy(xpath = "//a[normalize-space()='Java']")
 @CacheLookup
 WebElement JavaLogo;

 @FindBy(linkText = "Selenium")
 @CacheLookup
 WebElement selDrpDwn;
 

 
 
 
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
	 return SiteLogo.isDisplayed();
 }
 
 public boolean testIconLogo() {
	 return TestingLogo.isDisplayed();
 }
 
 public boolean selIconLogo() {
     return SeleniumLogo.isDisplayed();
 }
 
 public boolean javaIconLogo() {
     return JavaLogo.isDisplayed();
 }
 
 public boolean liveProjectLogo() {
	 return LiveProjectLogo.isDisplayed();
 }
 public int countLinkInPage(){
  List<WebElement> links = driver.findElements(By.tagName("a"));
  return links.size();
  }
 
}
