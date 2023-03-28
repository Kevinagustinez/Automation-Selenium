package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {
    private static WebDriver driver;
    private static int numberOfCase = 0;
    private DriverManager driverManager;
    private static final Logger LOGGER = LoggerFactory.getLogger(Hooks.class);

    @Before
    public void setUp() {
        LOGGER.info("####################################");
        LOGGER.info("      [ Ejecutando programa ]       ");
        LOGGER.info("####################################");
        numberOfCase++;
        LOGGER.info("####################################");
        LOGGER.info("Se esta ejecutando el escenario nro: " + numberOfCase);
        LOGGER.info("####################################");
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://www.imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        LOGGER.info("################################################################");
        LOGGER.info("El escenario nro: " + numberOfCase + " se ejecuto correctamente.");
        LOGGER.info("################################################################");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
