package framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StraxovaniePuteshestvennikov extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'kit-col_xs_12')]/h1")
    WebElement zagolovok;

    @FindBy(xpath = "//b[@class='kit-button__text' and text()='Оформить онлайн']")
    WebElement oformit;

    public StraxovaniePuteshestvennikov сheckTitle(String title) {
        Assert.assertTrue("Не совпало заголовок", zagolovok.getText().equals(title));
        return this;
    }


    public SelectTarifPage clickButtonOformit() {
        oformit.click();
        return new SelectTarifPage();
    }

}
