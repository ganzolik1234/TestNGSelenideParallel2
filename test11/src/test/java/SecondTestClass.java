import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

@Listeners(SoftAsserts.class)
public class SecondTestClass extends BaseTest {

    @BeforeClass
    public void beforeClass() {
        open("https://www.google.ru/");
    }


    @Test
    public void test3() {
        turnOnAssertionSoft();
        findInformation("Java");
        assertion(1,"Java");
    }

    @Test(enabled = false)
    public void test4() {
        turnOnAssertionSoft();
        findInformation("Python");
        assertion(1,"Python");
    }


}
