package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_Cybertek {
    public static void main(String[] args) {
        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        // 1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // 3. Locate all the WebElements on the page using XPATH and/or CSSlocator only (total of 6)

        // a. “Home” link
        WebElement homeLink= driver.findElement(By.cssSelector("a.nav-link"));//below finds the same webElement:
       // WebElement homeLink= driver.findElement(By.cssSelector("a[class='nav-link']"));
        // b. “Forgot password” header
        WebElement passwordHeader= driver.findElement(By.tagName("h2"));
        // c. “E-mail” text
        WebElement emailText= driver.findElement(By.cssSelector("label[for='email']"));
        // d.E-mail input box
        WebElement emailInput= driver.findElement(By.cssSelector("input[type='text']"));
        // e. “Retrieve password” button
        WebElement retrievePassword= driver.findElement(By.cssSelector("button[id='form_submit']"));
        // f. “Powered byCybertek School” text
        WebElement poweredText= driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        // 4. Verify all WebElements are displayed.
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("passwordHeader.isDisplayed() = " + passwordHeader.isDisplayed());
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("emailInput.isDisplayed() = " + emailInput.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("poweredText.isDisplayed() = " + poweredText.isDisplayed());


    }
}
