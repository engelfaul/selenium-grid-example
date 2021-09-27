package data;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${environment}.properties"})

public interface Environment extends Config {
    String wikipediaUser();
    String clientAnyFee();
    String clientRnec();
    String clientRnecSameFee();
    String clientDecrimSameFee();
    String clientDecrim();
    String clientDecrimRnec();
    String clientDecrimRnecSameFee();
    String clientRnecSygnus();
    String clientSameFeeWithoutDocuments();
    String clientSameFeeHuellas();
    String clientAnyFeeHuellas();
    String clientWithoutLoan();
    String adminCredentials();
    String clientWithDisbursementLoan();
    String clientNewLoan();
    String adviserProd();
    String dBData();
}
