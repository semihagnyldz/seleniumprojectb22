package day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    public static void main(String[] args) {
        //TC #1: Facebook title verification
        // 1.Open Chrome browser
        //setup browser driver:
        WebDriverManager.chromedriver().setup();
        //create driver instance and open browser
        WebDriver driver=new ChromeDriver(); //we created driver object to use selenium methods.
        driver.manage().window().maximize();
        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        // 3.Verify title:
        // Expected: “Facebook - Log In or Sign Up”
        String expectedTitle= "Facebook - Log In or Sign Up";
        //actual title comes from the browser:
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("passed!");
        }else{
            System.out.println("failed!");
        }
    }
}
