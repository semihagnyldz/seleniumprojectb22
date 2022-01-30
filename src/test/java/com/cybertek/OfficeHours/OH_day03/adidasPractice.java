package com.cybertek.OfficeHours.OH_day03;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class adidasPractice {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.demoblaze.com/index.html");
    }
    public void productAdder(String category, String product){
        driver. findElement(By.xpath("//a[.='"+category+"']")).click();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("//a[.='"+product+"']")).click();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("//a[.='Add to cart']")).click();
        BrowserUtils.sleep(1);
        Alert alert= driver.switchTo().alert();
        alert.accept();
        BrowserUtils.sleep(1);
        driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();


    }

    @Test
    public void adidasTest(){
        productAdder("Laptops","Sony vaio i5");

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
