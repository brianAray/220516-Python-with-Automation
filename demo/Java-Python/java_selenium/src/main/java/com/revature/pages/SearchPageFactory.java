package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {

    WebDriver driver;

    @FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    WebElement searchBox;

    @FindBy(name="btnK")
    WebElement searchButton;

    public SearchPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void setSearchInput(String search){
        searchBox.sendKeys(search);
    }

    private void clickSearchButton(){
        searchButton.click();
    }

    public void search(String search){
        this.setSearchInput(search);
        this.clickSearchButton();
    }

}
