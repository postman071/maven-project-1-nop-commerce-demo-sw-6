package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps
{
    @Given("User on home page")
    public void userOnHomePage() {
    }

    @When("User Click on login link")
    public void userClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("User verify that {string} message display")
    public void userVerifyThatMessageDisplay(String expectedText) {
        Assert.assertEquals(expectedText, new LoginPage().getWelcomeText());
    }


    @And("User Enter {string}")
    public void userEnter(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("User Enter the {string}")
    public void userEnterThe(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("User Click on Login Button")
    public void userClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("User Verify that the {string}")
    public void userVerifyThatThe(String expectedText) {
        Assert.assertEquals(expectedText, new LoginPage().getErrorMessage());
    }

    @Then("Verify that {string} is display")
    public void verifyThatIsDisplay(String expectedText) {
        Assert.assertEquals(expectedText, new HomePage().logOutLinkDisplayed());
    }

    @Then("Verify that {string} Link Display")
    public void verifyThatLinkDisplay(String expectedText) {
        Assert.assertEquals(expectedText, new HomePage().loginLinkIsDisplayed());
    }
}
