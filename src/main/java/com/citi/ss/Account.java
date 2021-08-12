package com.citi.ss;

public abstract class Account implements Detailable{
    private double balance;
    private String name;
    private static double interestRate;

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public abstract void addInterest();

    public boolean withdraw(double amount){
        if(this.balance>=amount){
            this.balance = this.balance - amount;
            return true;
        }else{
            return false;
        }
    }
    public boolean withdraw(){
        if(this.balance>=20){
            this.balance = this.balance - 20;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }
}
