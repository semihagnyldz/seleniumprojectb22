package com.cybertek.tests.day12_action_uploads;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JSEExecutorPractices {
    @Test
    public void scroll_using_jsExecutor_test1(){
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");
        //dow casting our driver type to javascripexecutor so we can reach methods in this interface
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();

        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(5);
            js.executeScript("window.scrollBy(0, 250)");
        }


    }

    
}
