package com.example.demo;

public class ExchangeMoney {
    private String InputGBP;
    private String InputPLN;
    
    
    public ExchangeMoney() {
    }

    public ExchangeMoney(String InputGBP, String InputPLN) {
        this.InputGBP = InputGBP;
        this.InputPLN = InputPLN;
    }
    public String getInputGBP() {
        return InputGBP;
    }
    public void setInputGBP(String InputGBP) {
        this.InputGBP = InputGBP;
    }
    public String getInputPLN() {
        return InputPLN;
    }
    public void setInputPLN(String InputPLN) {
        this.InputPLN = InputPLN;
    }
    @Override
    public String toString() {
        return "ExchangeMoney [InputGBP=" + InputGBP + ", InputPLN=" + InputPLN + "]";
    }
}
