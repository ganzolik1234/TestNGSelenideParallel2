import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

@Listeners(SoftAsserts.class)
public class FirstTestClass extends BaseTest {

    @BeforeClass
    public void beforeClass() {
        open("https://www.google.ru/");
        System.out.println(String.format("BeforeClass FirstTetsClass My threadID is: %s\n",Thread.currentThread().getId()));
    }


    @Test
    public void test1() {
        System.out.println(String.format("Test FirstTetsClass My threadID is: %s\n",Thread.currentThread().getId()));

        turnOnAssertionSoft();
        findInformation("Selenide");
        assertion(1,"Selenide");

    }

    @Test(enabled = false)
    public void test2() {
        System.out.println(String.format("Test FirstTetsClass My threadID is: %s\n",Thread.currentThread().getId()));

        turnOnAssertionSoft();
        findInformation("Selenium");
        assertion(1,"Selenium");

    }


}
