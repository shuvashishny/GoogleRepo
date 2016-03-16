package google.platform;

import browser.Browser;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Shuvashish on 1/16/2016.
 */
public class CommonMethods {

    private WebDriver driver= Browser.driver;


    /**
     * Wait for a WebElement upto 20 sec
     * to be dispalyed
     * @param element
     */
    public void waitForElement(WebElement element){

        for(int i=1;i<40;i++) {
            try {
                if(element.isDisplayed())
                    break;
            }catch (ElementNotFoundException e){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e1) {

                    e1.printStackTrace();
                }
            }catch (Exception e){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    /**
     * Wait for an WebElement 5 sec
     * to be clickable
     * @param element
     */
    public void waitUntilElementClickable(WebElement element){

        for(int i=1;i<=10;i++) {
            try {
                element.click();
            } catch (Exception e) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }

    }

    public void hardWait(int second){

        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitUntilElementReady(WebElement element){
        //just comment

        WebDriverWait wait= new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated((By) element));

        FluentWait<WebElement> fluentWait = new FluentWait<WebElement>(element);

        fluentWait.withTimeout(20, TimeUnit.SECONDS)
                .pollingEvery(100,TimeUnit.MILLISECONDS)
                .until((Predicate<WebElement>) ExpectedConditions.presenceOfElementLocated((By) element));
    }
}
