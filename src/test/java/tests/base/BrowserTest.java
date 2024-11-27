package tests.base;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.home.GoogleMainPage;
import pages.home.GoogleMainPage_PF;
import utils.WaitUtils;

import static enums.WaitStrategy.CLICKABLE;

public class BrowserTest extends BaseTest {

    @Test
    public void myBrowserTest() {
        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();

        logger.info("Verifying that the browser is opened and we are navigating to correct URL.");

        WaitUtils.applyGlobalWait();

//        Assert.assertEquals(actualUrl, expectedUrl, "Failed");
    }

    @Test
    public void myBrowserTestTwo() throws InterruptedException {
        GoogleMainPage googleMainPage = new GoogleMainPage(driver);
        GoogleMainPage_PF googleMainPageFactory = new GoogleMainPage_PF(driver);
        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl, "Failed");

        logger.info("Verifying that the browser is opened and we are navigating to correct URL.");

        WaitUtils.applyWait(driver, googleMainPageFactory.aboutButton, CLICKABLE);

        googleMainPageFactory.clickOnAboutButton();

        WaitUtils.applyGlobalWait();


    }
}