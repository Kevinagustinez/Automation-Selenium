package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private String titleHomePage = "Testing | imalittletester";
    private By titleComicsLocator = By.id("comp-iiyocj9v5");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean homePageIsDisplayed() throws Exception {
        return this.getTitle().equals(titleHomePage);
    }

    public void clickOnTitleComics() throws Exception {
        this.click(titleComicsLocator);
    }
}
