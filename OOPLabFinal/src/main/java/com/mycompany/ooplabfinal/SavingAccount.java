package com.mycompany.ooplabfinal;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(double interestRate, int accNum, String holderName, double balance) {
        super(accNum, holderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void accountInfo() {
        super.accountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");    
    }

    
}
