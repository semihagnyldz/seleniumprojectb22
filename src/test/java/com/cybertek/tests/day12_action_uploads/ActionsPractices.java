package com.cybertek.tests.day12_action_uploads;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {
    //Go to http://practice.cybertekschool.com/hovers
    @Test
    public void tc15_hover_test() {

        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        //locating all of the images:
        WebElement img1= Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2= Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3= Driver.getDriver().findElement(By.xpath("(//img)[3]"));
        //locating all the "user" texts:
        WebElement user1= Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2= Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3= Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        //being able to hover, need to use actions class.
        Actions actions= new Actions(Driver.getDriver());
        // 2.Hover over to first image
        actions.moveToElement(img1).perform();//actions.hover olmadfigi iicn ilk move yapioruz.

        // 3.Assert: a.“name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());
        // 4.Hover over to second image
        actions.moveToElement(img2).perform();
        // 5.Assert: a.“name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed());
        // 6.Hover over to third image
        actions. moveToElement(img3).perform();
        // 7.Confirm: a.“name: user3” is displayed
        Assert.assertTrue(user3.isDisplayed());
    }

    @Test
    public void scrolling_test(){
        Driver.getDriver().get("http://practice.cybertekschool.com/");
        //scroll down to "Powered By Cybertek School"
        Actions actions= new Actions(Driver.getDriver());
        //locate the webelement ""Powered By Cybertek School"
        WebElement cybertekSchoolLink= Driver.getDriver().findElement(By.linkText("Cybertek School"));
        //scroll using actions object
        actions.moveToElement(cybertekSchoolLink).perform();
        //scrolling up using Keys.Page_UP button
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

}
