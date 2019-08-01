package com.vytrack.tests.components.login_navigation;

import com.vytrack.Library;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTestPositive {

    WebDriver driver;
    public static final String TRUCK_DRIVER_USER="user168";
    public static final String PASS="UserUser123";
    public static final String STORE_MANAGER_USER="storemanager201";
    public static final String SALES_MANAGER_USER="salesmanager265";
    //logIn method declaration
    public void logIn(String user) {
        if (user.equalsIgnoreCase("driver")) {
            driver.findElement(By.name("_username")).sendKeys(TRUCK_DRIVER_USER);
            driver.findElement(By.name("_password")).sendKeys(PASS);
            Library.sleep(3);
            driver.findElement(By.id("_submit")).click();
        }
        if (user.equalsIgnoreCase("storeManager")) {
            driver.findElement(By.name("_username")).sendKeys(STORE_MANAGER_USER);
            driver.findElement(By.name("_password")).sendKeys(PASS);
            Library.sleep(3);
            driver.findElement(By.id("_submit")).click();
        }
        if (user.equalsIgnoreCase("salesManager")) {
            driver.findElement(By.name("_username")).sendKeys(SALES_MANAGER_USER);
            driver.findElement(By.name("_password")).sendKeys(PASS);
            Library.sleep(3);
            driver.findElement(By.id("_submit")).click();
        }
    }

    public void logOut(){
        driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
        Library.sleep(2);
        driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")).click();
        Library.sleep(2);

    }
        //Before method declaration
        @BeforeMethod
        public void beforMethod(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.get("http://qa2.vytrack.com/user/login");
            driver.manage().window().maximize();
            Library.sleep(3);
        }

        @AfterMethod
        public void afterMethod(){
            Library.sleep(3);
            driver.quit();
        }
@Test
    public void LogInTest(){
        String expectedPageName="";
    String expectedName="";
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        logIn("storemanager");

        Library.sleep(3);
        String actualName1=driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).getText();
        expectedName="Ciara Strosin";
        Library.sleep(3);
        Assert.assertEquals(actualName1,expectedName);
        Library.sleep(3);

        String actualPageName1=driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        expectedPageName="Dashboard";

        Assert.assertEquals(actualPageName1, expectedPageName);
        Library.sleep(3);
    logOut();


    logIn("salesmanager");
    Library.sleep(3);
    String actualName2=driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).getText();
    Library.sleep(3);
    Assert.assertTrue(!actualName1.equalsIgnoreCase(actualName2));
    Library.sleep(3);

    String actualPageName2=driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();

    Assert.assertEquals(actualPageName2, expectedPageName);
    Library.sleep(3);
    logOut();

    logIn("driver");
    Library.sleep(3);
    String actualName3=driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).getText();
    Library.sleep(3);
    Assert.assertTrue(!actualName3.equalsIgnoreCase(actualName2)&&!actualName3.equalsIgnoreCase(actualName1));
    Library.sleep(3);

    String actualPageName3=driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();

    Assert.assertEquals(actualPageName2, expectedPageName);
    Library.sleep(3);
    logOut();

    }






}
