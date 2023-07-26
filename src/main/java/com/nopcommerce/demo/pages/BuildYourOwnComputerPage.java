package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']")
    WebElement successfullyText;

    /**
     * select Processor
     *
     * @param name
     * @throws InterruptedException
     */
    public void selectProcessor(String name) throws InterruptedException {
        Thread.sleep(1000);
        log.info("select Processor " + name + selectProcessor.toString());
        selectByVisibleTextFromDropDown(selectProcessor, name);
    }

    public void selectRam(String name) throws InterruptedException {
        Thread.sleep(1000);
        log.info("select Ram " + name + selectProcessor.toString());
        selectByVisibleTextFromDropDown(selectRam, name);
    }
    public void selectHDD(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("select HDD " + value);
        clickOnElement(By.xpath("//label[normalize-space()='" + value + "']"));
    }


    public void selectOs(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("select Os " + value);
        clickOnElement(By.xpath("//label[contains(normalize-space(),'" + value + "')]"));
    }

    public void selectSoftware(String value) {
        log.info("select software " + value);
        selectCheckBox(By.xpath("(//label[contains(normalize-space(),'" + value + "')]//parent::*//input)[1]"));
    }
    public void selectCheckBox(By xpath)
    {
    }

    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click on add to cart " + addToCart);
        clickOnElement(addToCart);
    }

    public String getSuccessfullyAddedToCartText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("get Successfully Added To CartText " + successfullyText);
        return getTextFromElement(successfullyText);
    }
}
