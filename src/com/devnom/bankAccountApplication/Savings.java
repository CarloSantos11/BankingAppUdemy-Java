package com.devnom.bankAccountApplication;

public class Savings extends Account {
    // List Properties specific to a savings account

    // Constructor to initialize savings account props

    // List any methods specific to the savings account

    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    public Savings(String name, String sSn, double initDeposit) {
        super(name, sSn, initDeposit);
        this.accountNumber = "1" + this.accountNumber;
        System.out.println("Account #: " + this.accountNumber);

        System.out.println("New Savings Account");
    }
}
