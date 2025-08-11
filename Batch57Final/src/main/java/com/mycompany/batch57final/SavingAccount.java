package com.mycompany.batch57final;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(double interestRate, int accNumber, String holderName, double balance) throws LowBalanceException {
        super(accNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void currentBalance() {
        System.out.println("Current balance in the saving account is: "+ getBalance());
    }
    
    
    
    
}
