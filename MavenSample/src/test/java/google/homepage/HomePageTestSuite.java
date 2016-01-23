package google.homepage;

import browser.BrowserClass;
import listener.CustomListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(value = CustomListener.class)
class HomePageTestSuite {

    @Test
    public void firstTest(){
        BrowserClass.openBrowser()
                .gotoHomePage()
                .searchInGoogle("Dhaka");
    }
}
