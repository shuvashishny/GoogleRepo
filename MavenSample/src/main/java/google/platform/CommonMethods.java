package google.platform;

import browser.Browser;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
}
