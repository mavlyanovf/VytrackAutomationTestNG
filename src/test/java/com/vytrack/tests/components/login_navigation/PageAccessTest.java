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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PageAccessTest {

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

            driver.findElement(By.id("_submit")).click();
        }
        if (user.equalsIgnoreCase("storeManager")) {
            driver.findElement(By.name("_username")).sendKeys(STORE_MANAGER_USER);
            driver.findElement(By.name("_password")).sendKeys(PASS);

            driver.findElement(By.id("_submit")).click();
        }
        if (user.equalsIgnoreCase("salesManager")) {
            driver.findElement(By.name("_username")).sendKeys(SALES_MANAGER_USER);
            driver.findElement(By.name("_password")).sendKeys(PASS);

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
    public void VehicleContractsStoreManager() {

        List<String> str = Arrays.asList("salesmanager", "storemanager", "driver");
        for (String each : str) {
            logIn(each);
            Library.sleep(3);
            driver.findElement(By.xpath("//span[contains(text(), 'Fleet')]")).click();
            Library.sleep(2);
            if (each.equals("driver")) {
                driver.findElement(By.xpath("//span[contains(text(), 'Vehicle Contracts')]")).click();
                Library.sleep(2);
                String expectedMessage = "You do not have permission to perform this action.";
                String actualMessage=driver.findElement(By.xpath("//div[contains(text(),'You do not have permission to perform this action.')]")).getText();
                Library.sleep(2);
                Assert.assertTrue(actualMessage.equals(expectedMessage));
                Library.sleep(2);
                logOut();
            } else {
                driver.findElement(By.xpath("//span[contains(text(), 'Vehicle Contracts')]")).click();
                Library.sleep(2);
                Assert.assertTrue(driver.getTitle().contains("Vehicle Contract"));
                Library.sleep(5);
                logOut();
            }
        }
    }}
