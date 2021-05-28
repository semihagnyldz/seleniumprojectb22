package day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {
    public static void main(String[] args) {
        //Open Chrome browser
        //setup browser driver:
        WebDriverManager.chromedriver().setup();
        //create driver instance and open browser
        WebDriver driver = new ChromeDriver();//we created driver object to be able to use selenium methods
        // 2.Go to https://www.facebook.com
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        // 3.Enter incorrect username
       driver.findElement(By.id("email")).sendKeys("something123@gmail.com");
        // 4.Enter incorrect password
        driver.findElement(By.id("pass")).sendKeys("some wrong password"+ Keys.ENTER);
        // 5.Verify title changed to: Expected: “Log into Facebook”

        String expedtedTitle="Log into Facebook";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expedtedTitle)){
            System.out.println("passed!");
        }else{
            System.out.println("failed!");
        }
    }
}
