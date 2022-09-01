import org.testng.annotations.Test;
import pages.AboutUsPage;

import static com.codeborne.selenide.Selenide.open;

public class AboutUsTest extends BaseTest {

    AboutUsPage aboutPage = new AboutUsPage();

    @Test
    public void checkTitle() {
    aboutPage.openAboutPage();
    aboutPage.checkTitle();
    }
}