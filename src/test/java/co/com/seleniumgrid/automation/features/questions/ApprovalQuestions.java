package co.com.seleniumgrid.automation.features.questions;

import co.com.seleniumgrid.automation.features.ui.SuccessSearchUI;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ApprovalQuestions {

  public static Question<String> titleSearhResult() {
    return actor -> Text.of(SuccessSearchUI.TITTLE_SEARCH).viewedBy(actor).asString();
  }
}
