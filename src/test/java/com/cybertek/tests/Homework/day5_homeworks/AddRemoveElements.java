package com.cybertek.tests.Homework.day5_homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemoveElements {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        // 3. Click to “Add Element” button 50 times
        WebElement addElementButton= driver.findElement(By.xpath("//button[.='Add Element']"));
        for (int i = 0; i < 50; i++) {
            addElementButton.click();

        }
        // 4. Verify 50 “Delete” button is displayed after clicking.
        List<WebElement> listOfDeleteButtons= driver.findElements(By.xpath("//button[.='Delete']"));


        // 5. Click to ALL “Delete” buttons to delete them.
        // 6. Verify “Delete” button is NOT displayed after clicking.
    }
}
