package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.CalendarPageObjects;
import utils.Helpers;

public class CalendarPage extends Helpers {

    private CalendarPageObjects calendarPageObjects;

    public CalendarPage(WebDriver driver) {
        super(driver);
        calendarPageObjects = new CalendarPageObjects();
        PageFactory.initElements(driver, calendarPageObjects);
        waitForElement(calendarPageObjects.calendarHeading);
    }

//    public String getCalendarHeading(){
//        return calendarPageObjects.calendarHeading.getText();
//    }

    public TicketAvailabilityPage selectTodaysShow() {
        calendarPageObjects.bookingDay.click();
        return new TicketAvailabilityPage(driver);
    }


}
