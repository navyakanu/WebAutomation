package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
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
        /* Approach 1 :
        Set styles of enabled seats (cursor pointer height width)
        Move till the cursor element and click/tick
        */


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementsByClassName('ltd-seatplan__canvas').style='height: 187px; width: 1100px; cursor: pointer;'");
        //style="height: 290px; width: 1184px; cursor: default;


        Actions builder = new Actions(driver);
        builder.moveToElement(ticketAvailabilityPagePageObjects.seat).release().perform();
        ticketAvailabilityPagePageObjects.seat.click();

        /*Approach 2 :
        Make an api call and understand the coordiinates for the available seats
        Move the cursor using actions till that coordinate
        Click
         */


        waitForElement(ticketAvailabilityPagePageObjects.addToBasket).click();
        return new CheckOutPage(driver);
    }

}
