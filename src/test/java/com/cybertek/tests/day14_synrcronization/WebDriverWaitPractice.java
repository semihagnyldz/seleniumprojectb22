package com.cybertek.tests.day14_synrcronization;

import com.cybertek.pages.DynamicLoad2Page;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverWaitPractice {

    @Test
    public void amazon_dashBoard(){
        Driver.getDriver().get("https://www.amazon.com");
    }
    @Test
    public void dynamic_loading_test(){
        //go to http://practice.cybertekschool.com/dynamic_loading/7
        //wait until title is "Dynamic title"
        //assert message: Done is dispalyed
        //assert image is displayed

        //follow POM Model
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");

        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        DynamicLoad7Page dynamicLoad7Page= new DynamicLoad7Page();
        Assert.assertTrue(dynamicLoad7Page.doneButton.isDisplayed());
        Assert.assertTrue(dynamicLoad7Page.image.isDisplayed());



    }
    @Test
    public void dynamic_loading2_test(){
        //1. Go to http://practice.cybertekschool.com/dynamic_loading/1
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        DynamicLoad2Page dynamicLoad2Page= new DynamicLoad2Page();
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(), 10);
        //2. Click to start
        dynamicLoad2Page.startButton.click();
        //3. Wait until loading bar disappears
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad2Page.loadingBar));
        //4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicLoad2Page.usernameButton.isDisplayed());
        //5. Enter username: tomsmith
        dynamicLoad2Page.usernameButton.sendKeys("tomsmith");
        //6. Enter password: incorrectpassword
        dynamicLoad2Page.passwordButton.sendKeys("wrong");
        //7. Click to Submit button
        dynamicLoad2Page.submitButton.click();
        //8. Assert “Your password is invalid!” text is displayed.

        Assert.assertTrue(dynamicLoad2Page.errorMessage.isDisplayed());
        //Note: Follow POM Design Patter

    }
}
