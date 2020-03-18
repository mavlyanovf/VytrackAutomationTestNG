package com.vytrack.tests.components.login_navigation;

import com.vytrack.Library;
import com.vytrack.utilities.AppConstants;
import com.vytrack.utilities.SeleniumUtils;
import com.vytrack.utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class LoginTestPositive extends TestBase {



    @Test (priority = 0, groups="regression")
    public void LogInStoreManagerTest() {
        extentLogger=report.createTest("Strore Manager test");
        pages.login().login("storemanager");
        Library.sleep(10);
        String actualName = pages.login().useNameLocator.getText();
        extentLogger.info("Comparing actual and expected user name");
        Assert.assertEquals(actualName, AppConstants.STM_USER_NAME);
        Library.sleep(10);
        String actualPageName = pages.login().pageNameLocator.getText();
        extentLogger.info("Comparing actual and expected page name");
        Assert.assertEquals(actualPageName, AppConstants.DASHBOARDS_DASHBOARD_PAGE_NAME);
        pages.login().logOut();
        extentLogger.pass("Store Manager Login test pass");
    }


    @Test (priority = 1, groups="regression")
    public void LogInSalesManagerTest() {
        extentLogger=report.createTest("Sales Manager login test");
        pages.login().login("salesmanager");
        Library.sleep(10);
        String actualName = pages.login().useNameLocator.getText();
        extentLogger.info("Comparing actual and expected user name");
        Assert.assertEquals(actualName, AppConstants.SAM_USER_NAME);
        Library.sleep(10);
        String actualPageName = pages.login().pageNameLocator.getText();
        extentLogger.info("Comparing actual and expected page name");
        Assert.assertEquals(actualPageName, AppConstants.DASHBOARDS_DASHBOARD_PAGE_NAME);
        pages.login().logOut();
        extentLogger.pass("Sales Manager Login test pass");
    }

    @Test (priority = 2, groups="regression")
    public void LogInDriverTest() {
        extentLogger=report.createTest("Driver Login test");
        pages.login().login("driver");
        Library.sleep(10);
        String actualName = pages.login().useNameLocator.getText();
        extentLogger.info("Comparing actual and expected user name");
        Assert.assertEquals(actualName, AppConstants.D_USER_NAME);
        Library.sleep(10);
        String actualPageName = pages.login().pageNameLocator.getText();
        extentLogger.info("Comparing actual and expected page name");
        Assert.assertEquals(actualPageName, AppConstants.D_DASHBOARD_PAGE_NAME);
        pages.login().logOut();
        extentLogger.pass("Driver Login test pass");
    }

   }
