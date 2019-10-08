package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.CalendarPageObjects;
import pageobjects.CheckOutPageObjects;
import utils.Helpers;

public class CheckOutPage extends Helpers {

    private CheckOutPageObjects checkOutPageObjects;

    public CheckOutPage(WebDriver driver) {
        super(driver);
        checkOutPageObjects = new CheckOutPageObjects();
        PageFactory.initElements(driver, checkOutPageObjects);
        waitForElement(checkOutPageObjects.checkOutPageHeader);
    }

//    public CheckOutPage validateIfTheUserIsInCheckOutPage(){
//        return this;
//    }

    public void selectCreditOrDebitCard(){
        checkOutPageObjects.selectCreditCardOption.click();
        //Enter credit card details
    }



}
