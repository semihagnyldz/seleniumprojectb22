package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DENEME {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");
        driver.manage().window().maximize();
        String expectedTitle = "Login";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title passed!");
        } else {
            System.out.println("Title failed!");
        }
        Thread.sleep(3000);

        WebElement username = driver.findElement(By.xpath("//input[@class='span2']"));
        username.sendKeys("salesmanager137");
        Thread.sleep(3000);

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("UserUser12" + Keys.ENTER);

        WebElement errorDisplayed= driver.findElement(By.xpath("//div[.='Invalid user name or password.']"));
        String displayedErrorMessage= errorDisplayed.getText();
        System.out.println("Displayed ERROR message= "+displayedErrorMessage);



    }
}
