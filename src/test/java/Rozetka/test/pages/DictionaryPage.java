package Rozetka.test.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import net.thucydides.core.pages.PageObject;

import java.util.List;


@DefaultUrl("https://rozetka.com.ua")
public class DictionaryPage extends PageObject {

    public void searchIphone(String keyword){
        find(By.xpath("//input[@placeholder='Я ищу...']")).sendKeys(keyword);
    }

    public void choose_iPhoneXS(String args)  {
         find(By.xpath("//span[contains(text(),'xs')]")).click();

    }
    public void choose_phone_with_Gray_color(String args) throws InterruptedException {
        find(By.xpath("//div[@class='rz-goods-main-content clearfix']//div[1]//div[1]//div[1]//div[1]//div[1]//ul[1]//div[4]//div[1]//li[1]//span[1]//a[1]")).click();
    Thread.sleep(5000);
    }

    public void change_phone_color(String args) throws InterruptedException {
        find(By.xpath("//li[2]//pp-item-color[1]//a[1]//span[1]")).click();
        Thread.sleep(5000);
    }

    public void add_product_to_the_basket() throws InterruptedException {
        find(By.xpath("//span[@class='pos-fix inline']//button[@class='btn-link-i']")).click();
        Thread.sleep(5000);
    }

    public boolean buttonIsVisibleByText(String definition) {
        return $("//span[text()='$1']".replace("$1",definition)).isVisible();
    }
}






