package com.vytrack.pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class BasePage {

    @BeforeMethod
    public void setup(){
        String url= ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }



    @AfterMethod
    public void tearDown(){
        BrowserUtilities.sleep(3);
        Driver.getDriver().close();
    }
}
