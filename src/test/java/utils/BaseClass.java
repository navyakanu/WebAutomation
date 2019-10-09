package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;
    //Need to take this from properties file
    private String baseURL = "https://www.londontheatredirect.com";

    @BeforeClass
    public void setUp() {
        driver = BrowserFactory.getBrowser("chrome");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try{
            driver.get(baseURL);
        }
        catch (Exception e){
            System.out.println("URL is incorrect can not proceed further with the test");
        }
    }

    @AfterClass
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }

    }
}
