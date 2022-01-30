package com.cybertek.tests.Homework.day5_homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CybertekPassword {
    public static void main(String[] args) throws InterruptedException {
        //Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // 3.Enter any email into input box
        WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("semihagn@gmail.com"+ Keys.ENTER);
        Thread.sleep(3000);
        // 4.Click on Retrieve password
        WebElement retrievePassword= driver.findElement(By.xpath("//i[.='Retrieve password']"));
        retrievePassword.click();
        // 5.Verify URL contains: Expected: “email_sent”
        String actualURL= driver.getCurrentUrl();
        String expectedURL="email_sent";
        if(actualURL.contains(expectedURL)){
            System.out.println("passed!");
        }else{
            System.out.println("failed");
        }
        // 6.Verify textbox displayed the content as expected.Expected: “Your e-mail’s been sent!”
        WebElement actualTextbox= driver.findElement(By.xpath("//h4[.='Your e-mail's been sent! ']"));
        String actualDisplayedTextbox= actualTextbox.getText();
        String expectedDisplayedTextbox= "Your e-mail’s been sent!";
        if(actualDisplayedTextbox.equals(expectedDisplayedTextbox)){
            System.out.println("textbox verification passed!");
        }else{
            System.out.println("textbox verification failed!");
        }


    }
}
