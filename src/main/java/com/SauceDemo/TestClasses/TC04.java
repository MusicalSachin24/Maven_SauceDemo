package com.SauceDemo.TestClasses;

import org.testng.Assert;

import org.testng.annotations.Test;

import java.time.Duration;

public class TC04 extends New_TBC02
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
