package com.vytrack.tests.components.activites;

import com.vytrack.Library;

import com.vytrack.Pages.FleetManagementPage;

import com.vytrack.Pages.LoginPage;
import com.vytrack.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateAndTimeTest extends TestBase {

    /*
    1) Date Time, End date auto adjust
1. Log in as Valid user
2. Go to Activities -> Calendar Events
3. Click on create new calendar event
4. Change the start date to future date
5. Verify that end date changes to the same date
6. Change back the start date to today’s date
7. Verify that end date changes back to today’s date
     */


    @Test (groups ="regression")
    public void EndDateAutoAdjustTest(){
//creat new test and give the name of the test for each @Test method
//        extentLogger=report.createTest("Vytrack Date and Time test");

//     extentLogger.info("Log in");
 //  1. Log in as Valid user
    pages.login().login("storemanager");
//   2. Go to Activities -> Calendar Events
    VyTrackUtils.navigateToModule("Activities", "Calendar Events");

//    extentLogger.info("Creating new Calendar event");
    //   3. Click on create new calendar event
    SeleniumUtils.clickWithWait(pages.calendars().createCalendarEvent, 5);
    VyTrackUtils.waitUntilLoaderScreenDisappear(driver);

//    extentLogger.info("Changing date to future date");
    //  4. Change the start date to future date
    WebElement startDate=pages.calendars().startDateLocator;
    SeleniumUtils.clickWithWait(startDate,5);
    String futureDate="Aug 25, 2019";
    startDate.clear(); startDate.sendKeys(futureDate, Keys.TAB, Keys.TAB);
    SeleniumUtils.waitForVisibility(pages.calendars().endDateLocator, 10);
    Select select=new Select(pages.calendars().endMonthLocator);

//    extentLogger.info("Verifying that end date changed to the same date");
    //   5. Verify that end date changes to the same date
    String endDate=select.getFirstSelectedOption().getText();
    SeleniumUtils.waitForVisibility(pages.calendars().endDayLocator, 10);
    endDate=endDate.concat(" "+pages.calendars().endDayLocator.getText()+", 2019");
        System.out.println("End date: "+endDate+" future date: "+futureDate);
    Assert.assertEquals(endDate, futureDate);

//        extentLogger.info("Changing back to current date");
    //  6. Change back the start date to today’s date
    SeleniumUtils.waitForVisibility(pages.calendars().startDateLocator, 10);
    SeleniumUtils.doubleClick(pages.calendars().startDateLocator);
    pages.calendars().todayButtonLocator.click();

    //Getting today's date in needed format
    Format formatter = new SimpleDateFormat("MMM d, yyyy");
    String todayDate = formatter.format(new Date());

    //7. Verify that end date changes back to today’s date
        VyTrackUtils.waitUntilLoaderScreenDisappear(driver);
  SeleniumUtils.clickWithWait(pages.calendars().endDateLocator, 5);
        SeleniumUtils.waitForVisibility(pages.calendars().endMonthLocator, 15);

//    SeleniumUtils.waitForVisibility(pages.calendars().endDayLocator2, 15);
    String currentEndDate=select.getFirstSelectedOption().getText()+" "+pages.calendars().endDayLocator2.getText()+", 2019";


System.out.println("today's date :"+ todayDate+ " current date: "+currentEndDate);

// extentLogger.info("Verifying that end date changed back to current date");
 Assert.assertEquals(todayDate, currentEndDate);
//extentLogger.pass("Passed all test");




    }




}



