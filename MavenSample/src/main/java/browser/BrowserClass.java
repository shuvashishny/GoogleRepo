package browser;

import google.PageNavigation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Shuvashish on 1/16/2016.
 */
public class BrowserClass {

    public static WebDriver driver=null;

    public static PageNavigation openBrowser(String browserType){

        if(browserType.equalsIgnoreCase("IE")){
            System.setProperty("webdriver.ie.driver", "src\\main\\resources\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
            driver=new InternetExplorerDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS.SECONDS);
            driver.manage().window().maximize();
            driver.navigate().to("https://www.google.com/");
        }
        else
        System.out.print("missed it");
        return PageFactory.initElements(driver, PageNavigation.class);

    }

    public static PageNavigation openBrowser(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        return PageFactory.initElements(driver, PageNavigation.class);
    }

}
