package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BrowserUtilities {


    //creating method name: wait
    //converting to miliseconds
    // handle checked exception

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("somethings happened in sleep method");
        }

    }


    // wiats for element to be not STALE

    public static void waitForStaleElement(WebElement element){
        int i=0;
        while (i<=15){
            try{
                element.isDisplayed();
                break;
            }catch (StaleElementReferenceException stExp){
                i++;
                try{
                    Thread.sleep(300);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            break;
        }
    }
    // waits for Clickability
    public static WebElement waitForClickability(WebElement element, int timeout ){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    // able to click using JSExecutor
    public static void clickWithJs (WebElement element){
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click;",element);
    }

    // wiats for visibility
    public static WebElement waitForVisibility(WebElement element, int timeWaitsInSec){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),timeWaitsInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
}
