package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static framework.utils.BaseConfiguration.getActions;
import static framework.utils.BaseConfiguration.getWait;


public class MenuPage extends BasePage {
    @FindBy(xpath = "//button[@class='lg-menu__link']")
    List<WebElement> menuBase;

    @FindBy(xpath = "//a[@class='lg-menu__sub-link' and text()]")
    List<WebElement> menuSub;


    public MenuPage selectBaseMenu(String nameBaseMenu) {
        for (WebElement itm : menuBase) {
            if (itm.getText().equalsIgnoreCase(nameBaseMenu)) {
                getActions().moveToElement(itm).build().perform();
                break;
            }
        }
        return this;
    }

    public StraxovaniePuteshestvennikov selectSubMenu(String nameSubMenu) {
        for (WebElement itm : menuSub) {
            if (itm.getText().equalsIgnoreCase(nameSubMenu)) {
                getActions().moveToElement(itm).build().perform();
                getWait().until(ExpectedConditions.visibilityOf(itm)).click();
                break;
            }
        }
        return new StraxovaniePuteshestvennikov();
    }

}
