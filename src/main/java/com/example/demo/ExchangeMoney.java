package com.example.demo;

public class ExchangeMoney {

    private Double GBP;
    private Double PLN;

    public Double getGBP() {
        return GBP;
    }

    public void setGBP(Double gBP) {
        GBP = gBP;
    }

    public Double getPLN() {
        return PLN;
    }

    public void setPLN(Double pLN) {
        PLN = pLN;
    }

    @Override
    public String toString() {
        return "ExchangeMoney [InputGBP=" + GBP + ", InputPLN=" + PLN + "]";
    }
}
