package tests;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.DashboardsPage;
import com.vytrack.pages.LoginPage;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;


public class DashboardTest extends BasePage {


    @Test(description = "User should be able to create an 'Opportunities'")
    public void test1() {
        LoginPage loginPage = new LoginPage(); // 1-> calling Login Class Object
        loginPage.login("storemanager85", "UserUser123");

        DashboardsPage dashboardsPage= new DashboardsPage(); // 2-> calling Dashboards Class Object
        dashboardsPage.navigateToAnyBoard("Dashboards","Dashboard");
        BrowserUtilities.sleep(3);
        dashboardsPage.myCalendarMethod();
 //       String expected= dashboardsPage.dashboardsModule.getText();
//        String actuall="Dashboard";
//        Assert.assertTrue(actuall.contains(expected));





    }
}
