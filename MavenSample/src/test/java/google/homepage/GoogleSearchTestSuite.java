package google.homepage;


import browser.Browser;
import google.alldata.GetDataToSearch;
import listener.CustomListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value= CustomListener.class)
public class GoogleSearchTestSuite {

    @Test(dataProvider = "data",dataProviderClass = GetDataToSearch.class)
    public void searchTest( String city, String stringLink){
        Browser.openBrowser()
                .gotoHomePage()
                .searchInGoogle(city)
                .verifyLinkPresentWithinFirstFivePages(stringLink);

    }
}
