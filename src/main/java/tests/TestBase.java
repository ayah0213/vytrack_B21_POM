package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class TestBase {
// Test Base is BASE for all TESTS

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
