package com.SauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03 extends New_TBC01

{
    @Test
    public void validateLogin()
    {
        String actualUrl = driver.getCurrentUrl();
        log.info("Actual url is:--> "+actualUrl);

        String givenUrl = "https://www.saucedemo.com/inventory.html";
        log.info("Given url is:--> "+givenUrl);

        Assert.assertEquals(actualUrl, givenUrl);
    }

}
