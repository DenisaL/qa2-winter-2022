package pageobject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobject.pages.FlightConfirmPage;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;

public class TicketsTestsOnPages {
    private final String URL = "http://www.qaguru.lv:8089/tickets/";
    private final String FROM_AIRPORT = "RIX";
    private final String TO_AIRPORT = "SFO";
    private final String NAME = "Denisa";
    private final String SURNAME = "Tester";
    private final String DISC = "Good discount";
    private final String GROWNUPS = "2";
    private final String KIDS = "1";
    private final String LUGGAGE = "4";
    private final String DATE = "13";
    private final String SEAT = "8";


    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void successfulRegistrationTest() {
        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(FROM_AIRPORT, TO_AIRPORT);

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        infoPage.passengerInfo(NAME, SURNAME, DISC, GROWNUPS, KIDS, LUGGAGE, DATE);
        infoPage.bookFlight();

        infoPage.seatSelector(SEAT);
        infoPage.finalBook();

        FlightConfirmPage flightConfirmPage = new FlightConfirmPage(baseFunc);
        flightConfirmPage.confirm();

        Assertions.assertEquals(NAME, infoPage.getPassengerName(), "Wrong name!");
        Assertions.assertEquals(FROM_AIRPORT, infoPage.getFirstDeparture(), "Error msg!");
        Assertions.assertEquals(FROM_AIRPORT, infoPage.getFirstArrival(), "Error msg!");
        Assertions.assertEquals(TO_AIRPORT, infoPage.getSecondDeparture(), "Error!");
        Assertions.assertEquals(TO_AIRPORT, infoPage.getSecondArrival(), "Error!");

        Assertions.assertTrue(infoPage.getPrice().length() >  0, "Error message!");
    }

}
