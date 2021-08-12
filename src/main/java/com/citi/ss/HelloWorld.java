package com.citi.ss;

public class HelloWorld {



    public static void main(String[] args) {


        Account[] accounts = new Account[2];
        double[]amounts = {2,4,6};
        String[] names = {"Sam","Jack","Michael"};

        accounts[0] = new SavingsAccount(amounts[0],names[0]);
        accounts[1] = new CurrentAccount(amounts[1],names[1]);
        /*
        for (Account account: accounts){
            account.addInterest();
            System.out.println(account);
        }
        */
        Detailable[] detailables = new Detailable[3];
        detailables[0] = new SavingsAccount(amounts[0],names[0]);
        detailables[1] = new CurrentAccount(amounts[1],names[1]);
        detailables[2] = new HomeInsurance(500,200,100);

        for (Detailable detailable:detailables){
            System.out.println(detailable.getDetails());
        }

        Detailable det = () -> {return "Hello World";};
        System.out.println(det.getDetails());

    }


}
