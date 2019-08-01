package com.vytrack.Pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsPage {

    public CalendarEventsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(xpath="//input[starts-with(@id, 'date_selector_oro_calendar_event_form_start-uid-')]")
    public WebElement startDateLocator;

    @FindBy(xpath="//input[starts-with(@id, 'date_selector_oro_calendar_event_form_end-uid-')]")
    public WebElement endDateLocator;

    @FindBy(className = "ui-datepicker-month")
    public WebElement endMonthLocator;

    @FindBy(xpath = "//a[starts-with(@class,'ui-state-default ui-state-active')]")
    public WebElement endDayLocator;

    @FindBy(xpath = "(//a[starts-with (@class, 'ui-state-default ui-state-')])[1]")
    public WebElement endDayLocator2;

    @FindBy(xpath = "//button[.='Today']")
    public WebElement todayButtonLocator;
}
