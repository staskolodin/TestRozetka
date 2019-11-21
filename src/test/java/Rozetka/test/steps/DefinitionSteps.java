package Rozetka.test.steps;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import Rozetka.test.steps.serenity.EndUserSteps;


public class DefinitionSteps {

    @Steps
    EndUserSteps user;

    @Given("^Open https://rozetka\\.com\\.ua$")
    public void openHttpsRozetkaComUa() {user.IsTheOnPage(); }

    @When("^Search for \"([^\"]*)\"$")
    public void searchFor(String keyword)  {user.SearchIphone(keyword); }

    @And("^Choose iPhone xs from dropdown list and go to category page$")
    public void chooseIPhoneXsFromDropdownListAndGoToCategoryPage() {user.ChooseIPhoneXS();
    }

    @And("^Choose any phone with Silver color and go to product page$")
    public void chooseAnyPhoneWithSilverColorAndGoToProductPage() {user.ChoosePhoneWithGrayColor();
    }

    @And("^Change phone's color to Space Gray color$")
    public void changePhoneSColorToSpaceGrayColor() {user.ChangePhoneColorToSpaceGray();
    }

    @And("^Add product to the basket$")
    public void addProductToTheBasket() {user.AddProductToTheBasket();}


    @Then("^Button \"([^\"]*)\" is visible$")
    public void buttonIsVisible(String btn) {
        user.buttonIsVisible(btn);
    }



}