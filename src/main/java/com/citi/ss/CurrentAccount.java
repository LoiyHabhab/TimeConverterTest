package com.citi.ss;

public class CurrentAccount extends Account{
    public CurrentAccount(double balance, String name) {
        super(balance, name);
    }
    @Override
    public void addInterest(){
        setBalance(getBalance()*1.1);
    }

    @Override
    public String getDetails() {
        return "" + getName() + " " + getBalance();
    }
}
