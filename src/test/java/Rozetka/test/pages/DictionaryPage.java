package Rozetka.test.pages;

import Rozetka.test.steps.serenity.ILocators;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;
import java.util.concurrent.TimeUnit;

@DefaultUrl("https://rozetka.com.ua")
public class DictionaryPage extends PageObject

{
    public void searchIphone(String keyword){
        $(ILocators.SEARCH_PHONE).sendKeys(keyword);
    }

    public void choose_iPhoneXS(String args)  {
         $(ILocators.CLICK_ON_THE_IPHONE_XS).click();
    }

    public void choose_phone_with_Gray_color(String args){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        $(ILocators.CLICK_ON_THE_SILVER_COLOR).click();
    }

    public void change_phone_color(String args){
         getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        $(ILocators.CLICK_ON_THE_SPACE_GRAY_COLOR).click();
    }

    public void add_product_to_the_basket() {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        $(ILocators.CLICK_ON_THE_BACKET).click();
    }

    public boolean buttonIsVisibleByText(String definition) {
        return $("//span[text()='$1']".replace("$1",definition)).isVisible();
    }
}