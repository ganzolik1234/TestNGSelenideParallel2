import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.AssertionMode.*;

public class BaseTest extends PageObject {

    @BeforeSuite
    public void beforeSuite() {
        turnOnAssertionStrict();
        Configuration.browserSize = "1920x1080";
    }


    protected static void turnOnAssertionSoft() {
        Configuration.assertionMode = SOFT;
    }

    protected static void turnOnAssertionStrict() {
        Configuration.assertionMode = STRICT;
    }

}
