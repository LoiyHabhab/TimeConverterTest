package com.citi.ss;

public class SavingsAccount extends Account{
    public SavingsAccount(double balance, String name) {
        super(balance, name);
    }
    @Override
    public void addInterest(){
        setBalance(getBalance()*1.4);
    }

    @Override
    public String getDetails() {
        return "" + getName() + " " + getBalance();
    }
}
