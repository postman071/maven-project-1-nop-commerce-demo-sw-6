package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerTab;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationSuccessfullMessage;


    public void clickOnLoginLink() {
        log.info("click On LoginLink " + loginLink.toString());
        clickOnElement(loginLink);
    }

    public boolean logOutLinkDisplayed() {
        log.info("click On LogoutLink " + loginLink.toString());
        return logOutLink.isDisplayed();
    }

    public boolean loginLinkIsDisplayed() {
        log.info("login Link Is Displayed " + loginLink.toString());
        return loginLink.isDisplayed();
    }

    /**
     * click On Register Tab
     */
    public void clickOnRegisterTab() {
        log.info("click On Register Tab " + registerTab.toString());
        clickOnElement(registerTab);
    }

    public String getRegistrationCompleteMessage() {
        log.info("get Registration Complete Message " + registrationSuccessfullMessage.toString());
        return getTextFromElement(registrationSuccessfullMessage);
    }

    public void selectAllMenu(String menuName) throws InterruptedException {
        Thread.sleep(2000);
        log.info("select All Menu " + registrationSuccessfullMessage.toString());
        clickOnElement(By.xpath("//a[normalize-space()='" + menuName + "']"));
    }
}
