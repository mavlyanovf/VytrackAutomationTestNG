package com.vytrack.tests.smoke_tests;

import com.vytrack.utilities.TestBase;

//import com.vytrack.Library;
//import com.vytrack.Pages.FleetManagementPage;
//import com.vytrack.Pages.HomePage;
//import com.vytrack.utilities.ConfigurationReader;
//import com.vytrack.utilities.TestBase;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import java.util.concurrent.TimeUnit;
//
public class MenuOptionsTest extends TestBase {
//
//HomePage homePage=new HomePage();
//FleetManagementPage fleetManagementPage=new FleetManagementPage();
//
//
//public void logIn(String user){
//
//    homePage.userName.sendKeys(ConfigurationReader.getProperty(user));
//    homePage.password.sendKeys(ConfigurationReader.getProperty("password"));
//    homePage.logInButton.click();
//}
//
//  /*Login to Vytrack as a driver
//    Navigate to Fleet à Vehicles, verify page title Car - Entities - System - Car - Entities -
//    System, page name All Cars (updated)*/
//
//    @Test
//    public void verifyCars(){
//    logIn("driver");
//    WebDriverWait wait=new WebDriverWait(driver, 10);
//    wait.until(ExpectedConditions.elementToBeClickable(fleetManagementPage.fleetButton)).click();
//    wait.until(ExpectedConditions.elementToBeClickable(fleetManagementPage.vehicleButton)).click();
//    String actualPageName=
//     wait.until(ExpectedConditions.visibilityOf(driver.
//     findElement(By.xpath("//h1[contains(text(), 'Cars')]")))).getText();
//    Assert.assertEquals(actualPageName,"Cars");
//    String expectedPageTitle="Car - Entities - System - Car - Entities - System";
//    Assert.assertEquals(driver.getTitle(),expectedPageTitle);
//
//}
//
//  //Navigate to Customers à Accounts, verify page title Accounts - Customers, verify page
//    //name Accounts
//
//    @Test
//    public void verifyAccounts(){
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//    logIn("driver");
//        Library.sleep(3);
//        driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Customers')]")).click();
//        Library.sleep(3);
//        driver.findElement(By.xpath("//span[contains(text(),'Accounts')]")).click();
//        Library.sleep(3);
//        String pageName=driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
//        String expected="Accounts";
//        String actualTitle=driver.getTitle();
//        String expectedTitle="Accounts - Customers";
//        Assert.assertEquals(pageName,expected);
//        Library.sleep(3);
//        Assert.assertEquals(actualTitle,expectedTitle);
//        Library.sleep(3);
//    }
//    @Test
//    public void verifyContacts(){
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        logIn("driver");
//        Library.sleep(3);
//        driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Customers')]")).click();
//        Library.sleep(3);
//        driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
//        Library.sleep(3);
//        String pageName=driver.findElement(By.xpath("//div[@class='pull-left']/h1[@class='oro-subtitle']")).getText();
//        String expected="Contacts";
//        String actualTitle=driver.getTitle();
//        String expectedTitle="Contacts - Customers";
//        Assert.assertEquals(pageName,expected);
//        Library.sleep(3);
//        Assert.assertEquals(actualTitle,expectedTitle);
//        Library.sleep(3);
//    }
//    @Test
//    public void verifyCalendarEvents(){
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//    logIn("driver");
//        Library.sleep(3);
//        driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Activities')]")).click();
//        Library.sleep(3);
//        driver.findElement(By.xpath("//span[contains(text(),'Calendar Events')]")).click();
//        Library.sleep(3);
//        String pageName=driver.findElement(By.xpath("//div[@class='pull-left']/h1[@class='oro-subtitle']")).getText();
//        String expected="Calendar Events";
//        String actualTitle=driver.getTitle();
//        String expectedTitle="Calendar Events - Activities";
//        Assert.assertEquals(pageName,expected);
//        Library.sleep(3);
//        Assert.assertEquals(actualTitle,expectedTitle);
//        Library.sleep(3);
//    }
////Navigate to Dashboards à Dashboard, verify page title Dashboard - Dashboards, verify
////page name Dashboard
//    @Test
//    public void verifyDashboard(){
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        logIn("storemanager");
//        Library.sleep(3);
//        driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Dashboards')]")).click();
//        Library.sleep(3);
//        driver.findElement(By.xpath("//span[contains(text(),'Dashboards')]")).click();
//        Library.sleep(3);
//        String pageName=driver.findElement(By.xpath("//div[@class='pull-left']/h1[@class='oro-subtitle']")).getText();
//        String expected="Dashboard";
//        String actualTitle=driver.getTitle();
//        String expectedTitle="Dashboard";
//        Assert.assertEquals(pageName,expected);
//        Library.sleep(3);
//        Assert.assertEquals(actualTitle,expectedTitle);
//        Library.sleep(3);
//    }
////Navigate to Fleet à Vehicles, verify page title Car - Entities - System - Car - Entities –
////System, page name Cars
//    @Test
//    public void verifyCarsManager(){
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        //Login to Vytrack as a store manager
//        logIn("storemanager");
//        Library.sleep(3);
//
//        driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Fleet')]")).click();
//        Library.sleep(3);
//        driver.findElement(By.xpath("//span[contains(text(),'Vehicles')]")).click();
//        Library.sleep(3);
//        String pageName=driver.findElement(By.xpath("//div[@class='btn btn-link dropdown-toggle ']/h1[@class='oro-subtitle']")).getText();
//        String expected="All Cars";
//        String actualTitle=driver.getTitle();
//        String expectedTitle="All - Car - Entities - System - Car - Entities - System";
//        Assert.assertEquals(pageName,expected);
//        Library.sleep(3);
//        Assert.assertEquals(actualTitle,expectedTitle);
//        Library.sleep(3);
//    }
//
////Navigate to Customers à Accounts, verify page title Accounts - Customers, verify page
////name Accounts
//    @Test
//    public void verifyAccountsCustomer(){
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        //Login to Vytrack as a store manager
//        logIn("storemanager");
//        Library.sleep(3);
//
//        driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Customers')]")).click();
//        Library.sleep(3);
//        driver.findElement(By.xpath("//span[contains(text(),'Accounts')]")).click();
//        Library.sleep(3);
//        String pageName=driver.findElement(By.xpath("//div[@class='btn btn-link dropdown-toggle ']/h1[@class='oro-subtitle']")).getText();
//        String expected="All Accounts";
//        String actualTitle=driver.getTitle();
//        String expectedTitle="All - Accounts - Customers";
//        Assert.assertEquals(pageName,expected);
//        Library.sleep(3);
//        Assert.assertEquals(actualTitle,expectedTitle);
//        Library.sleep(3);
//    }
//
//
//    @Test
//    public void verifyCustomerContacts(){
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        //Login to Vytrack as a store manager
//        logIn("storemanager");
//        Library.sleep(3);
//
//        driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Customers')]")).click();
//        Library.sleep(3);
//        driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
//        Library.sleep(3);
//        String pageName=driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
//        String expected="All Contacts";
//        String actualTitle=driver.getTitle();
//        String expectedTitle="All - Contacts - Customers";
//        Assert.assertEquals(pageName,expected);
//        Library.sleep(3);
//        Assert.assertEquals(actualTitle,expectedTitle);
//        Library.sleep(3);
//    }
//    @Test
//    public void verifySalesOpportunities(){
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        //Login to Vytrack as a store manager
//        logIn("storemanager");
//        Library.sleep(3);
//
//        driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Sales')]")).click();
//        Library.sleep(3);
//        driver.findElement(By.xpath("//span[contains(text(),'Opportunities')]")).click();
//        Library.sleep(3);
//        String pageName=driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
//        String expected="Open Opportunities";
//        String actualTitle=driver.getTitle();
//        String expectedTitle="Open Opportunities - Opportunities - Sales";
//        Assert.assertEquals(pageName,expected);
//        Library.sleep(3);
//        Assert.assertEquals(actualTitle,expectedTitle);
//        Library.sleep(3);
//    }
//    @Test
//    public void verifyActiviesCalls(){
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        //Login to Vytrack as a store manager
//        logIn("storemanager");
//        Library.sleep(3);
//
//        driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Activities')]")).click();
//        Library.sleep(3);
//        driver.findElement(By.xpath("//span[contains(text(),'Calls')]")).click();
//        Library.sleep(3);
//        String pageName=driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
//        String expected="All Calls";
//        String actualTitle=driver.getTitle();
//        String expectedTitle="All - Calls - Activities";
//        Assert.assertEquals(pageName,expected);
//        Library.sleep(3);
//        Assert.assertEquals(actualTitle,expectedTitle);
//        Library.sleep(3);
//    }
//
//
//    @Test
//    public void verifyActiviesCalendarEvents(){
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        //Login to Vytrack as a store manager
//        logIn("storemanager");
//        Library.sleep(3);
//
//        driver.findElement(By.xpath("//span[@class='title title-level-1'][contains(text(),'Activities')]")).click();
//        Library.sleep(3);
//        driver.findElement(By.xpath("//span[contains(text(),'Calendar Events')]")).click();
//        Library.sleep(3);
//        String pageName=driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
//        String expected="All Calendar Events";
//        String actualTitle=driver.getTitle();
//        String expectedTitle="All - Calendar Events - Activities";
//        Assert.assertEquals(pageName,expected);
//        Library.sleep(3);
//        Assert.assertEquals(actualTitle,expectedTitle);
//        Library.sleep(3);
//    }




}
