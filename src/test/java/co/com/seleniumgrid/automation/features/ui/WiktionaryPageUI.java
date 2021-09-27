package co.com.seleniumgrid.automation.features.ui;

import org.openqa.selenium.By;

public class WiktionaryPageUI {

  public static final By SEARCH_FIELD = By.id("searchInput");


  private WiktionaryPageUI() {
    throw new IllegalStateException("Utility class");
  }
}
