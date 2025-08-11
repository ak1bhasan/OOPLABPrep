
package com.mycompany.batch57final;


public class Account implements Transaction {
    private int accNumber;
    private String holderName;
    private double balance;

    public Account(int accNumber, String holderName, double balance) throws LowBalanceException{
        if( balance < 500 ) {
            throw new LowBalanceException("Cant set below 500 taka");
        }
        
        this.accNumber = accNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) throws LowBalanceException {
        if( balance < 500 ) {
            throw new LowBalanceException("Cant set below 500 taka");
        }
        this.balance = balance;
    }
    
    public void accountInfo() {
        System.out.println("Account Holder: " + holderName + " & Account Number: " + accNumber );
    }
    
    public void currentBalance() {
        System.out.println("Curent balance: " + balance); 
    }
    
    public void currentBalance(String date) {
        System.out.println("Current balance is: " + balance +  " on " + date );
    }

    @Override
    public void sendMoney(int money) {
        balance -= money;
        System.out.println("Current balance after sending money: " + balance);
    }

    @Override
    public void receiveMoney(int money) {
        balance += money;
        System.out.println("Current Balance after adding money: " + balance);
    }

    
}
