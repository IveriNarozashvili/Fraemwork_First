package framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZapolneniePage extends BasePage {

    @FindBy(xpath = "//input[@id='surname_vzr_ins_0']")
    WebElement surName;

    @FindBy(xpath = "//input[@id='name_vzr_ins_0']")
    WebElement name;

    @FindBy(xpath = "//input[@id='birthDate_vzr_ins_0']")
    WebElement dateOfBirth;

    @FindBy(xpath = "//input[@id='person_lastName']")
    WebElement familiya;

    @FindBy(xpath = "//input[@id='person_firstName']")
    WebElement imya;

    @FindBy(xpath = "//input[@id='person_middleName']")
    WebElement otchestvo;

    @FindBy(xpath = "//input[@id='person_birthDate']")
    WebElement dataRojdeniya;

    @FindBy(xpath = "//input[@id='passportSeries']")
    WebElement seriyaP;

    @FindBy(xpath = "//input[@id='passportNumber']")
    WebElement nomerP;

    @FindBy(xpath = "//input[@id='documentDate']")
    WebElement dataVidachi;

    @FindBy(xpath = "//input[@id='documentIssue']")
    WebElement kemVidan;

    @FindBy(xpath = "//button[contains(.,'Продолжить')]")
    WebElement prodoljit;

    @FindBy(xpath = "//input[@id='phone']/..//span")
    WebElement errorMessagePhone;

    @FindBy(xpath = "//input[@id='email']/..//span")
    WebElement errorMessageEmail;

    @FindBy(xpath = "//input[@id='repeatEmail']/..//span")
    WebElement errorMessagePemail;

    @FindBy(xpath = "//div[@class='alert-form alert-form-error']")
    WebElement errorMessageBase;

    public ZapolneniePage sendKeysSurName(String value) {
        surName.sendKeys(value);
        Assert.assertEquals("Поле не совпало", value, surName.getAttribute("value"));
        return this;
    }

    public ZapolneniePage sendKeysName(String value) {
        name.sendKeys(value);
        Assert.assertEquals("Поле не совпало", value, name.getAttribute("value"));
        return this;
    }

    public ZapolneniePage sendKeysDateOfBirth(String value) {
        dateOfBirth.sendKeys(value);
        Assert.assertEquals("Поле не совпало", value, dateOfBirth.getAttribute("value"));
        return this;
    }

    public ZapolneniePage sendKeysFamiliya(String value) {
        familiya.click();
        familiya.sendKeys(value);
        Assert.assertEquals("Поле не совпало", value, familiya.getAttribute("value"));
        return this;
    }

    public ZapolneniePage sendKeysImya(String value) {
        imya.sendKeys(value);
        Assert.assertEquals("Поле не совпало", value, imya.getAttribute("value"));
        return this;
    }

    public ZapolneniePage sendKeysOtchestvo(String value) {
        otchestvo.sendKeys(value);
        Assert.assertEquals("Поле не совпало", value, otchestvo.getAttribute("value"));
        return this;
    }

    public ZapolneniePage sendkeysDataRojdeniya(String value) {
        dataRojdeniya.sendKeys(value);
        Assert.assertEquals("Поле не совпало", value, dataRojdeniya.getAttribute("value"));
        return this;
    }


    public ZapolneniePage sendKeysSeriyaP(String value) {
        seriyaP.click();
        seriyaP.sendKeys(value);
        Assert.assertEquals("Поле не совпало", value, seriyaP.getAttribute("value"));
        return this;
    }


    public ZapolneniePage sendKeysNomerP(String value) {
        nomerP.sendKeys(value);
        Assert.assertEquals("Поле не совпало", value, nomerP.getAttribute("value"));
        return this;
    }

    public ZapolneniePage sendKeysDataVidachi(String value) {
        dataVidachi.sendKeys(value);
        Assert.assertEquals("Поле не совпало", value, dataVidachi.getAttribute("value"));
        return this;
    }


    public ZapolneniePage sendKeysKemVidan(String value) {
        kemVidan.click();
        kemVidan.sendKeys(value);
        Assert.assertEquals("Поле не совпало", value, kemVidan.getAttribute("value"));
        return this;
    }

    public ZapolneniePage clickProdoljit() {
        prodoljit.click();
        return this;
    }

    public ZapolneniePage proverkaOshibok() {
        Assert.assertEquals("Ошибки нет", "Поле не заполнено.", errorMessagePhone.getText());
        Assert.assertEquals("Ошибки нет", "Поле не заполнено.", errorMessageEmail.getText());
        Assert.assertEquals("Ошибки нет", "Поле не заполнено.", errorMessagePemail.getText());
        Assert.assertEquals("Ошибки нет", "При заполнении данных произошла ошибка", errorMessageBase.getText());
        return this;
    }
}
