package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.cssSelector;

public class MainPage {
    SelenideElement popupOtherBtn = $(cssSelector(".other"));
    SelenideElement c_leftBtn = $(cssSelector(".c_left"));
    SelenideElement menuBtn = $(cssSelector(".menu-btn"));
    SelenideElement menuText = $(cssSelector("body > div.left_menu.js-left-menu.on > div > div.mob_container > div.menu-block > div"));
    SelenideElement SingIn = $(".menu-block > a");
    SelenideElement AboutUsLink = $(cssSelector("body > div.left_menu.js-left-menu.on > div > div.mob_container > div.menu_list > a:nth-child(8)"));
    SelenideElement PopCornText = $(cssSelector("body > div > div:nth-child(1) > div.container-concession > div.concession-items > div:nth-child(2) > div.bar-item-title"));
    SelenideElement PopCorn = $(cssSelector("body > div.left_menu.js-left-menu.on > div > div.mob_container > div.menu_list > a.menu_item.yellow"));

    public MainPage openMainPage (){

        open(baseUrl);
        return this;
    }
    public MainPage PopupOtherBtnClick(){

        popupOtherBtn.shouldBe(visible).click();
        return this;
    }
    public MainPage C_leftBtnClick () {

        c_leftBtn.shouldBe(Condition.visible).click();
        return this;
    }

    public MainPage MenuBtnClick () {

        menuBtn.shouldBe(Condition.visible).click();
        return this;
    }

    public MainPage checkMenuText (String text) {

        menuText.shouldHave(exactText(text));
        return this;
    }

    public MainPage checkSingIn() {

        SingIn.shouldBe(visible).shouldBe(exist);
        return this;
    }

    public AboutUsPage clickAboutUsLink() {
        AboutUsLink.shouldBe(visible).click();
        return new AboutUsPage();
    }

    public MainPage checkPopCorn(String text) {
        PopCornText.shouldBe(visible).shouldHave(exactText(text));
        return this;
    }

    public MainPage PopCornClick() {
        PopCorn.shouldBe().click();
        return this;
    }
}

