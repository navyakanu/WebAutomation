package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.HomePageObjects;
import pageobjects.ShowDetailsPageObjects;
import utils.Helpers;

public class ShowDetailsPage extends Helpers {

    private ShowDetailsPageObjects showDetailsPageObjects;

    public ShowDetailsPage(WebDriver driver) {
        super(driver);
        showDetailsPageObjects = new ShowDetailsPageObjects();
        PageFactory.initElements(driver, showDetailsPageObjects);
        waitForElement(showDetailsPageObjects.showName);
    }

    public String getShowName(){
        return showDetailsPageObjects.showName.getText();

    }

    public CalendarPage bookTickets(){
        showDetailsPageObjects.bookTickets.click();
        return new CalendarPage(driver);
    }


}
