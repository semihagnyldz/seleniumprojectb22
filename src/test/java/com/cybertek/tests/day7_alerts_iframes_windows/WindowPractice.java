package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowPractice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");
    }


        @Test
        public void window_test() {
            String mainHandle=driver.getWindowHandle();
            System.out.println("main handle: "+mainHandle);

            //4. Assert:	Title	is	“Practice”
            String actualTitleBeforeClick = driver.getTitle();
            String expectedTitleBeforeClick = "Practice";

            System.out.println("actual title: " + actualTitleBeforeClick);

            //5. Click	to:	“Click	Here” text
            WebElement clickHereLink=driver.findElement(By.linkText("Click Here"));
            clickHereLink.click();//after clicking new window open so we need to handle this:
            for (String each : driver.getWindowHandles()) {
                driver.switchTo().window(each);
                System.out.println("current title while swithing: "+driver.getTitle());

            }


            String titleAfterClick= driver.getTitle();
            System.out.println("actual title: "+titleAfterClick);
            //6. Switch	to	new	Window.
            //7. Assert:	Title	is	“New	Window
        }
    }


