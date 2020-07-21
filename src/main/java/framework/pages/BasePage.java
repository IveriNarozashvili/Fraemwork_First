package framework.pages;

import org.openqa.selenium.support.PageFactory;

import static framework.utils.BaseConfiguration.getDriver;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(getDriver(),this);
    }
}
