package com.citi.ss;

public class HomeInsurance implements Detailable {
    private double amountInsured;
    private double excess;
    private double premium;

    public HomeInsurance(double amountInsured, double excess, double premium) {
        this.amountInsured = amountInsured;
        this.excess = excess;
        this.premium = premium;
    }

    @Override
    public String getDetails() {
        return  "" + premium + " " + excess;
    }
}
