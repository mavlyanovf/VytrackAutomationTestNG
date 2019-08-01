package com.vytrack.Pages;


import com.vytrack.utilities.Driver;
import com.vytrack.utilities.SeleniumUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralPage {

    public GeneralPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "dropdown-toggle")
    public WebElement userName;


    public WebElement MyUser;

    public WebElement MyConfiguration;

    @FindBy (xpath = "//a[.='My Calendar']")
    public WebElement MyCalendar;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement Logout;

    public void logout(){
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10 );
//        userName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='Logout']")));
        SeleniumUtils.waitPlease(5);
        userName.click();
        Logout.click();
    }

}
