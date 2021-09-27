package co.com.seleniumgrid.automation.features.tasks;

import co.com.seleniumgrid.automation.features.ui.WiktionaryPageUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class WiktionaryPage {

  private WiktionaryPage() {
    throw new IllegalStateException("Utility class");
  }

  public static Performable searchWiktionary(String word) {
    return Task.where("{0} intenta buscar ".concat(word),
        WaitUntil.the(WiktionaryPageUI.SEARCH_FIELD, isVisible()),
        Enter.theValue(word).into(WiktionaryPageUI.SEARCH_FIELD).thenHit(Keys.ENTER)
    );
  }
}
