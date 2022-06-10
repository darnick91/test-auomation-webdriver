package webdriver.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {

    private String SEARCH_KEYWORD = "image";

    @FindBy (xpath = "//img[contains(@src,'image')]")
    private WebElement imageExpected;

    @Test
    public void checkThatImageTabContainsImages() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getSearchResultForAnImage().implicitWait(30);
        getSearchResultPage().clickOnImageTab();
        getSearchResultForAnImage().implicitWait(30);
        for (WebElement webElement : getSearchResultForAnImage().getSearchResultsList()) {
            assertTrue(webElement.getText().contains(SEARCH_KEYWORD));
        }
    }
}
