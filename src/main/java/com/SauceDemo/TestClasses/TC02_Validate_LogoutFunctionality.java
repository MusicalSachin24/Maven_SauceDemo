package com.SauceDemo.TestClasses;

import com.SauceDemo.POMClasses.POM_Of_All;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC02_Validate_LogoutFunctionality extends TestBaseClassForSauceDemo
{
    @Test
    public void logout() throws InterruptedException, IOException
    {
        String currentUrl = driver.getCurrentUrl();
        log.info("Current url is:--> "+currentUrl);

        POM_Of_All b = new POM_Of_All(driver);

        b.clickOnMenu();
        log.info("Menu button has been clicked successfully");

        Thread.sleep(2000);

        b.clickOnLogout();
        log.info("Logout button has been clicked successfully");

        Thread.sleep(2000);

        String givenUrl = "https://www.saucedemo.com/inventory.html";
        log.info("Given url is:-->"+givenUrl);

        Assert.assertEquals(currentUrl, givenUrl);

        log.info("Assertion has been applied.");

    }

}
