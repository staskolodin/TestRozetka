package Rozetka.test.steps;

import cucumber.api.PendingException;
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
    public void openHttpsRozetkaComUa() {user.is_the_on_page(); }


    @When("^Search for \"([^\"]*)\"$")
    public void searchFor(String keyword)  {user.search_iphone(keyword); }

    @And("^Choose \"([^\"]*)\" from dropdown list and go to category page$")
    public void chooseFromDropdownListAndGoToCategoryPage(String keyword) {user.choose_iPhoneXS(keyword);
        }

    @And("^Choose any phone with \"([^\"]*)\" color and go to product page$")
    public void chooseAnyPhoneWithColorAndGoToProductPage(String args) throws InterruptedException {user.choose_phone_with_Gray_color(args);
        }

    @And("^Change phone's color to \"([^\"]*)\" color$")
    public void changePhoneSColorToColor(String args) throws InterruptedException {user.change_phone_color_to_Space_Gray(args);
    }

    @And("^Add product to the basket$")
    public void addProductToTheBasket() throws InterruptedException {user.add_product_to_the_basket();}


    @Then("^Button \"([^\"]*)\" is visible$")
    public void buttonIsVisible(String btn) throws Throwable {
        user.buttonIsVisible(btn);
    }
}
