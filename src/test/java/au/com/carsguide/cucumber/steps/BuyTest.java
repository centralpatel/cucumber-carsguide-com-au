package au.com.carsguide.cucumber.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.SearchCarsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuyTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on \"([^\"]*)\" tab$")
    public void iMouseHoverOnTab(String hoverBuyAndSell) {
        new HomePage().mouseHoverBuyAndSell();
    }

    @And("^I click 'Search Cars' link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCars();
    }

    @Then("^I navigate to 'new and used car search' page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        new SearchCarsPage().clickOnNewAndUsedCars();
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new SearchCarsPage().selectMake(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new SearchCarsPage().selectModel(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new SearchCarsPage().selectLocation(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new SearchCarsPage().selectPrice(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new SearchCarsPage().clickFindMyNextCarButton();
    }

//    @Then("^I should see the make in results$")
//    public void iShouldSeeTheMakeInResults() {
//        new ResultPage().verifyMake();
//    }

    @And("^I click 'Used' link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedCars();
    }

    @Then("^I navigate to 'Used Cars For Sale' page$")
    public void iNavigateToUsedCarsForSalePage() {
        new HomePage().clickOnUsedCars();
    }
}
