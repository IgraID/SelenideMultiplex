import org.testng.annotations.Test;
import pages.MainPage;

public class MainPageTest extends BaseTest{

MainPage mainPage = new MainPage();


    @Test
    public void checkMenu () {

        mainPage.openMainPage()
                .PopupOtherBtnClick()
                .C_leftBtnClick()
                .MenuBtnClick()
                .checkMenuText("ОСОБИСТИЙ КАБІНЕТ");
    }

    @Test
    public void checkSingIn () {

        mainPage.openMainPage();
        mainPage.PopupOtherBtnClick();
        mainPage.C_leftBtnClick();
        mainPage.MenuBtnClick();
        mainPage.checkSingIn();
    }
    @Test
    public void checkMenuAboutLink () {

        mainPage.openMainPage()
                .PopupOtherBtnClick()
                .C_leftBtnClick()
                .MenuBtnClick()
                .clickAboutUsLink()
                .checkTitle();
    }

    @Test
    public void checkPopCorn () {

        mainPage.openMainPage()
                .PopupOtherBtnClick()
                .C_leftBtnClick()
                .MenuBtnClick()
                .PopCornClick()
                .checkPopCorn("q");
    }
}
