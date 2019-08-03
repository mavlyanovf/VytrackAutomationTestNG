package com.vytrack.tests.components.login_navigation;

import com.github.javafaker.Faker;
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


public class LoginTestNegative extends TestBase {


    @Test (priority = 4, groups = "regression")
    public void LogInTestNegative(){
    extentLogger=report.createTest("Negative Login test");
    pages.login().login("storemanager", SeleniumUtils.getRandomPassword(8));
    String message=pages.login().InvalidLoginMessageLocator.getText();
    extentLogger.info("Checking invalid login error message");
    Assert.assertTrue(message.equals(AppConstants.LOGIN_ERROR_MESSAGE+" 22"));
    extentLogger.pass("LogIn Negative test pass");
}



}
