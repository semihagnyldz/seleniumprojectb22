package com.cybertek.OfficeHours.OH_06_23_2021;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class techChruch {
    @Test
    public void test(){
        //go to https://techcrunch.com/
        Driver.getDriver().get("https://techcrunch.com/");
        // WebElement eachNew= driver.findElement(By.xpath("//article[@class='post-block post-block--image post-block--unread']"));
        List<WebElement> allTheLatestNews= Driver.getDriver().findElements(By.xpath("//article[@class='post-block post-block--image post-block--unread']"));
        List<WebElement> allTheAuthors= Driver.getDriver().findElements(By.xpath("//a[contains(@aria-label, 'Posts by')]"));
        List<WebElement> allImages= Driver.getDriver().findElements(By.xpath("//article//picture//img"));
        System.out.println("images: "+allImages.size());
        System.out.println("authors:"+allTheAuthors.size());
        System.out.println("news: "+allTheLatestNews.size());

        // for(int i=0; i<allTheLatestNews.size();i++){
        if(allTheLatestNews.size()==allTheAuthors.size() && allTheLatestNews.size()==allImages.size()){
            System.out.println("each news has same amount of author and also image");
        }else{
            System.out.println("failed");
        }
        // }

    }
}



    /*
    Tech Blog Website
Using any test automation framework, Java language (except record/play tools) and Maven
dependency management, please do following:
1- Go to https://techcrunch.com/
2- For “The Latest News” list, verify followings;
	a. each news has an author
	b. each news has an image
3- Click one of news from “The Latest News” list to reach the full content and verify followings;
	a. the browser title is the same with the news title
	b. the links within the news content

     */

