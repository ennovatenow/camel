package com.evolvus.training.camel.domain;

import java.io.Serializable;

public class ISO3166 implements Serializable {

    private static final long serialVersionUID = 2451299894417769395L;
    private String entity;
    private String currency;
    private String alphabeticCode;
    private String numericCode;
    private String minorUnit;

    @Override
    public String toString() {
        return String
                .format("ISO4217[entity=%s,currency=%s, alphabeticCode=%s,numericCode=%s, minorUnit=%s]",
                        entity, currency, alphabeticCode, numericCode,
                        minorUnit);
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAlphabeticCode() {
        return alphabeticCode;
    }

    public void setAlphabeticCode(String alphabeticCode) {
        this.alphabeticCode = alphabeticCode;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public String getMinorUnit() {
        return minorUnit;
    }

    public void setMinorUnit(String minorUnit) {
        this.minorUnit = minorUnit;
    }

}
