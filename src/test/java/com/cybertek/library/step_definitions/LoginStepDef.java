package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.sql.DriverManager;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();

    @Given("Librarian is on home page")
    public void librarian_is_on_home_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
    }


    @When("Librarian puts in username {string} and password {string}")
    public void librarian_puts_in_username_and_password(String string, String string2) {
        loginPage.emailInputField.sendKeys(string);
        loginPage.passwordInputField.sendKeys(string2);
    }

    @When("Summit to login")
    public void summit_to_login() {
        loginPage.signInField.click();
    }


    @Then("Librarian should see home page")
    public void librarian_should_see_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
