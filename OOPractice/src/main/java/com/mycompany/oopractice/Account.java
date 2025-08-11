
package com.mycompany.oopractice;


public class Account implements Transaction {
    private int accNum;
    private String holderName;
    private double balance;

    public Account(int accNum, String holderName, double balance) {
        this.accNum = accNum;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void accountInfo() {
        System.out.println("Account Holder name: " + holderName + " | Account Number: " + accNum);
    }
    
    public void currentBalance() {
        System.out.println("Current Balance is: "+balance);
    }
    
    public void currentBalance(String date) {
        System.out.println("Current balance is: " + balance + " on " + date);
    }

    @Override
    public void sendMoney(int money) {
        balance -= money;
        System.out.println("Money sent: " + money);
        System.out.println("Current Balance: " + balance);
    }

    @Override
    public void recieveMoney(int money) {
        balance += money;
        System.out.println("Money recieved: " + money);
        System.out.println("Current Balance: " + balance);
    }
    
}
