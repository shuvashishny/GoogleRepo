package google.homepage;


import browser.BrowserClass;
import org.testng.annotations.Test;

public class TestSuite {

    @Test
    public void startTest(){
        BrowserClass.openBrowser()
                .gotoHomePage()
                .searchInGoogle("dhaka");
    }
}
