package google;

import browser.Browser;
import google.search.HomePage;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Shuvashish on 1/16/2016.
 */
public class PageNavigation {


    /**
     * This method is for navigate to the HomePage
     **/

    public HomePage gotoHomePage(){

        return PageFactory.initElements(Browser.driver,HomePage.class);
    }
}
