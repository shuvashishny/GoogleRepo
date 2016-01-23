package google.homepage;

import browser.BrowserClass;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
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
