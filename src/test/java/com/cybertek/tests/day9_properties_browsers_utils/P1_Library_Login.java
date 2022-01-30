package com.cybertek.tests.day9_properties_browsers_utils;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.LibraryUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P1_Library_Login {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://library2.cybertekschool.com/login.html");
    }
    public void loginToLibrary(){
        //3--enter username:""
        WebElement inputUsername= driver.findElement(By.xpath("//input[@id='inputEmail']"));
        inputUsername.sendKeys("student11@library");
        //4--enter password:""
        WebElement inputPassword= driver.findElement(By.xpath("//input[@id='inputPassword'"));
        inputPassword.sendKeys("tScBPCUr");
        //5--click to login button
        WebElement loginButton= driver.findElement(By.xpath("//button[text()='Sign in']"));
        loginButton.click();

    }

    @Test
    public void login_link_count_test(){

        //loginmethod calling to login library app
        LibraryUtils.loginToLibrary(driver);
        //6--print out count of all the links o landing page
        BrowserUtils.sleep(2);
        List<WebElement> allLinks= driver.findElements(By.xpath("//body//a"));
        System.out.println("allLinks.size()= "+allLinks.size());


        //7--print out each link on this page
        for (WebElement each : allLinks) {
            System.out.println(each.getText());
            
        }


    }
}
