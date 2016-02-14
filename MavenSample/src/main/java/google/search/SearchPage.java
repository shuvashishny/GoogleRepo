package google.search;

import browser.Browser;
import google.platform.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.testng.*;



import java.util.ArrayList;
import java.util.List;


public class SearchPage extends CommonMethods {

    @FindBy(how= How.CSS, using="#pnnext>.csb.ch") private WebElement nextPage;
    private By headerLinks=new ByChained(By.cssSelector(".r>a"));

    WebDriver driver = Browser.driver;

    /**
     * Search for a link within first five page
     * If link is there click it
     */
    public SearchPage clickIfLinkPresent(  String linkName){

        boolean next=true;
        List<WebElement> allHeaderLinks= new ArrayList<WebElement>();

        for(int i=1;i<=5;i++) {
             allHeaderLinks= driver.findElements(headerLinks);

            for (WebElement element : allHeaderLinks) {

                if (element.getText().contains(linkName)) {
                    element.click();
                    next=false;
                    break;
                }
            }
            nextPage.click();
           hardWait(2);
            allHeaderLinks.clear();
            if(next=false)
                break;

        }

        return this;
    }

    /**
     * Search for a link within the first five pages
     * @param linkName
     * @return
     */
    public SearchPage verifyLinkPresentWithinFirstFivePages(String linkName){

        boolean linkPresnt=false;
        List<WebElement> allHeaderLinks;

        for(int i=1;i<=5;i++) {
            allHeaderLinks= driver.findElements(headerLinks);

            for (WebElement element : allHeaderLinks) {

                if (element.getText().contains(linkName)) {
                       linkPresnt=true;
                }
            }
            nextPage.click();
            hardWait(2);
            allHeaderLinks.clear();
        }

        Assert.assertTrue(linkPresnt, String.format("%s Link should be presnt",linkName));



        return this;
    }



}
