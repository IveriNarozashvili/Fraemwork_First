import framework.pages.MenuPage;
import org.junit.Test;

public class Test_2 extends TestBase {

    @Test
    public void startTest() {
        MenuPage menuPage = new MenuPage();

        menuPage.selectBaseMenu("Страхование")
                .selectSubMenu("Страхование путешественников")
                .сheckTitle("Страхование путешественников")
                .clickButtonOformit()
                .clickMinimalnaya()
                .clickButtonOformlenie()
                .sendKeysSurName("Privet")
                .sendKeysName("Chuvak")
                .sendKeysDateOfBirth("12.06.1990")
                .sendKeysFamiliya("Петров")
                .sendKeysImya("Вася")
                .sendKeysOtchestvo("Петрович")
                .sendkeysDataRojdeniya("16.07.1980")
                .sendKeysSeriyaP("4510")
                .sendKeysNomerP("745602")
                .sendKeysDataVidachi("16.09.2019")
                .sendKeysKemVidan("Кемто")
                .clickProdoljit()
                .proverkaOshibok();
    }
}
