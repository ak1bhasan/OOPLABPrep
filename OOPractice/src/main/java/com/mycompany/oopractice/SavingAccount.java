
package com.mycompany.oopractice;


public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(double interestRate, int accNum, String holderName, double balance) {
        super(accNum, holderName, balance);
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void currentBalance() {
        System.out.println("Current balance in the saving account is " + getBalance());
    }
    
}
