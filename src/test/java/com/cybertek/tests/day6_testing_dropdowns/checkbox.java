package com.cybertek.tests.day6_testing_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory. getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cybertekschool.com/checkboxes");
        WebElement checkbox1= driver.findElement(By.xpath("(//input[@type='checkbox])[1]"));
        WebElement checkbox2= driver.findElement(By.xpath("(//input[@type='checkbox])[2]"));
        //confirm checkbox #1 is NOT selected by default
        if(!checkbox1.isSelected()){
            System.out.println("checkbox1 is NOT selected. Passed!");
        }else{
            System.out.println("checkbox1 is selected!");
        }
        //confirm checkbox #2 is selected by default.
        if(checkbox2.isSelected()){
            System.out.println("checkbox2 is selected. passed!");
        }else{
            System.out.println("checkbox2 is NOT selected.failed!");
        }
        //click checkbox #1 to select it.
        checkbox1.click();
        Thread.sleep(3000);
        //click checkbox #2 to deselected.
        checkbox2.click();
        Thread.sleep(3000);
        //confirm checkbox #1 is selected
        if(checkbox1.isSelected()){
            System.out.println("checkbox1 is selected. Passed!");
        }else{
            System.out.println("checkbox1 is NOT selected!.failed!");
        }
        //confirm checkbox #2 is NOT selected.
        if(!checkbox2.isSelected()){
            System.out.println("checkbox2 is NOT selected. Passed!");
        }else{
            System.out.println("checkbox2 is selected!.failed!");
        }
        driver.close();



    }
}
