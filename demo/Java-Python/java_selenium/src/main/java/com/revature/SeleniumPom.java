package com.revature;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.pages.SearchPage;

public class SeleniumPom {
    
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        try{
            driver.get("https://google.com");
            SearchPage searchPage = new SearchPage(driver);
            searchPage.search("Tigers");
        }catch(Exception e){
            e.printStackTrace();   
        }finally{
            driver.quit();
        }
    }
}
