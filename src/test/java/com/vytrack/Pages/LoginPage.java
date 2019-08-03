package com.vytrack.Pages;

import com.vytrack.Library;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.SeleniumUtils;
import com.vytrack.utilities.VyTrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "prependedInput")
    @CacheLookup
    public WebElement username;

    @FindBy(id = "prependedInput2")
    @CacheLookup
    public WebElement password;

    @FindBy(id = "_submit")
    @CacheLookup
    public WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(),'Invalid')]")
    @CacheLookup
    public WebElement errorMessage;

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    @CacheLookup
    public WebElement useNameLocator;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    @CacheLookup
    public WebElement pageNameLocator;

    @FindBy(className = "fa-caret-down")
    @CacheLookup
    public WebElement logoutDropDownButtonLocator;


    @FindBy(xpath = "//a[contains(text(), 'Logout')]")
    @CacheLookup
    public WebElement logOutButtonLocator;

    @FindBy(xpath = "//div[contains(text(), 'Invalid user name or password.')]")
    @CacheLookup
    public WebElement InvalidLoginMessageLocator;


    public void openURL (){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    public void login(String user){
        SeleniumUtils.waitForClickablility(username, 10);
        username.sendKeys(ConfigurationReader.getProperty(user));
        SeleniumUtils.waitForClickablility(password, 10);
        password.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();

    }

    public void login(String user, String pwd){
        username.sendKeys(ConfigurationReader.getProperty(user));
        password.sendKeys(pwd);
        loginButton.click();

    }
        public void logOut(){

        SeleniumUtils.clickWithWait(logoutDropDownButtonLocator, 5);
        VyTrackUtils.waitUntilLoaderScreenDisappear(Driver.getDriver());
        logOutButtonLocator.click();

    }

}
