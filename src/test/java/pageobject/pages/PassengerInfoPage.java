package pageobject.pages;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;

public class PassengerInfoPage {
    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By GET_PRICE_BTN = By.xpath(".//span[contains(@onclick, 'setLang')]");
    private final By BOOK = By.id("book2");
    private final By SEAT_NUMBERS = By.xpath(".//div[@class = 'seat']");
    private final By FINAL_BOOK = By.id("book3");

    private final By RESERVATION_INFO = By.xpath(".//span[@class = 'bTxt']");
    private final By RESPONSE_BLOCK = By.id("response");

    private BaseFunc baseFunc;

    public PassengerInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void passengerInfo(String first_name, String last_name, String discount, String adults, String children,
                              String bag, String flight) {

        baseFunc.type(FIRST_NAME, first_name);
        baseFunc.type(LAST_NAME, last_name);
        baseFunc.type(DISCOUNT, discount);
        baseFunc.type(ADULTS, adults);
        baseFunc.type(CHILDREN, children);
        baseFunc.type(BAG, bag);
        baseFunc.select(FLIGHT, flight);
        baseFunc.click(GET_PRICE_BTN);
        baseFunc.waitForElementsCountToBe(RESERVATION_INFO, 5);

    }

    public String getFirstDeparture() {
        return baseFunc.elements(RESERVATION_INFO).get(0).getText();
    }

    public String getFirstArrival() {
        return baseFunc.elements(RESERVATION_INFO).get(1).getText();
    }

    public String getSecondDeparture() {
        return baseFunc.elements(RESERVATION_INFO).get(3).getText();
    }

    public String getSecondArrival() {
        return baseFunc.elements(RESERVATION_INFO).get(4).getText();
    }

    public String getPassengerName() {
        String name = baseFunc.elements(RESERVATION_INFO).get(2).getText();
        return name.substring(0, name.length() - 1);
    }

    public String getPrice() {
        String text = baseFunc.findElement(RESPONSE_BLOCK).getText();
        return StringUtils.substringBetween(text, "for "," Eur");
    }

    public void bookFlight() {
        baseFunc.click(BOOK);
    }

    public void seatSelector(String seat) {
        List<WebElement> seats = baseFunc.elements(SEAT_NUMBERS);

        boolean isSeatFound = false;
        for (WebElement number : seats) {
            if ((number.getText()).equals(seat)) {
                isSeatFound = true;
                number.click();
                break;
            }
        }
        Assertions.assertTrue(isSeatFound, "Sit not found");


    }

    public void finalBook() {
        baseFunc.click(FINAL_BOOK);
    }

}
