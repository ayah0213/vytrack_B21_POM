package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DashboardsPage extends BasePage {

    // created Constructor of Class Itself to be able to call the Elements and do some actions
    public DashboardsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//a[@href='/calendar/default'])[2]")
    public WebElement myCalendar;

    public void myCalendarMethod(){
        myCalendar.click();
    }


//
//    @FindBy(xpath = "//*[normalize-space()='Dashboards' and @class='title title-level-1']")
//    public WebElement dashboardTab;
//
//
//    @FindBy(xpath = "//*[normalize-space()='Dashboard' and @class='title title-level-2']")
//    public WebElement dashboardsModule;
//
//    @FindBy(css = "div[class='loader-mask shown']")
//    public WebElement loaderMask;




}
