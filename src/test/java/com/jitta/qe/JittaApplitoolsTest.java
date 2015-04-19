package com.jitta.qe;

import com.applitools.eyes.Eyes;
import com.applitools.eyes.RectangleSize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Quick and dirty UI Applitools test to demonstrate Applitools Eyes
* Created by msrunyu on 3/9/15.
*/
public class JittaApplitoolsTest {

    @Test
    public void jittaMainTest() throws Exception {

        WebDriver driver = new ChromeDriver();

        Eyes eyes = new Eyes();
        // This is your api key, make sure you use it in all your tests.
        eyes.setApiKey("tuXJ5EM0sMWxUZjBsx100Ry94oFnZ3y111C4SEWWf5ga7pI110");
        //eyes.setForceFullPageScreenshot(true);

        try {
            // Start visual testing with browser viewport set to 1024x768.
            // Make sure to use the returned driver from this point on.
            driver = eyes.open(driver, "Applitools", "Jitta Web Page", new RectangleSize(1400, 1000));

            driver.get("http://jitta.com");

            // Visual validation point #1
            eyes.checkWindow("Jitta Main Page");

            driver.findElement(By.cssSelector("div#sign-in")).click();

            // Visual validation point #2
            eyes.checkWindow("Sign-in page");

            // Login
            driver.findElement(By.cssSelector("a.jf-btn-gp")).click();
            driver.findElement(By.cssSelector("input#Email")).sendKeys("Username");
            driver.findElement(By.cssSelector("input#Passwd")).sendKeys("Password");
            driver.findElement(By.cssSelector("input#signIn")).click();

            driver.findElements(By.cssSelector("div a#logo"));

            // we are in
            // End visual testing. Validate visual correctness.
            driver.get("https://www.jitta.com/stock/bkk:bh");
            driver.get("https://www.jitta.com/compare/aapl,goog,tsla");
            driver.findElements(By.cssSelector("div a#logo"));
            eyes.checkWindow("Stock page bkk:bh");

            eyes.close();
        } finally {
            // Abort test in case of an unexpected error.
            eyes.abortIfNotClosed();
            driver.quit();
        }
    }

    @Test
    public void jittaTest1200x800() throws Exception {

        WebDriver driver = new ChromeDriver();

        Eyes eyes = new Eyes();
        // This is your api key, make sure you use it in all your tests.
        eyes.setApiKey("tuXJ5EM0sMWxUZjBsx100Ry94oFnZ3y111C4SEWWf5ga7pI110");
        //eyes.setForceFullPageScreenshot(true);

        try {
            // Start visual testing with browser viewport set to 1024x768.
            // Make sure to use the returned driver from this point on.
            driver = eyes.open(driver, "Applitools", "Jitta Web Page", new RectangleSize(1200, 800));

            driver.get("http://jitta.com");

            // Visual validation point #1
            eyes.checkWindow("Jitta Main Page");

            driver.findElement(By.cssSelector("div#sign-in")).click();

            // Visual validation point #2
            eyes.checkWindow("Sign-in page");

            // Login
            driver.findElement(By.cssSelector("a.jf-btn-gp")).click();
            driver.findElement(By.cssSelector("input#Email")).sendKeys("Username");
            driver.findElement(By.cssSelector("input#Passwd")).sendKeys("Password");
            driver.findElement(By.cssSelector("input#signIn")).click();

            driver.findElements(By.cssSelector("div a#logo"));

            // we are in

            // End visual testing. Validate visual correctness.
            driver.get("https://www.jitta.com/stock/bkk:bh");
            driver.findElements(By.cssSelector("div a#logo"));
            eyes.checkWindow("Stock page bkk:bh");

            eyes.close();
        } finally {
            // Abort test in case of an unexpected error.
            eyes.abortIfNotClosed();
            driver.quit();
        }
    }

}
