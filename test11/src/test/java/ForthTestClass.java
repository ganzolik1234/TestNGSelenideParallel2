import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

@Listeners(SoftAsserts.class)
public class ForthTestClass extends BaseTest {

    @BeforeClass
    public void beforeClass() {
        open("https://www.google.ru/");
    }


    @Test
    public void test7() {
        turnOnAssertionSoft();
        findInformation("Погода");
        assertion(1,"Погода");
    }

    @Test(enabled = false)
    public void test8() {
        turnOnAssertionSoft();
        findInformation("Новости");
        assertion(1,"Новости");
    }


}
