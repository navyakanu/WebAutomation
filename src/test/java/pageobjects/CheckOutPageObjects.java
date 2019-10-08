package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPageObjects {


    @FindBy(className = "page-header__row page-header__heading")
    public WebElement checkOutPageHeader;

    @FindBy(css = "input[value=\"methodCard\"]")
    public WebElement selectCreditCardOption;


}
