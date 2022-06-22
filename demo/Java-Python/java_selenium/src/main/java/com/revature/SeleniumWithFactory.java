package com.revature;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.pages.SearchPageFactory;

public class SeleniumWithFactory {
    
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        driver.get("https://www.google.com");

        SearchPageFactory searchPageFactory = new SearchPageFactory(driver);

        try{
            searchPageFactory.search("Revature");
        }finally{
            driver.quit();
        }
    }
}
