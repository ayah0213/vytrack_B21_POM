package com.vytrack.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtilities;
import utilities.Driver;

public class LoginPage extends BasePage{


    // created Constructor of Class Itself to be able to call the Elements and do some actions
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // finding all Webelements
   @FindBy(id = "prependedInput")
    public WebElement username;

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement submitButton;



    // creating method to be able to do some actions with ABOVE given Webelements
    public void  login(String userName, String passWord){
        username.sendKeys(userName);
        password.sendKeys(passWord, Keys.ENTER);
        submitButton.click();
    }




}
