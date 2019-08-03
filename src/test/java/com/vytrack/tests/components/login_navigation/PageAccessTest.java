package com.vytrack.tests.components.login_navigation;

import com.vytrack.Library;
import com.vytrack.utilities.AppConstants;
import com.vytrack.utilities.TestBase;
import com.vytrack.utilities.VyTrackUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class PageAccessTest extends TestBase {


    @Test
    public void VehicleContractPageAccessDriver() {

    pages.login().login("driver");
    VyTrackUtils.navigateToModule("Fleet", "Vehicle Contracts");
    String actualMessage=driver.findElement(By.xpath("//div[contains(text(),'You do not have permission to perform this action.')]")).getText();
    Assert.assertTrue(actualMessage.equals(AppConstants.D_VEHICLE_CONTRACT_ERROR));
    pages.login().logOut();
    }


    @Test
    public void VehicleContractPageAccessStoreManager() {
    pages.login().login("storemanager");
    VyTrackUtils.navigateToModule("Fleet", "Vehicle Contracts");
    Library.sleep(5);
    System.out.println(driver.getTitle());
    Assert.assertTrue(driver.getTitle().contains("Vehicle Contract"));
    pages.login().logOut();
      }

    @Test
    public void VehicleContractPageAccessSalesManager() {
     pages.login().login("salesmanager");
    VyTrackUtils.navigateToModule("Fleet", "Vehicle Contracts");
    Library.sleep(5);
    System.out.println(driver.getTitle());
    Assert.assertTrue(driver.getTitle().contains("Vehicle Contract"));
    pages.login().logOut();
    }

}
