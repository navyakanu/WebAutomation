package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {

        public WebDriver driver;

        WebDriverWait webDriverWait;

        public Helpers(WebDriver driver) {
            this.driver = driver;
            webDriverWait = new WebDriverWait(driver, 15);
        }

        public WebElement waitForElement(WebElement by) {
            webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
            return by;
        }

    }


