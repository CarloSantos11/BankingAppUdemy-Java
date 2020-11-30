package com.devnom.bankAccountApplication;

public class Checking extends Account {
    // List Properties specific to a checking account

    // Constructor to initialize checking account props

    // List any methods specific to the checking account
    int debitCardNumber;
    int debitCardPIN;

    public Checking(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        this.accountNumber = "2" + this.accountNumber;
        System.out.println("Account #: " + this.accountNumber);
        System.out.println("New Checking Account");
    }
}
