package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPageObjects {

    @FindBy(className = "page-header__row page-header__heading")
    public WebElement checkOutPageHeader;

    @FindBy(css = "input[value=\"methodCard\"]")
    public WebElement selectCreditCardOption;

    @FindBy(css = "")
    public WebElement name;

    @FindBy(css ="")
    public WebElement phoneNumber;

    @FindBy(css = "")
    public WebElement address;

    @FindBy(css = "" )
    public WebElement makePayment;

    @FindBy(css = "")
    public WebElement successMessage;


}
