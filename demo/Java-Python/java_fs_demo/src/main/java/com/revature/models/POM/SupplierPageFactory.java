package com.revature.models.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierPageFactory {
    WebDriver webDriver;

    @FindBy(id = "supplier_search_container")
    WebElement searchContainer;

    @FindBy(xpath = "/html/body/div[1]/input[1]")
    WebElement numberInput;

    @FindBy(xpath = "/html/body/div[1]/input[2]")
    WebElement searchbutton;

    @FindBy(id = "item_info")
    WebElement itemInfo;


    public SupplierPageFactory(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void inputNumber(int number){
        this.numberInput.sendKeys(Integer.toString(number));
    }

    public void clickSearchButton(){
        this.searchbutton.click();
    }

}
