package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterPageSteps
{
    String email;

    @When("User Click on Register Link")
    public void userClickOnRegisterLink() {
        new HomePage().clickOnRegisterTab();
    }

    @Then("User verify that {string} text")
    public void userVerifyThatText(String expectedText) {
        Assert.assertEquals(expectedText, new RegisterPage().getRegisterText());
    }

    @And("User Click on REGISTER button")
    public void userClickOnREGISTERButton() throws InterruptedException {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("User Verify the error message {string}")
    public void userVerifyTheErrorMessage(String expectedText) {
        Assert.assertEquals(expectedText, new RegisterPage().getFirstNameRequiredMessage());
    }

    @And("User Verify the error messagee {string}")
    public void userVerifyTheErrorMessagee(String expectedText) {
        Assert.assertEquals(expectedText, new RegisterPage().getLastNameRequiredMessage());

    }


    @And("User Verify the error messages {string}")
    public void userVerifyTheErrorMessages(String expectedText) {
        Assert.assertEquals(expectedText, new RegisterPage().getEmailRequiredMessage());

    }


    @And("User Verify the error messagess {string}")
    public void userVerifyTheErrorMessagess(String expectedText) {
        Assert.assertEquals(expectedText, new RegisterPage().getPasswordRequiredMessage());
    }

    @Then("User Verify the error messagees {string}")
    public void userVerifyTheErrorMessagees(String expectedText) {
        Assert.assertEquals(expectedText, new RegisterPage().getConfirmPasswordRequiredMessage());
    }

    @When("User Select gender Female")
    public void userSelectGenderFemale() {
        new RegisterPage().selectGender();
    }

    @And("User Enter firstname")
    public void userEnterFirstname() throws InterruptedException {
        new RegisterPage().enterFirstname("Prime");
    }

    @And("User Enter lastname")
    public void userEnterLastname() throws InterruptedException {
        new RegisterPage().enterLastname("Testing");
    }

    @And("User Select day")
    public void userSelectDay() throws InterruptedException {
        new RegisterPage().selectDay("20");
    }

    @And("User Select month")
    public void userSelectMonth() throws InterruptedException {
        new RegisterPage().selectMonth("October");
    }

    @And("User Select year")
    public void userSelectYear() throws InterruptedException {
        new RegisterPage().selectYear("1995");
    }

    @And("User Enter email")
    public void userEnterEmail() throws InterruptedException {
        new RegisterPage().enterEmail(email);
    }

    @And("User Enter password")
    public void userEnterPassword() throws InterruptedException {
        new RegisterPage().enterPassword("Prime@123");
    }

    @And("User Enter Confirm Password")
    public void userEnterConfirmPassword() throws InterruptedException {
        new RegisterPage().enterConfirmPassword("Prime@123");
    }

    @Then("User Verify message {string}")
    public void userVerifyMessage(String expectedText) {
       Assert.assertEquals(expectedText, new HomePage().getRegistrationCompleteMessage());
    }
}
