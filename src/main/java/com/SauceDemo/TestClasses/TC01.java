package com.SauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01 extends Final_TestBaseClass_For_SD
{
    @Test
    public void validateLogin()
    {
        String actualUrl1 = driver.getCurrentUrl();
        log.info("Actual url is:--> "+actualUrl1);

        String givenUrl1 = "https://www.saucedemo.com/inventory.html";
        log.info("Given url is:--> "+givenUrl1);

        Assert.assertEquals(actualUrl1, givenUrl1);
    }
}
