package service;

import model.Insurance;
import model.InsuranceTypeEnum;

public class InsuranceService {

    public Insurance createInsurance(InsuranceTypeEnum insuranceTypeEnum, String name) {
        Insurance insurance = new Insurance();
        insurance.setName(name);
        insurance.setInsuranceTypeEnum(insuranceTypeEnum);
        return insurance;

    }
}
