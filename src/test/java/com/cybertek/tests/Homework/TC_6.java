package com.cybertek.tests.Homework;

public class TC_6 {
    public static void main(String[] args) {


        /*
        Rainy Day SCENARIO 8- Semiha
        Scenario == with invalid credentials sales manager-should not be able to login
        Gherkin language acceptance criteria:
        Given: I am on the Vytrack login page: https://qa3.vytrack.com/user/login
        When: As a user (sales manager) I provide correct username (salesmanager137) and
        incorrect password (UserUser12) and click on login button
        Then: I should see an error message displayed on the page--"Invalid username or password".

        NEGATIVE TEST CASE:

        -access to the login page
        -check if it is the expected login page:
              -correct username and incorrect password
        -should see an error message displayed on the page--"Invalid username or password.

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
         */




    }
}
