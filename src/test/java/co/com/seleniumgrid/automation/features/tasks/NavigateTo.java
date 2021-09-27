package co.com.seleniumgrid.automation.features.tasks;

import co.com.seleniumgrid.automation.features.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

  private NavigateTo() {
    throw new IllegalStateException("Utility class");
  }

  public static Performable salaryLoansGoHomePage() {
    return Task.where("{0} abre la pagina de libranzas",
        Open.browserOn().the(HomePage.class)
    );
  }
}
