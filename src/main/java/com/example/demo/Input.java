package com.example.demo;

public class Input {
    private String InputGBP;
    private String InputPLN;

    public Input() {
    }

    public Input(String inputGBP, String inputPLN) {
        InputGBP = inputGBP;
        InputPLN = inputPLN;
    }

    public String getInputGBP() {
        return InputGBP;
    }

    public void setInputGBP(String inputGBP) {
        InputGBP = inputGBP;
    }

    public String getInputPLN() {
        return InputPLN;
    }

    public void setInputPLN(String inputPLN) {
        InputPLN = inputPLN;
    }

    @Override
    public String toString() {
        return "Input [InputGBP=" + InputGBP + ", InputPLN=" + InputPLN + "]";
    }
    
}
