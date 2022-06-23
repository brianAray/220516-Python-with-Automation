package com.revature.StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.revature.models.pagefactory.LoginPageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {

    public WebDriver driver;
    public LoginPageFactory loginPageFactory;
    
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        driver.get("https://example.testproject.io/web/");

        loginPageFactory = new LoginPageFactory(driver);
    }

    @Given("a user is on the login page")
    public void a_user_is_on_the_login_page() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://example.testproject.io/web/");
    }
    @When("a user enters the correct username and correct password")
    public void a_user_enters_the_correct_username_and_correct_password() {
        loginPageFactory.inputUsername("Brian");
        loginPageFactory.inputPassword("12345");
    }
    @When("clicks on login button")
    public void clicks_on_login_button() {
        loginPageFactory.clickLoginButton();
    }
    @Then("a user is navigated to the homepage")
    public void a_user_is_navigated_to_the_homepage() {
        WebElement logoutButton = driver.findElement(By.id("logout"));
        Assert.assertNotNull(logoutButton);
    }

    @After
    public void teardown(){
        this.driver.quit();
    }
}
