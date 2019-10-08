package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TicketAvailabilityPageObjects {

    @FindBy(className = ".ltd-seatplan__canvas")
    public WebElement canvas;

    @FindBy(css = "cursor:pointer")
    public WebElement cursorPointer;

    @FindBy(id = "SeatPlanSubmit")
    public WebElement addToBasket;

    @FindBy(className = "ltd-cta__icon")
    public WebElement getAddToBasketIcon;





}
