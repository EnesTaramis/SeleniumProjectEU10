package com.cydeo.step_definitions;

import com.cydeo.pages.FidexioHomePage;
import com.cydeo.pages.FidexioLoginPage;
import com.cydeo.pages.FidexioSessionExpiredPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutFunctionalityStepDefinitions {

    FidexioHomePage FidexioHomePage = new FidexioHomePage();
    FidexioLoginPage FidexioLoginPage = new FidexioLoginPage();

    FidexioSessionExpiredPage FidexioSessionExpiredPage = new FidexioSessionExpiredPage();

    @Given("user is already logged in")
    public void user_is_already_logged_in() {
        Driver.getDriver().get("https://qa.fidexio.com/");
        FidexioLoginPage.emailBox.sendKeys(ConfigurationReader.getProperty("SMemail"));
        FidexioLoginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("SMpassword"));
        FidexioLoginPage.logInBtn.click();

        Assert.assertTrue(FidexioLoginPage.logInCongrats.isDisplayed());
    }
    @When("user clicks the logout button")
    public void user_clicks_the_logout_button() {
        FidexioHomePage.username.click();
        FidexioHomePage.logoutBtn.click();
    }

    @Then("user should land on the login page")
    public void user_should_land_on_the_login_page() {
        Assert.assertTrue(FidexioLoginPage.SignInBtn.isDisplayed());

    }


    @Given("user has logged out")
    public void userHasLoggedOut() {
        FidexioHomePage.username.click();
        FidexioHomePage.logoutBtn.click();
        Assert.assertTrue(FidexioLoginPage.SignInBtn.isDisplayed());
    }

    @When("user presses the backspace button after loggin out")
    public void userPressesTheBackspaceButtonAfterLogginOut() {
        Driver.getDriver().navigate().back();
    }

    @Then("user can not go to the homepage again")
    public void userCanNotGoToTheHomepageAgain() {

        Assert.assertTrue(FidexioSessionExpiredPage.sessionExpMsj.isDisplayed());

    }
}
