package com.cybertek.OfficeHours.OH_06_09_2021;

import com.cybertek.utilities.OfficeHoursUtilities;
import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Product {
    /*
    Customer navigation through product categories: Phones, Laptops and Monitors
• Navigate to "Laptop" → "Sony vaio i5" and click on "Add to cart". Accept pop up confirmation.
• Navigate to "Phones" → "Samsung galaxy s6" and click on "Add to cart". Accept pop up confirmation.
• Navigate to "Monitors" → "Apple monitor 24" and click on "Add to cart". Accept pop up confirmation.
• Navigate to "Cart" → Delete "Apple monitor 24" from cart.
• Click on "Place order".
• Fill in all web form fields.
• Click on "Purchase"
• Capture and log purchase Id and Amount.
• Assert purchase amount equals expected.
• Click on "Ok"
     */

    WebDriver driver;

    @BeforeMethod

    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.demoblaze.com/index.html");

    }

    @Test
    public void adidasTest(){
        OfficeHoursUtilities.productAdder (driver, "Laptops", "Sony vaio i5");
        OfficeHoursUtilities.productRemover(driver, "Apple monitor 24");

        driver.findElement(By.xpath("//button[.='Place Order']")).click();
        Faker faker= new Faker();
        driver.findElement(By.id("name")).sendKeys(faker.name().fullName());






    }
    @AfterMethod
    public void tearDown(){
        //driver.close();
    }
}
