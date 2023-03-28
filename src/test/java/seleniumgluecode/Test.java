package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Test extends TestBase {

    @Given("^El usuario se encuentra en la pagina Home de imalittletester$")
    public void elUsuarioSeEncuentraEnLaPaginaHomeDeimalittletester() throws Exception {
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^Hace click sobre el boton Latest Comics$")
    public void haceClickSobreElBotonLatestComics() throws Exception {
        homePage.clickOnTitleComics();
    }

    @Then("^Se debe redirigir a la pantalla The Little Tester Comics Series$")
    public void seDeberRedirigirALaPantallaTheLittleTesterComicsSeries() throws Exception {
        Assert.assertTrue("No se redirecciono correctamente a la pagina de Comics", comicsPage.isTitleComicsDisplayed());
    }
}
