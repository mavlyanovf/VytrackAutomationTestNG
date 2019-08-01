package com.vytrack.tests.components.login_navigation;

import com.github.javafaker.Faker;
import com.vytrack.Library;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestNegative {

    WebDriver driver;


//    public static final String TRUCK_DRIVER_USER="user168";
//    public static final String STORE_MANAGER_USER="storemanager201";
//    public static final String SALES_MANAGER_USER="salesmanager265";
//    //logIn method declaration
//    public void logIn(String user) {
//        Faker pass= new Faker();
////     String password=pass.name().lastName().toLowerCase()+""+pass.number().randomDigit();
//
//        System.out.println(password);
//        if (user.equalsIgnoreCase("driver")) {
//            driver.findElement(By.name("_username")).sendKeys(TRUCK_DRIVER_USER);
//            driver.findElement(By.name("_password")).sendKeys(password);
//            Library.sleep(3);
//            driver.findElement(By.id("_submit")).click();
//        }
//        if (user.equalsIgnoreCase("storeManager")) {
//            driver.findElement(By.name("_username")).sendKeys(STORE_MANAGER_USER);
//            driver.findElement(By.name("_password")).sendKeys(password);
//            Library.sleep(3);
//            driver.findElement(By.id("_submit")).click();
//        }
//        if (user.equalsIgnoreCase("salesManager")) {
//            driver.findElement(By.name("_username")).sendKeys(SALES_MANAGER_USER);
//            driver.findElement(By.name("_password")).sendKeys(password);
//            Library.sleep(3);
//            driver.findElement(By.id("_submit")).click();
//        }
//    }
//
//    public void logOut(){
//        driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
//        Library.sleep(2);
//        driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")).click();
//        Library.sleep(2);
//
//    }
//    //Before method declaration
//    @BeforeMethod
//    public void beforMethod(){
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.get("http://qa2.vytrack.com/user/login");
//        driver.manage().window().maximize();
//        Library.sleep(3);
//    }
//
//    @AfterMethod
//    public void afterMethod(){
//        Library.sleep(3);
//        driver.quit();
//    }
//
//
//@Test
//    public void LogInTestNegative(){
//        logIn("storemanager");
//    String message=driver.findElement(By.xpath("//div[contains(text(), 'Invalid user name or password.')]")).getText();
//       Assert.assertTrue(message.equals("Invalid user name or password."));
//}



}
