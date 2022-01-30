package com.cybertek.tests.Homework.day5_homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addRemoveElement {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        // 3. Click to “Add Element” button
        WebElement addElementButton= driver.findElement(By.xpath("//button[.='Add Element']"));
        Thread.sleep(3000);
        addElementButton.click();
        // 4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton= driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        try {


            if (deleteButton.isDisplayed()) {
                System.out.println("passed!");
            } else {
                System.out.println("failed!");
            }
        }catch (StaleElementReferenceException exception){

        }
        // 5. Click to “Delete” button.

        deleteButton.click();
        Thread.sleep(3000);

        // 6. Verify “Delete” button is NOT displayed after clicking.
        if (!deleteButton.isDisplayed()) {
            System.out.println("delete button is NOT displayed, passed!" );
        } else {
            System.out.println("delete is displaeyd, failed!");
        }



    }
}
