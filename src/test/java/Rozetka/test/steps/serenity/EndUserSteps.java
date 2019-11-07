package Rozetka.test.steps.serenity;

import Rozetka.test.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    DictionaryPage dictionaryPage;


    @Step
    public void is_the_on_page() {dictionaryPage.open();}

    @Step
    public void search_iphone(String keyword)  {dictionaryPage.searchIphone(keyword);
    }

    @Step
    public void choose_iPhoneXS(String keyword) {dictionaryPage.choose_iPhoneXS(keyword);
    }

    @Step
    public void choose_phone_with_Gray_color(String args) throws InterruptedException {dictionaryPage.choose_phone_with_Gray_color(args);
    }

    @Step
    public void change_phone_color_to_Space_Gray(String args) throws InterruptedException {dictionaryPage.change_phone_color(args);
    }

    @Step
    public void add_product_to_the_basket() throws InterruptedException {dictionaryPage.add_product_to_the_basket();
    }

    @Step
    public void buttonIsVisible(String btn) {
        Assert.assertTrue(dictionaryPage.buttonIsVisibleByText(btn));
    }
}




