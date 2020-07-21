import framework.utils.TestProperties;
import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

import static framework.utils.BaseConfiguration.getDriver;

public class TestBase {

    @Before
    public void startUp() {
        String baseUrl = TestProperties.getProperties().getProperty("app.url");
        getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().get(baseUrl);
    }

    @After
    public void endTest() {
        getDriver().quit();
    }


}
