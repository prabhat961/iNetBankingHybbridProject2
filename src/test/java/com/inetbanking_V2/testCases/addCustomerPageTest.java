package com.inetbanking_V2.testCases;

import com.inetbanking_V2.pageObjects.addCustomerPage;
import com.inetbanking_V2.pageObjects.loginPage;
import org.testng.annotations.Test;

public class addCustomerPageTest extends baseClass {
    @Test (priority = 1)
    public void addNewCustomer() throws InterruptedException {
        loginPage lp = new loginPage(driver);
        lp.putUsername(userName);
        lp.putpasssword(passWord);
        lp.clickOnSubit();

        Thread.sleep(3000);

        addCustomerPage addcust = new addCustomerPage(driver);
        addcust.clickAddNewCustomer();
        addcust.enterCustomerName("Prabhat");
        addcust.custdob("17","11","1989");
        Thread.sleep(5000);
        addcust.custaddress("INDIA");
        addcust.custcity("PAT");
        addcust.custstate("BIH");
        addcust.custpinno("800002");
        addcust.custtelephoneno("9035900819");

        String email=randomString()+"@gmail.com";
        addcust.custemailid(email);
        addcust.custpassword("abcdef");
        addcust.custsubmit();

        Thread.sleep(3000);

    }
}

