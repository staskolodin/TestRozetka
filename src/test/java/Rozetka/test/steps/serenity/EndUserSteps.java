package Rozetka.test.steps.serenity;

import Rozetka.test.pages.AddPhoneToBasket;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class EndUserSteps {

    AddPhoneToBasket dictionaryPage;


    @Step
    public void IsTheOnPage() {dictionaryPage.open();}

    @Step
    public void SearchIphone(String keyword)  {dictionaryPage.SearchIphone(keyword);
    }

    @Step
    public void ChooseIPhoneXS() {dictionaryPage.ChooseIPhoneXS();
    }

    @Step
    public void ChoosePhoneWithGrayColor(){dictionaryPage.ChoosePhoneWithGrayColor();
    }

    @Step
    public void ChangePhoneColorToSpaceGray(){dictionaryPage.ChangePhoneColorToSpaceGray();
    }

    @Step
    public void AddProductToTheBasket(){dictionaryPage.AddProductToTheBasket();
    }

    @Step
    public void buttonIsVisible(String btn) {
        Assert.assertTrue(dictionaryPage.buttonIsVisibleByText(btn));
    }
}