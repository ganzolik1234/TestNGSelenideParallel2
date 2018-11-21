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
        System.out.println(String.format("BeforeClass SecondTetsClass My threadID is: %s\n",Thread.currentThread().getId()));
    }


    @Test
    public void test3() {
        System.out.println(String.format("Test SecondTetsClass My threadID is: %s\n",Thread.currentThread().getId()));

        turnOnAssertionSoft();
        findInformation("Java");
        assertion(1,"Java");

    }

    @Test(enabled = false)
    public void test4() {
        System.out.println(String.format("Test SecondTetsClass My threadID is: %s\n",Thread.currentThread().getId()));

        turnOnAssertionSoft();
        findInformation("Python");
        assertion(1,"Python");

    }


}
