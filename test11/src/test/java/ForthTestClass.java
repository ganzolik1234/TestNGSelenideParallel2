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
        System.out.println(String.format("BeforeClass ForthTetsClass My threadID is: %s\n",Thread.currentThread().getId()));
    }


    @Test
    public void test7() {
        System.out.println(String.format("Test ForthTetsClass My threadID is: %s\n",Thread.currentThread().getId()));

        turnOnAssertionSoft();
        findInformation("Погода");
        assertion(1,"Погода");

    }

    @Test(enabled = false)
    public void test8() {
        System.out.println(String.format("Test ForthTetsClass My threadID is: %s\n",Thread.currentThread().getId()));

        turnOnAssertionSoft();
        findInformation("Новости");
        assertion(1,"Новости");

    }


}
