package com.vytrack.Pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetManagementPage {
    public FleetManagementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[contains(text(), 'Fleet')])[1]")
    public WebElement fleetButton;

    @FindBy(xpath = "(//span[contains(text(), 'Vehicles')])[1]")
    public WebElement vehicleButton;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement activitiesButton;

    @FindBy(xpath = "//span[contains(text(),'Calendar Events')]")
    public WebElement calendarEventsButton;

    @FindBy(xpath = "//div//a[contains(@class,'btn main-group btn-primary pull-right')]")
    public WebElement createCalendarEvent;

}
