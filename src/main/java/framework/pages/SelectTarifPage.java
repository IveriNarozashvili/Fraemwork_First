package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectTarifPage extends BasePage{



    @FindBy(xpath ="//online-card-program/div" )
    WebElement minimalnaya;

    @FindBy(xpath = "//button[contains(.,'Оформить')]")
    WebElement oformlenie;

    public SelectTarifPage clickMinimalnaya(){
        minimalnaya.click();
        return this;
    }


    public ZapolneniePage clickButtonOformlenie(){
        oformlenie.click();
        return new ZapolneniePage();
    }

}
