package pages;

import org.openqa.selenium.*;
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


       // waitForElement(ticketAvailabilityPagePageObjects.seat);
//        ticketAvailabilityPagePageObjects.seat.click();
        Dimension dimension = ticketAvailabilityPagePageObjects.canvas.getSize();
        System.out.println("X" + dimension.height);
        System.out.println("Y" + dimension.width);
        //Location - 0,224
        Actions builder = new Actions(driver);
        builder.moveToElement(ticketAvailabilityPagePageObjects.canvas).moveByOffset(50,50).click().perform();
        //builder.moveByOffset(1463,1509).perform();



        /*Approach 2 :
        Make an api call and understand the coordinates for the available seats
        Move the cursor using actions till that coordinate
        Click
         */

        /*Approach 3:
        Mock only the GetPlanningScheme api call & GetSeatValidation API call
        Get available seats from validation api and x & y coordinates from schema apis
        Move to the relative positions of x and y
         */


        waitForElement(ticketAvailabilityPagePageObjects.addToBasket).click();
        return new CheckOutPage(driver);
    }

}
