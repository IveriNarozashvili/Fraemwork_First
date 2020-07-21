package framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseConfiguration {

    private static WebDriver driver;
    private static Wait<WebDriver>  wait ;
    private static Actions actions ;

    private static void initDriver(){
        System.setProperty("webdriver.chrome.driver", TestProperties.getProperties().getProperty("webdriver.chrome.driver"));
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        actions = new Actions(driver);
    }


    public static WebDriver getDriver() {
        if(driver==null) {
            initDriver();
        }
        return driver;
    }

    public static Wait<WebDriver> getWait() {
        return wait;
    }

    public static Actions getActions() {
        return actions;
    }
}
