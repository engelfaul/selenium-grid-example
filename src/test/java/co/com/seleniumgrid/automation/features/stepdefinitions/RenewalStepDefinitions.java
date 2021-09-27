package co.com.seleniumgrid.automation.features.stepdefinitions;

import java.net.MalformedURLException;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import co.com.seleniumgrid.automation.config.StepBase;
import co.com.seleniumgrid.automation.features.questions.ApprovalQuestions;
import co.com.seleniumgrid.automation.features.tasks.MainPage;
import co.com.seleniumgrid.automation.features.tasks.WiktionaryPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;
import co.com.seleniumgrid.automation.exceptions.NotValidEnvironmentException;


public class RenewalStepDefinitions extends StepBase {

  private EnvironmentVariables environmentVariables;

  @Before
  public void setTheStage() throws NotValidEnvironmentException {
    String theRestApiBaseUrl;
    theRestApiBaseUrl = environmentVariables.getProperty("restapi.baseurl");
    OnStage.setTheStage(OnlineCast.whereEveryoneCan(
        CallAnApi.at(theRestApiBaseUrl)
    ));
  }

  @When("{word} selecciona la opción {}")
  public void selectSearch(String actor, String word) {
    OnStage.withCurrentActor(
        MainPage.selectWord(word));
  }

  @When("{word} busca en el diccionario {word}")
  public void searchWiktionary(String actor, String word) {
    OnStage.withCurrentActor(
        WiktionaryPage.searchWiktionary(word));
  }

  @When("{word} busca {word}")
  public void searchWord(String actor, String word) {
    OnStage.withCurrentActor(
        MainPage.searchWord(word));
  }

  @When("{word} se dirige a la opción de Wiktionary")
  public void searchWiktionary(String actor) {
    OnStage.withCurrentActor(
        MainPage.selectWiktionary());
  }


  @Then("{word} puede ver el resultado de la busqueda {}")
  public void verifySearch(String actor, String word) throws MalformedURLException {

    theActorInTheSpotlight()
        .should(seeThat("Validación", ApprovalQuestions.titleSearhResult(),
            equalTo(word)));
  }

}
