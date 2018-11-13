import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

@Listeners(SoftAsserts.class)
public class ThirdTestClass extends BaseTest {

    @BeforeClass
    public void beforeClass() {
        open("https://www.google.ru/");
    }


    @Test
    public void test5() {
        turnOnAssertionSoft();
        findInformation("Javascript");
        assertion(1,"Javascript");
    }

    @Test(enabled = false)
    public void test6() {
        turnOnAssertionSoft();
        findInformation("Go");
        assertion(1,"Go");
    }


}
