package google.homepage;


import browser.BrowserClass;
import google.alldata.GetDataToSearch;
import listener.CustomListener;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value= CustomListener.class)
public class HomePageTestSuite {

    @Test(dataProvider = "data",dataProviderClass = GetDataToSearch.class)
    public void startTest( String city){
        BrowserClass.openBrowser()
                .gotoHomePage()
                .searchInGoogle(city);

    }
}
