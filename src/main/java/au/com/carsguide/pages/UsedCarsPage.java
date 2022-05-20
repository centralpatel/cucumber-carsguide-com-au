package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCarsPage extends Utility {
    private static final Logger log = LogManager.getLogger(UsedCarsPage.class.getName());

    public UsedCarsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement makeField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement modelField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement locationField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement priceField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarButton;


    public void selectMake(String make) {
        selectByVisibleTextFromDropDown(makeField, make);
        log.info("Selecting from Make field : " + makeField.toString());
    }

    public void selectModel(String model) {
        selectByVisibleTextFromDropDown(modelField, model);
        log.info("Selecting from Model field : " + modelField.toString());
    }

    public void selectLocation(String location) {
        selectByVisibleTextFromDropDown(locationField, location);
        log.info("Selecting from Location field : " + locationField.toString());
    }

    public void selectPrice(String price) {
        selectByVisibleTextFromDropDown(priceField, price);
        log.info("Selecting from Price field : " + priceField.toString());
    }

    public void clickFindMyNextCArButton() {
        clickOnElement(findMyNextCarButton);
        log.info("Clicking on Find My Next Car Button : " + findMyNextCarButton.toString());
    }



}
