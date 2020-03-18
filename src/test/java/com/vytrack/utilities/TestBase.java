package com.vytrack.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import static java.lang.System.getProperty;

public class TestBase {
    protected WebDriver driver;
    protected Actions actions;
    protected SoftAssert softAssert;
    protected Pages pages;


    protected static ExtentReports report;
 protected static ExtentHtmlReporter htmlReporter;


 protected static ExtentTest extentLogger;

    @Parameters("browser")
    @BeforeMethod (alwaysRun = true)
    public void setUpMethod (@Optional String browser){
        driver=Driver.getDriver(browser);
        pages=new Pages();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        actions=new Actions(driver);
        softAssert=new SoftAssert();
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("url"));


    }

////   @AfterMethod
//    public void tearDownMethod (ITestResult result) throws IOException{
//        if(result.getStatus()==ITestResult.FAILURE){
//            String screenShotLocation=SeleniumUtils.getScreenshot(result.getName());
//            extentLogger.fail(result.getName());
//            extentLogger.addScreenCaptureFromPath(screenShotLocation);
//            extentLogger.fail(result.getThrowable());
//        }else if(result.getStatus()==ITestResult.SKIP){
//            extentLogger.skip("Test case skipped: "+result.getName());
//        }
//        Driver.closeDriver();
//      softAssert.assertAll();
//    }
//
//
//
////         //ITestresult describes the result of a test.
////    //we can determine if test failed, passed or ignored
//    @AfterMethod (alwaysRun = true)
//    public void teardown(ITestResult result){
//        if(ITestResult.FAILURE == result.getStatus()) {
//           //if test failed get a screenshot and save the location to the image
//            String pathToTheScreenshot = SeleniumUtils.getScreenshot(result.getName());
//
//            // capture the name of a test method that failed
//            extentLogger.fail(result.getName());
//            try {
//                //to add screenshot into report
//                extentLogger.addScreenCaptureFromPath(pathToTheScreenshot);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            //to add thrown exception into report
//            extentLogger.fail(result.getThrowable());
//        }else if(result.getStatus() == ITestResult.SKIP){
//            //if test skipped, this information will appear on the report
//            extentLogger.skip("Test case skipped "+result.getName());
//        }
//        Driver.closeDriver();
//    }


@AfterMethod (alwaysRun = true)
public void tearDwon(ITestResult result) throws  IOException{
        if (result.getStatus()==ITestResult.FAILURE){
         String temp=   SeleniumUtils.getScreenShot(driver);
         htmlReporter.config().setAutoCreateRelativePathMedia(true);
         extentLogger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
        }
        report.flush();
        Driver.closeDriver();
}



   @BeforeTest(alwaysRun = true)
    public void setUpTest() {
        //initialize ExtentReporter
        report = new ExtentReports();
        //this is custom location of the report that will be generated
        //report will be generated in the current project inside
        //  folder: test-output
        //report file name: report.html
        String filePath = getProperty("user.dir") + "\\test-output\\report.html";// + name + time + ".png";

        //initialize the htmlReporter with the path to the report
        htmlReporter = new ExtentHtmlReporter(filePath);

        //Below lines are optional:

        //we attach the html
        report.attachReporter(htmlReporter);

        //testing different environment
        report.setSystemInfo("Environment", "Staging");

        //picking browser
        report.setSystemInfo("Browser", ConfigurationReader.getProperty("browser"));

        //operating system
        report.setSystemInfo("OS", getProperty("os.name"));

        //I can put testers name as well:
        report.setSystemInfo("QA Engineer", "Jumagul Haldin");

        htmlReporter.config().setDocumentTitle("Vytrack Reports");
        htmlReporter.config().setReportName("VyTrack Automated Test Reports");
//        htmlReporter.config().setTheme(Theme.DARK);

    }

    @AfterTest(alwaysRun = true)
    public void tearDownTest() {

        report.flush();

    }
}
