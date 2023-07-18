package model;

import java.math.BigDecimal;
import java.util.Date;

public class Accident {

    private Date date;

    private String description;
    private BigDecimal damagePrice;
    private int failureRate;


    public Accident() {
    }

    public Accident(Date date, String description, BigDecimal damagePrice, int failureRate) {
        this.date = date;
        this.description = description;
        this.damagePrice = damagePrice;
        this.failureRate = failureRate;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getDamagePrice() {
        return damagePrice;
    }

    public void setDamagePrice(BigDecimal damagePrice) {
        this.damagePrice = damagePrice;
    }

    public int getFailureRate() {
        return failureRate;
    }

    public void setFailureRate(int failureRate) {
        this.failureRate = failureRate;
    }
}
