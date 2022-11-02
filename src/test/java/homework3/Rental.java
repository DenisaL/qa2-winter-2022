package homework3;

import org.openqa.selenium.By;

public class Rental {

    private final By DISCOVER_CARS_BTN = By.xpath(".//img[contains(@alt, 'Best car hire')]");
    private final By CHOOSE_CURRENCY_BTN = By.id("currentCurrency");
    private final By LOG_IN_BTN = By.xpath(".//a[contains(@class, 'navigation-link action my')]");
    private final By TITLE = By.xpath(".//div[contains(@class, 'home-caption')]");
    private final By PICK_UP_DATE_FIELD = By.xpath(".//div[contains(@class, 'fake-field clearfix')]");
    private final By COUNTRY_OF_RESIDENCE = By.xpath(".//span[contains(@class, 'sb-residence-text')]");
    private final By SEARCH_NOW_BTN = By.id("location-submit");
    private final By NAVIGATION_LEFT_BTN = By.id("review-arrow-left");
    private final By REVIEW = By.xpath(".//div[contains(@class, 'tp-widget-review')]");
    private final By MID_TITLE = By.xpath(".//div[contains(@class, 'col-12')]");

    private final By SMALL_CAR = By.xpath(".//div[contains(@class, 'car-top-filter-item car')]");
    private final By NEXT_BTN = By.xpath(".//div[contains(@class, 'car-top-filter-control next')]");
    private final By SHOWING_CARS = By.xpath(".//span[contains(@class, 'showing-cars')]");
    private final By FILTER_PRICE = By.xpath(".//a[contains(@class, 'dc-ui dropdown-toggle')]");
    private final By BAG = By.xpath(".//span[text() = '1 bag']");
    private final By VIEW_BTN = By.xpath(".//div[contains(@class, 'ca-table-cell top')]");
    private final By RENTAL_CONDITIONS = By.xpath(".//a[contains(@class, 'open-modal search-index')]");
    private final By FULL_PREPAYMENT = By.xpath(".//span[contains(@class, 'dc-ui badge badge-medium badge-blue')]");
    private final By SUPPLIER_RATING = By.xpath("supplier-rating");
    private final By RENTAL_COST = By.xpath(".//div[contains(@class, 'price-item-price-main')]"); //8 days
    private final By SPECIAL_OFFERS = By.xpath(".//div[contains(@class, 'flt-type')]");
    private final By AIR_CON = By.xpath(".//span[contains(@class, 'min-price')]"); //car spec
    private final By GASOLINE = By.xpath(".//label[contains(@for, 'fuel-type-ft-V')]");
    private final By SEATS = By.xpath(".//label[contains(@for, 'number-of-seats-seats-4')]");

    private final By LOADING = By.xpath(".//div[contains(@class, 'lds-ellipsis v2')]");
    private final By SEARCHING = By.xpath(".//div[contains(@class, 'mb-8 text-24 text-bold text-center')]");
    private final By AVAILABLE = By.xpath(".//div[contains(@class, 'mb-24 text-center')]");






}
