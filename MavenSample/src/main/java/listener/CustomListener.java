package listener;

import browser.Browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;


public class CustomListener extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult testResult){

        System.out.println("failed");
        File srcFile=((TakesScreenshot) Browser.driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(srcFile,new File("E:\\snapshot"+testResult.getName()+".jpg"));
        }catch (Exception e){
            e.getMessage();
        }

    }

    @Override
    public void onTestSuccess(ITestResult testResult){

        System.out.println("Success : "+testResult.getName());

        Browser.driver.quit();
    }

}
