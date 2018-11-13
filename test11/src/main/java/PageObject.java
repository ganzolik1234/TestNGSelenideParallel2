import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.*;

public class PageObject {

SelenideElement inputSearch =$(byName("q"));

ElementsCollection result = $$("#ires .g");




public void findInformation(String someText) {
    inputSearch.waitUntil(visible,10000).val(someText).pressEnter();
}


public void assertion(int expectedSize, String someText) {
    result.shouldHave(sizeGreaterThan(expectedSize));
    result.shouldHave(texts(someText));
}



}
