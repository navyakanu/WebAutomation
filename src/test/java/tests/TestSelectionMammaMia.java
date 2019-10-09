package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.BaseClass;

public class TestSelectionMammaMia extends BaseClass {

    @Test
    public void selectMammaMiaShowTest() {
        HomePage homePage = new HomePage(driver);
        String showNameInShowDetailsPage = homePage.
                searchForAShow("Mamma Mia!").
                getShowName();
        Assert.assertTrue(showNameInShowDetailsPage.contains("Mamma Mia!"));

    }

    @Test
    public void selectMammaMiaShowAndBookTicketsTest(){
        HomePage homePage = new HomePage(driver);
        String statusMessage = homePage.
                searchForAShow("Mamma Mia!").bookTickets()
                .selectTodaysShow().selectAvailableTicket().
                selectCreditOrDebitCard()
                .enterPaxDetailsAndSubmit()
                .validatePaymentSuccessful();
        Assert.assertEquals(statusMessage,"Booking Confirmed", "Not able to confirm booking");

    }


}
