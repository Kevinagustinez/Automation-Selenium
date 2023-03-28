package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComicsPage extends BasePage {

    private By pageTitleLocator = By.cssSelector("h2[class='font_0']");
    private String titlePage = "THE LITTLE TESTER COMICS SERIES";

    public ComicsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isTitleComicsDisplayed() throws Exception {
        return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titlePage);
    }

}
