package webdriver.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {

    @FindBy (xpath = "//span[@class='wUrVib OSrXXb']")
    private WebElement imageTabButton;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnImageTab() {
        imageTabButton.click();
    }
}

