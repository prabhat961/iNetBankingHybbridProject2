package com.inetbanking_V2.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class addCustomerPage {
    WebDriver ldriver;

    public addCustomerPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(how = How.XPATH,using = "//a[normalize-space()='New Customer']")
    @CacheLookup
    WebElement newCustomerLink;

    @FindBy(how = How.NAME,using = "name")
    @CacheLookup
    WebElement custName;

    @FindBy(how = How.NAME, using = "rad1")
    @CacheLookup
    WebElement rdGender;

    @CacheLookup
    @FindBy(how = How.ID_OR_NAME, using = "dob")
    WebElement txtdob;

    @CacheLookup
    @FindBy(how = How.NAME, using = "addr")
    WebElement txtaddress;

    @CacheLookup
    @FindBy(how = How.NAME, using = "city")
    WebElement txtcity;

    @CacheLookup
    @FindBy(how = How.NAME, using = "state")
    WebElement txtstate;

    @CacheLookup
    @FindBy(how = How.NAME, using = "pinno")
    WebElement txtpinno;

    @CacheLookup
    @FindBy(how = How.NAME, using = "telephoneno")
    WebElement txttelephoneno;

    @CacheLookup
    @FindBy(how = How.NAME, using = "emailid")
    WebElement txtemailid;

    @CacheLookup
    @FindBy(how = How.NAME, using = "password")
    WebElement txtpassword;

    @CacheLookup
    @FindBy(how = How.NAME, using = "sub")
    WebElement btnSubmit;

    public void clickAddNewCustomer() {
        newCustomerLink.click();
    }
    public void enterCustomerName(String name) {
        custName.sendKeys(name);
    }
    public void custdob(String mm,String dd,String yy) {
        txtdob.sendKeys(mm);
        txtdob.sendKeys(dd);
        txtdob.sendKeys(yy);
    }

    public void custaddress(String caddress) {
        txtaddress.sendKeys(caddress);
    }

    public void custcity(String ccity) {
        txtcity.sendKeys(ccity);
    }

    public void custstate(String cstate) {
        txtstate.sendKeys(cstate);
    }

    public void custpinno(String cpinno) {
        txtpinno.sendKeys(String.valueOf(cpinno));
    }

    public void custtelephoneno(String ctelephoneno) {
        txttelephoneno.sendKeys(ctelephoneno);
    }

    public void custemailid(String cemailid) {
        txtemailid.sendKeys(cemailid);
    }

    public void custpassword(String cpassword) {
        txtpassword.sendKeys(cpassword);
    }

    public void custsubmit() {
        btnSubmit.click();
    }

}
