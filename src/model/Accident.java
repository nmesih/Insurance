package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.spi.LocaleServiceProvider;

public class Accident {

    private LocalDate date;

    private String description;
    private BigDecimal damagePrice;
    private int failureRate;


    public Accident() {
    }

    public Accident(LocalDate date, String description, BigDecimal damagePrice, int failureRate) {
        this.date = date;
        this.description = description;
        this.damagePrice = damagePrice;
        this.failureRate = failureRate;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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

    @Override
    public String toString() {
        return "Accident{" +
                "date=" + date +
                ", description='" + description + '\'' +
                ", damagePrice=" + damagePrice +
                ", failureRate=" + failureRate +
                '}';
    }
}
