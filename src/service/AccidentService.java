package service;

import model.Accident;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class AccidentService {

    public Accident createAccident(LocalDate date, String description, BigDecimal damagePrice, int failureRate){
        Accident accident = new Accident(date, description, damagePrice, failureRate);

        return accident;
    }


}
