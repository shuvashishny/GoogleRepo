package google.platform;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.WebElement;

/**
 * Created by Shuvashish on 1/16/2016.
 */
public class CommonMethods {

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
            }
        }
    }
}
