package com.revature.StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.revature.models.POM.SupplierPageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SupplierSearchStepImpl {

    public WebDriver driver;
    public SupplierPageFactory supplierPageFactory;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        driver.get("http://localhost:9090/");

        supplierPageFactory = new SupplierPageFactory(driver);
    }

    @Given("a user is on the supplier page")
    public void a_user_is_on_the_supplier_page() {
        Assert.assertEquals(driver.getTitle(), "Supplier Page");
    }
    @When("a user enters a valid supplier id")
    public void a_user_enters_a_valid_supplier_id() {
        supplierPageFactory.inputNumber(2);
    }
    @When("clicks on the search button")
    public void clicks_on_the_search_button() {
        supplierPageFactory.clickSearchButton();
    }
    @Then("the user can see the suppliers listed items")
    public void the_user_can_see_the_suppliers_listed_items() {
        String itemText = driver.findElement(By.id("item_info")).getText();
        Assert.assertEquals(itemText, "name: Flour price: 20");
    }
}
