package com.vytrack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.TestBase;
import utilities.Driver;

public class BasePage extends TestBase {
// Base Page is BASE for all PAGES

    @FindBy(css = "div[class='loader-mask shown']")
    public WebElement spinningWheel;

    public static boolean waitUntillSpinningWheelDisapear() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='loader-mask shown']")));
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Loader mask not found");
            e.printStackTrace();
            return true;
        } catch (WebDriverException e) {
            e.printStackTrace();

        }return false;
    }

// method which navigates to ANY BOARDS in Vytrack APP
    public void navigateToAnyBoard(String tabName, String moduleName){
        String tab ="//*[normalize-space()='"+ tabName +"' and @class='title title-level-1']";
        String modulelocator = "//*[normalize-space()='"+ moduleName +"' and @class='title title-level-2']";

        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10);
        //The visibility Of ElmementLocated checks to see if the element is present and also visible.
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(tab)));


        // finding element xpath
        WebElement module = Driver.getDriver().findElement(By.xpath(tab));



        // finding vibility of that object
        wait.until(ExpectedConditions.visibilityOf(module));



        // waits untill it will be Clickable
        wait.until(ExpectedConditions.elementToBeClickable(module));



        // wiats untill spinningWheel is dissapearing
        waitUntillSpinningWheelDisapear();
        module.click();// once we click on Module Submodule should be visible


        WebElement submodule=Driver.getDriver().findElement(By.xpath(modulelocator));
        wait.until(ExpectedConditions.visibilityOf(submodule));
        submodule.click();



    }


}
