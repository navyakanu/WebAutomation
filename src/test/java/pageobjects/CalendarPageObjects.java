package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPageObjects {


    @FindBy(className = "booking-calendar__navigation__heading")
    public WebElement calendarHeading;

    @FindBy(className = "booking-calendar__link__row")
    public WebElement bookingDay;



}
