package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement hoverBuyAndSell;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCars;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedCars;

    public void clickOnUsedCars (){
        clickOnElement(usedCars);
        log.info("Clicking on used cars : " + usedCars.toString());
    }

    public void mouseHoverBuyAndSell() {
        mouseHoverToElement(hoverBuyAndSell);
        log.info("Hovering on 'Buy + Sell' : " + hoverBuyAndSell.toString());
    }
    public void clickOnSearchCars() {
        clickOnElement(searchCars);
        log.info("Clicking on Search Cars : " + searchCars.toString());
    }


}
