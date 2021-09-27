package co.com.seleniumgrid.automation.features.ui;

import org.openqa.selenium.By;

public class MainPageUI {

  public static final By SEARCH_ID = By.id("searchInput");
  public static final By WIKTIONARY_OPTION = By.xpath("//*[text() = 'Wiktionary']");

  private MainPageUI() {
    throw new IllegalStateException("Utility class");
  }
}
