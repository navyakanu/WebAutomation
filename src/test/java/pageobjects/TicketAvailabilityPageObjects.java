package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TicketAvailabilityPageObjects {

    @FindBy(className = "ltd-seatplan__canvas")
    public WebElement canvas;

    @FindBy(css = "cursor:pointer")
    public WebElement cursorPointer;

    @FindBy(css="ltd-cta__row:nth-child(2)")
    public WebElement seat;

    @FindBy(css = "modal__close > .ltd-icon")
    public WebElement addToBasket;

    @FindBy(className = "ltd-cta__icon")
    public WebElement getAddToBasketIcon;

}
