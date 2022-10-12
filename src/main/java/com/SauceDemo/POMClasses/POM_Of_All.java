package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Of_All
{
    private WebDriver driver;

    @FindBy(xpath="//input[@id='user-name']") private WebElement userName;
    public void sendToUserName()
    {
        userName.sendKeys("standard_user");
    }

    @FindBy(xpath="//input[@id='password']") private WebElement password;
    public void sendToPassword()
    {
        password.sendKeys("secret_sauce");
    }

    @FindBy(xpath="//input[@id='login-button']") private WebElement loginButton;
    public void clickOnLoginButton()
    {
        loginButton.click();
    }

    @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement sauceLabsBackpack;
    public void clickOnSauceLabsBackpack()
    {
        sauceLabsBackpack.click();
    }

    @FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement menu;
    public void clickOnMenu()
    {
        menu.click();
    }

    @FindBy(xpath="//a[@id='inventory_sidebar_link']") private WebElement allItems;
    public void clickOnAllItems()
    {
        allItems.click();
    }

    @FindBy(xpath="//a[@id='about_sidebar_link']") private WebElement about;
    //12.1
    public void clickOnAbout()
    {
        about.click();
    }

    @FindBy(xpath="//a[@id='logout_sidebar_link']") private WebElement logout;
    public void clickOnLogout()
    {
        logout.click();
    }


    public POM_Of_All(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


}
