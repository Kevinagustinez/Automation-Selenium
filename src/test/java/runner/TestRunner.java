package runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import utils.LogHelper;

import java.util.logging.Level;
import java.util.logging.Logger;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"seleniumgluecode"},
        plugin = {"json:test/report/cucumber_report.json"},
        snippets = CAMELCASE
)

public class TestRunner {

    private static final Logger LOGGER = LogHelper.getLogger();
    @AfterClass
    public static void finish() {
        try {
            LOGGER.log(Level.INFO, "Generando reporte...");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            LOGGER.log(Level.INFO, "Reporte generado satisfactoriamente!");
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "No se pudo generar reporte.");
            e.printStackTrace();
        }
    }
}
