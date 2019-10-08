package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.HomePageObjects;
import utils.Helpers;

public class HomePage extends Helpers {

    private HomePageObjects homePageObjects;

    public HomePage(WebDriver driver) {
        super(driver);
        homePageObjects = new HomePageObjects();
        PageFactory.initElements(driver, homePageObjects);
        waitForElement(homePageObjects.searchBar);
    }

    public ShowDetailsPage searchForAShow(String showName){
        homePageObjects.searchBar.sendKeys(showName);
        homePageObjects.searchButton.click();
        homePageObjects.searchButton.click();
        return new ShowDetailsPage(driver);
    }


}
