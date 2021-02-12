package tests;

import com.vytrack.pages.LoginPage;
import org.testng.annotations.Test;


public class LoginTest extends LoginPage {

    @Test(description = "User should be able to login to 'VyTrack' webpage")
    public void test1(){
        LoginPage login = new LoginPage();
        login.login("storemanager73","UserUser123");
    }



}
