package data;

import co.com.seleniumgrid.automation.exceptions.NotValidEnvironmentException;
import net.thucydides.core.annotations.Step;
import org.aeonbits.owner.ConfigFactory;

public class EnvironmentImplementation implements Environment {

  private Environment environment;

  @Step("Validar que existen datos de prueba para el ambiente especificado")
  public void initEnvironment() throws NotValidEnvironmentException {
    if (environment == null) {
      environment = ConfigFactory.create(Environment.class);
    }
    if (environment.toString().equals("{}")) {
      throw new NotValidEnvironmentException(
          "  Cause: Not a valid environment, or not specified. Please use -Denvironment=env_name to set a valid environment");
    }
  }

  @Override
  public String wikipediaUser() {
    return environment.wikipediaUser();
  }

  @Override
  public String clientAnyFee() {
    return environment.clientAnyFee();
  }

  @Override
  public String clientRnec() {
    return environment.clientRnec();
  }

  @Override
  public String clientRnecSameFee() {
    return environment.clientRnecSameFee();
  }

  @Override
  public String clientDecrimSameFee() {
    return environment.clientDecrimSameFee();
  }

  @Override
  public String clientDecrim() {
    return environment.clientDecrim();
  }

  @Override
  public String clientDecrimRnec() {
    return environment.clientDecrimRnec();
  }

  @Override
  public String clientDecrimRnecSameFee() {
    return environment.clientDecrimRnecSameFee();
  }

  @Override
  public String clientRnecSygnus() {
    return environment.clientRnecSygnus();
  }

  @Override
  public String clientSameFeeWithoutDocuments() {
    return environment.clientSameFeeWithoutDocuments();
  }

  @Override
  public String clientSameFeeHuellas() {
    return environment.clientSameFeeHuellas();
  }

  @Override
  public String clientAnyFeeHuellas() {
    return environment.clientAnyFeeHuellas();
  }

  @Override
  public String clientWithoutLoan() {
    return environment.clientWithoutLoan();
  }

  @Override
  public String clientWithDisbursementLoan() {
    return environment.clientWithDisbursementLoan();
  }

  @Override
  public String adviserProd() {
    return environment.adviserProd();
  }

  @Override
  public String dBData() {
    return environment.dBData();
  }

  @Override
  public String clientNewLoan() {
    return environment.clientNewLoan();
  }

  @Override
  public String adminCredentials() {
    return environment.adminCredentials();
  }
}
