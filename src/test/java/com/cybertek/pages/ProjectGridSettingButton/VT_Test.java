package com.cybertek.pages.ProjectGridSettingButton;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class VT_Test {
    WebDriver driver= Driver.getDriver();

    @Test
    public void test_login() {
        driver.get("https://qa3.vytrack.com/user/login");
        VT_AllWebElements loginCredentials = new VT_AllWebElements();
        loginCredentials.username.sendKeys("User42");
        loginCredentials.password.sendKeys("UserUser123");
        loginCredentials.login.click();
        loginCredentials.fleetButton.click();
        BrowserUtils.sleep(3);
        loginCredentials.vehicleMenuButton.click();
        BrowserUtils.sleep(3);

        List<WebElement> parentOfGridButtonElement= Driver.getDriver().findElements(By.xpath("(//div[@class='actions-panel pull-right form-horizontal']//a)"));
        for(int i=0; i<parentOfGridButtonElement.size(); i++){

            if(parentOfGridButtonElement.contains(loginCredentials.gridSettingsButton)){
            }
            System.out.println("GridSetting button is at the right side");
        }



    }




}
