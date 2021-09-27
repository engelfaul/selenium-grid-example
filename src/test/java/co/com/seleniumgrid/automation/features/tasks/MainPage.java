package co.com.seleniumgrid.automation.features.tasks;

import co.com.seleniumgrid.automation.features.ui.MainPageUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MainPage {

  private MainPage() {
    throw new IllegalStateException("Utility class");
  }

  public static Performable searchWord(String word) {
    return Task.where("{0} intenta buscar",
        WaitUntil.the(MainPageUI.SEARCH_ID, isVisible()),
        Enter.theValue(word).into(MainPageUI.SEARCH_ID).thenHit(Keys.ENTER)
    );
  }

  public static Performable selectWord(String word) {
    By selectOption = By.cssSelector("[title=\"".concat(word).concat("\"]"));
    return Task.where("{0} selecciona la opción {1}",
        WaitUntil.the(selectOption, isVisible()),
        Click.on(selectOption)
    );
  }

  public static Performable selectWiktionary() {
    return Task.where("{0} selecciona la opción de Wiktionary",
        WaitUntil.the(MainPageUI.WIKTIONARY_OPTION, isVisible()),
        Click.on(MainPageUI.WIKTIONARY_OPTION)
    );
  }
}
