import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

@Listeners(SoftAsserts.class)
public class ThirdTestClass extends BaseTest {

    @BeforeClass
    public void beforeClass() {
//        open("https://www.google.ru/");
        System.out.println(String.format("BeforeClass ThirdTetsClass My threadID is: %s\n",Thread.currentThread().getId()));
    }


    @Test
    public void test5() {
        System.out.println(String.format("Test ThirdTetsClass My threadID is: %s\n",Thread.currentThread().getId()));

        turnOnAssertionSoft();
        findInformation("Javascript");
        assertion(1,"Javascript");

    }

    @Test(enabled = false)
    public void test6() {
        System.out.println(String.format("Test ThirdTetsClass My threadID is: %s\n",Thread.currentThread().getId()));

        turnOnAssertionSoft();
        findInformation("Go");
        assertion(1,"Go");

    }


}
