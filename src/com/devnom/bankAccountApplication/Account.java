package com.devnom.bankAccountApplication;

public abstract class Account implements IBaseRate {
    // A standardization that all accounts must have
    // Abstract classes can not be instantiated

    // List common properties for saving and checking accounts
    // Constructor to set base properties and initialize the account
    // List common methods

    String name;
    String sSN;
    double balance;

    String accountNumber;
    double rate;

    static int index = 10000;

    public Account(String name, String sSn, double initDeposit) {
        this.name = name;
        this.sSN = sSn;
        this.balance = initDeposit;
        this.accountNumber =  this.setAccountNumber();
        index++;

        System.out.println("Name: " + name + "\nBalance: $" + balance + "");
    }

    private String setAccountNumber() {
        String lastTwoOfSsn = sSN.substring(sSN.length() - 2);
        int uniqueID = index;
        return lastTwoOfSsn + uniqueID;
    }
}
