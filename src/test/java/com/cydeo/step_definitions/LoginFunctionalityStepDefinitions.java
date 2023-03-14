package com.cydeo.step_definitions;

import com.cydeo.pages.FidexioLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LoginFunctionalityStepDefinitions {

    FidexioLoginPage FidexioLoginPage = new FidexioLoginPage();
    @Given("Fidexio webpage is open")
    public void fidexio_webpage_is_open() {
        Driver.getDriver().get("https://qa.fidexio.com/");
    }

    @When("user enters valid {string} and user enters valid {string}")
    public void userEntersValidAndUserEntersValid(String arg0, String arg1) {

        FidexioLoginPage.emailBox.sendKeys(arg0);
        FidexioLoginPage.passwordBox.sendKeys(arg1);
    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        FidexioLoginPage.logInBtn.click();

        Assert.assertTrue(FidexioLoginPage.logInCongrats.isDisplayed());
    }

    @When("user enters only an {string} or {string}")
    public void user_enters_only_an_or(String email, String password) {
        FidexioLoginPage.emailBox.sendKeys(email);
        FidexioLoginPage.passwordBox.sendKeys(password);
    }

    @Then("user should see warning message to fill empty fields when trying to log in")
    public void userShouldSeeWarningMessageToFillEmptyFieldsWhenTryingToLogIn() throws InterruptedException {

        FidexioLoginPage.logInBtn.click();

        Thread.sleep(1000);

        if (FidexioLoginPage.passwordBox.getAttribute("value").isEmpty()){
            System.out.println("hello1");
            Assert.assertEquals("Please fill in this field.",FidexioLoginPage.passwordBox.getAttribute("validationMessage"));
        }
        if (FidexioLoginPage.emailBox.getAttribute("value").isEmpty()){
            System.out.println("hello2");
            Assert.assertEquals("Please fill in this field.",FidexioLoginPage.emailBox.getAttribute("validationMessage"));
        }

    }





}
