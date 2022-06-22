package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    
    private WebDriver driver;
    By searchBox = By.name("q");
    By searchButton = By.name("btnK");

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    private void setSearchInput(String search){
        driver.findElement(searchBox).sendKeys(search);
    }

    private void clickSearchButton(){
        driver.findElement(searchButton).click();
    }

    public void search(String search){
        // fill in the search box
        setSearchInput(search);
        // click the search button
        clickSearchButton();
    }
}
