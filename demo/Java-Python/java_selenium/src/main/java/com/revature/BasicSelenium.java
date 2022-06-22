package com.revature;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium {
    
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        try{
            driver.get("https://google.com");

            String title = driver.getTitle();
            System.out.println(title);

            WebElement searchBox = driver.findElement(By.name("q"));
            WebElement searchButton = driver.findElement(By.name("btnK"));

            searchBox.sendKeys("Revature");

            String searchValueFromSearchBox = searchBox.getAttribute("value");
            System.out.println(searchValueFromSearchBox);

            searchButton.click();

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            driver.quit();
        }
    }
}
