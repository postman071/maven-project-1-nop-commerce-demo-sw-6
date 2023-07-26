package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ComputerPageSteps
{
    @When("User Click on Computer tab")
    public void userClickOnComputerTab() throws InterruptedException {
        new HomePage().selectAllMenu("Computer");
    }

    @Then("User Verify {string} text")
    public void userVerifyText(String expectedMessage) {
        Assert.assertEquals(expectedMessage, new ComputerPage().getComputerText());
    }

    @And("User Click on Desktops link")
    public void userClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktop();
    }


    @And("User Click on product name Build your own computer")
    public void userClickOnProductNameBuildYourOwnComputer() throws InterruptedException {
        new DesktopsPage().clickAddByProductName("Build your own computer");
    }

    @And("User Select processor {string}")
    public void userSelectProcessor(String processor) throws InterruptedException {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("User Select RAM {string}")
    public void userSelectRAM(String ram) throws InterruptedException {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("User Select HDD {string}")
    public void userSelectHDD(String hdd) throws InterruptedException {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("User Select OS {string}")
    public void userSelectOS(String os) throws InterruptedException {
        new BuildYourOwnComputerPage().selectOs(os);
    }

    @And("User Select Software {string}")
    public void userSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("User Click on ADD TO CART Button")
    public void userClickOnADDTOCARTButton() throws InterruptedException {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @Then("User  Verify message {string}")
    public void userVerifyMessage(String expectedMessage) throws InterruptedException {
        Assert.assertEquals(expectedMessage, new BuildYourOwnComputerPage().getSuccessfullyAddedToCartText());
    }


    @Then("User Verify {string} textt")
    public void userVerifyTextt(String expectedMessage) {
        Assert.assertEquals(expectedMessage,new DesktopsPage().getDesktopText());
    }
}
