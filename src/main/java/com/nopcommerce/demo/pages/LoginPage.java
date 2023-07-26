package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility
{
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailIDElement;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordElement;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;



    public String getWelcomeText() {
        log.info("get Welcome Text " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String emailId){
        log.info("enter EmailId " + emailIDElement.toString());
        sendTextToElement(emailIDElement,emailId);
    }

    public void enterPassword(String value){
        log.info("enter Password " + passwordElement.toString());
        sendTextToElement(passwordElement,value);
    }

    public void clickOnLoginButton(){
        log.info("click On LoginButton " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        log.info("get ErrorMessage " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

}
