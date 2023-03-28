package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import pom.ComicsPage;
import pom.HomePage;

public class TestBase {

    protected WebDriver driver = Hooks.getDriver();
    protected HomePage homePage = new HomePage(driver);
    protected ComicsPage comicsPage = new ComicsPage(driver);
}
