package webdriver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultForAnImagePage extends BasePage{

    @FindBy (xpath = "//div[@class='islrc']")
    private List<WebElement> searchResultsImagesList;

    public SearchResultForAnImagePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSearchResultsList() {
        return searchResultsImagesList;
    }

}
