package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility
{
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement gender;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement day;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement month;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement year;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmpassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompleted;
    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameRequiredMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameRequiredMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailRequiredMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordRequired;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordRequired;

    public void selectGender() {
        log.info("Select Gender " + gender.toString());
        selectCheckBox();
    }

    /**
     * enter Firstname
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterFirstname(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enter Firstname " + firstName.toString());
        sendTextToElement(firstName, value);
    }

    /**
     * enter Lastname
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterLastname(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enter Lastname " + lastName.toString());
        sendTextToElement(lastName, value);
    }
    public void selectCheckBox()
    {

    }

    public void selectDay(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("Select Day " + day.toString());
        selectByVisibleTextFromDropDown(day, value);
    }

    public void selectMonth(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("Select month " + month.toString());
        selectByVisibleTextFromDropDown(month, value);
    }

    public void selectYear(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("Select Year " + year.toString());
        selectByVisibleTextFromDropDown(year, value);
    }

    /**
     * enter Email
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterEmail(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enter Email " + email.toString());
        sendTextToElement(email, value);
    }

    /**
     * enter Password
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enter Password " + password.toString());
        sendTextToElement(password, value);
    }

    /**
     * enter Confirm Password
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterConfirmPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        log.info("enter Confirm Password " + confirmpassword.toString());
        sendTextToElement(confirmpassword, value);
    }

    /**
     * click On Register Button
     *
     * @throws InterruptedException
     */
    public void clickOnRegisterButton() throws InterruptedException {
        Thread.sleep(1000);
        log.info("click On Register Button " + registerButton.toString());
        clickOnElement(registerButton);
    }

    /**
     * get Registration Completed Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getRegistrationCompletedText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("get Registration Completed Text " + registrationCompleted.toString());
        return getTextFromElement(registrationCompleted);
    }

    public String getRegisterText() {
        log.info("get Register Text " + registerText.toString());
        return getTextFromElement(registerText);
    }

    public String getFirstNameRequiredMessage() {
        log.info("get First Name RequiredMessage " + firstNameRequiredMessage.toString());
        return getTextFromElement(firstNameRequiredMessage);
    }

    public String getLastNameRequiredMessage() {
        log.info("get Last Name RequiredMessage " + lastNameRequiredMessage.toString());
        return getTextFromElement(lastNameRequiredMessage);
    }

    public String getEmailRequiredMessage() {
        log.info("get Email RequiredMessage " + emailRequiredMessage.toString());
        return getTextFromElement(emailRequiredMessage);
    }

    public String getPasswordRequiredMessage() {
        log.info("get password RequiredMessage " + passwordRequired.toString());
        return getTextFromElement(passwordRequired);
    }

    public String getConfirmPasswordRequiredMessage() {
        log.info("get confirm password RequiredMessage " + confirmPasswordRequired.toString());
        return getTextFromElement(confirmPasswordRequired);
    }
}
