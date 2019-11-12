package Rozetka.test.steps.serenity;

import Rozetka.test.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

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
    public void choose_phone_with_Gray_color(String args){dictionaryPage.choose_phone_with_Gray_color(args);
    }

    @Step
    public void change_phone_color_to_Space_Gray(String args){dictionaryPage.change_phone_color(args);
    }

    @Step
    public void add_product_to_the_basket(){dictionaryPage.add_product_to_the_basket();
    }

    @Step
    public void buttonIsVisible(String btn) {
        Assert.assertTrue(dictionaryPage.buttonIsVisibleByText(btn));
    }
}