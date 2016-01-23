package google.search;

import browser.BrowserClass;
import google.platform.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Shuvashish on 1/16/2016.
 */
public class HomePage extends CommonMethods {

    @FindBy(how= How.CLASS_NAME, using ="gsfi" )private WebElement searchText;
    @FindBy(how=How.CLASS_NAME, using="lsb") private WebElement searchSubmitBttn;

    WebDriver driver= BrowserClass.driver;

    public SearchPage searchInGoogle (String text){

        searchText.clear();
        searchText.sendKeys(text);
        searchSubmitBttn.click();

        return PageFactory.initElements(driver,SearchPage.class);
    }


}
