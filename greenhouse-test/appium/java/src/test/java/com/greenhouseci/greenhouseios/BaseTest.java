package com.greenhouseci.greenhouseios;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class BaseTest {

    protected AppiumDriver driver;

    private WebElement row;

    @Before
    public void setUp() throws Exception {
        // set up appium
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appPath = new File(classpathRoot, "../../App/build/outputs/apk/App-greenhouseandroid-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android");
        capabilities.setCapability("platformVersion", "4.3");
        capabilities.setCapability("app", appPath);
        URL serverAddress = new URL("http://127.0.0.1:4723/wd/hub");
        this.driver = new AndroidDriver(serverAddress, capabilities);
    }

    @After
    public void tearDown() throws Exception {
        this.driver.quit();
    }
    
}
