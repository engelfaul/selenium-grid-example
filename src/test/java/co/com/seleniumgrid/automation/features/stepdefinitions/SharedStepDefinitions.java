package co.com.seleniumgrid.automation.features.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import co.com.seleniumgrid.automation.config.StepBase;
import co.com.seleniumgrid.automation.exceptions.NotValidEnvironmentException;
import co.com.seleniumgrid.automation.exceptions.UserNotFoundException;
import co.com.seleniumgrid.automation.features.tasks.NavigateTo;
import io.cucumber.java.en.Given;
import java.net.MalformedURLException;


public class SharedStepDefinitions extends StepBase {

  @Given("{word} es un {}")
  public void userRole(String actor, String userRole) throws UserNotFoundException, NotValidEnvironmentException, MalformedURLException {
    theActorCalled(actor).attemptsTo(NavigateTo.salaryLoansGoHomePage());
    dataProvider.setUserRole(userRole);
  }
}
