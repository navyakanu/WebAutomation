package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {

    @FindBy(id = "EventNameToSearchTb")
    public WebElement searchBar;

    @FindBy(className = "ltd-button--success")
    public WebElement searchButton;

}
