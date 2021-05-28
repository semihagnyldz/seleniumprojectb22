package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1- setup the browser driver
        WebDriverManager.chromedriver().setup(); //after writing this line iam allowing to call my selenium web driver

        //2- create instance of selenium web driver
        //OPENING THE BROWSER
        WebDriver driver= new ChromeDriver();

        //3- get the page for Tesla.com
        driver.get("https://www.tesla.com");// get method gets the given URL link in an already opened browser,
        // the url opens after typing the step 2. this get method has nothing to do opening a browser.
        //does it accept any argument?: yes. the argument is https://www.
        //what type of argument it accepts? it accepts a String argument.
        //What is the return type? : void.

        System.out.println("current title: " +driver.getTitle());

        //putting 3 seconds of wait/stops the code for 3 sec.
        Thread.sleep(3000);//comes from java library. it has nothing to do the selenium.

        // going back using navigations:
        driver.navigate().back();
        Thread.sleep(3000);
        //going fprward using navigations:
        driver.navigate().forward();

        Thread.sleep(3000);

        //refreshing the page using navigations:
        driver.navigate().refresh();

        //going to another URL using .to() method
        driver.navigate().to("https://www.google.com"); //this is like get method.
        //.to method and get ,ethod do the exact same thing, .get method will wait until the page loaded before going to next step
        //to method will not wait.

        //creating
        driver.getTitle(); //this one will get what is in the html document in the head inside title tag. this is what is displayed in the tap line on the top.
        System.out.println("current title: " +driver.getTitle());

        driver.getCurrentUrl(); //this can get the url but the return string wont be stored anywhere.
        //to be able store and reuse it in the future:
        String currentUrl= driver.getCurrentUrl();
        System.out.println("current URL: "+currentUrl);

        //this line will basically maximize the browser size
        driver.manage().window().maximize();

        //this method will close the currently opened browser
        //it will only close 1 browser or 1 tab
        driver.close();

       //will close all of the opened browsers or tabs within the same session.
        driver.quit();
    }
}
