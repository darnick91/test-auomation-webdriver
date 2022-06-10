package webdriver.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy (xpath = "//input[@class='gLFyf gsfi']")
    private WebElement searchField;

    @FindBy (xpath = "//input[@class='gLFyf gsfi']")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        searchField.sendKeys(keyword);
        searchField.sendKeys(Keys.ENTER);
    }

}
