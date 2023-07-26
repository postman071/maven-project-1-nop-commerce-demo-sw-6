package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility
{
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopText;

    public String getDesktopText(){
        return getTextFromElement(desktopText);
    }

    /**
     * click Add to Cart By ProductName
     * @param productName
     * @throws InterruptedException
     */
    public void clickAddByProductName(String productName) throws InterruptedException {
        Thread.sleep(1000);
        log.info("select software " + productName );
        clickOnElement(By.xpath("(//h2//a[normalize-space()='"+productName+"']//following::button)[1]"));
    }
}
