package Rozetka.test.pages;

import Rozetka.test.steps.serenity.ILocators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import java.util.concurrent.TimeUnit;

@DefaultUrl("https://rozetka.com.ua")
public class AddPhoneToBasket extends PageObject implements ILocators

{
    public void SearchIphone(String keyword){
        $(SEARCH_PHONE).sendKeys(keyword);
    }

    public void ChooseIPhoneXS()  {
         $(CLICK_ON_THE_IPHONE_XS).click();
    }

    public void ChoosePhoneWithGrayColor(){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        $(CLICK_ON_THE_SILVER_COLOR).click();
    }

    public void ChangePhoneColorToSpaceGray(){
         getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        $(CLICK_ON_THE_SPACE_GRAY_COLOR).click();
    }

    public void AddProductToTheBasket() {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        $(CLICK_ON_THE_BACKET).click();
    }

    public boolean buttonIsVisibleByText(String definition) {
        return $("//span[text()='$1']".replace("$1",definition)).isVisible();
    }
}

