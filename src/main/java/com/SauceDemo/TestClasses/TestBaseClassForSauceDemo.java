package com.SauceDemo.TestClasses;

import com.SauceDemo.POMClasses.POM_Of_All;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBaseClassForSauceDemo
{
    WebDriver driver;
    Logger log = Logger.getLogger("Maven_SauceDemo");
    @BeforeMethod
    public void setUp() throws InterruptedException
    {
        //Write your code here

        System.setProperty("webdriver.chrome.driver","F:\\Selenium All\\Chrome Driver\\SeleChrome\\chromedriver.exe" );
        driver = new ChromeDriver();
        log.info("Browser opened");

        PropertyConfigurator.configure("Maven_log4j.properties");

        driver.manage().window().maximize();
        log.info("Browser is maximized");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        log.info("Implicit wait is applied");

        driver.get("https://www.saucedemo.com/");
        log.info("Url is opened");

        Thread.sleep(2000);

        POM_Of_All a = new POM_Of_All(driver);
        a.sendToUserName();
        log.info("Entered username");
        a.sendToPassword();
        log.info("Entered password");
        a.clickOnLoginButton();
        log.info("Clicked on login button");

        log.info("End of @BeforeMethod");

    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
        log.info("Browser closed");
        log.info("End of program");
    }
}
