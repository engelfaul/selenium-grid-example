package data;

import co.com.seleniumgrid.automation.exceptions.NotValidEnvironmentException;
import co.com.seleniumgrid.automation.exceptions.UserNotFoundException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.HashMap;
import java.util.Optional;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class DataProvider {
  @Steps(shared = true)
  private EnvironmentImplementation environment;

  JsonObject userData;
  JsonObject adminData;
  JsonObject dBData;

  @Step("Verificar si el rol tiene data de prueba")
  public void setUserRole(String clientType)
      throws UserNotFoundException, NotValidEnvironmentException {
    environment.initEnvironment();
    String data = null;
    HashMap<String, String> userScenario = new HashMap<>();
    userScenario.put("usuario de wikipedia", environment.wikipediaUser());
    data = userScenario.get(clientType);
    Optional<String> dataOptional = Optional.ofNullable(data);
    String dataVerified = dataOptional
        .orElseThrow(() -> new UserNotFoundException("Type of user does not exist in the system"));
    this.userData =  JsonParser.parseString(dataVerified).getAsJsonObject();
  }
}
