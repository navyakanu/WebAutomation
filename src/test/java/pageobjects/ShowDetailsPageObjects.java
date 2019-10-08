package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShowDetailsPageObjects {

    @FindBy(id= "event-title")
    public WebElement showName;

    @FindBy(className="ltd-cta__row")
    public WebElement bookTickets;



}
