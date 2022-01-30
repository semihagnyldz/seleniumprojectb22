package com.cybertek.tests.day13_action_pom_design;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionPractices {
    //Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
    // 2.Switch to iframe.
    // 3.Double click on the text “Double-click me to change my text color.”
    //4.Assert: Text’s “style” attribute value contains “red”.
     @Test
    public void double_click_test(){
         Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
         //Driver.getDriver().= burasi bize driver.getDriver yapio.
         Driver.getDriver().switchTo().frame("iframeResult");
         WebElement textToDoubleClick= Driver.getDriver().findElement(By.id("demo"));
         Actions actions= new Actions (Driver.getDriver());
         BrowserUtils.sleep(3);
         actions.doubleClick(textToDoubleClick);
         actions.perform();
         String expectedResult="red";
         String actual= textToDoubleClick.getAttribute("style");
         Assert.assertTrue(actual.contains(expectedResult));
     }
}
