package com.cybertek.tests.Homework.day5_homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class SeleniumEasyCheckbox {
    public static void main(String[] args) {
        //Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        // 3.Verify “Success –Check box is checked” message is NOTdisplayed.
        // 4.Click to checkbox under “Single Checkbox Demo” section
        // 5.Verify “Success –Check box is checked” message isdisplayed.
    }
}
