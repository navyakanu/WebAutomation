package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pageobjects.ShowDetailsPageObjects;
import pageobjects.TicketAvailabilityPageObjects;
import utils.Helpers;

public class TicketAvailabilityPage extends Helpers {

    private TicketAvailabilityPageObjects ticketAvailabilityPagePageObjects;

    public TicketAvailabilityPage(WebDriver driver) {
        super(driver);
        ticketAvailabilityPagePageObjects = new TicketAvailabilityPageObjects();
        PageFactory.initElements(driver, ticketAvailabilityPagePageObjects);
        //waitForElement(ticketAvailabilityPagePageObjects.canvas);
    }

    public CheckOutPage selectAvailableTicket(){
        //Need to fix this!!
        Actions actions = new Actions(driver);
        actions.moveToElement(ticketAvailabilityPagePageObjects.cursorPointer).build();
        actions.tick();
        actions.perform();
        waitForElement(ticketAvailabilityPagePageObjects.addToBasket).click();
        return new CheckOutPage(driver);
    }

}
