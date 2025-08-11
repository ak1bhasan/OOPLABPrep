package com.mycompany.mudgitialwallet;

public class DigitalWallet {
    private String ownerName;
    private int walletId;
    private double balance;

    public DigitalWallet(String ownerName, int walletId, double balance) {
        this.ownerName = ownerName;
        this.walletId = walletId;
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void addMoney(double amount) {
        balance += amount;
        if( amount <= 0 ) throw new InvalidAmountException("Invalid transaction amount");
        System.out.println("Balance after adding money: " + balance);
    }
    
    public void sendMoney(int walletId, double amount) {
        balance -= amount;
        if(amount > balance) throw new InsufficientBalanceException("Insufficient balance");
        System.out.println("Sent " + amount + " to " + walletId);
        
        System.out.println("Remaining balance: " + balance);
    }
    
    public void withdraw(double amount) {
        balance -= amount;
        if(amount > balance) throw new InsufficientBalanceException("Insufficient bnalance");
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
     
}
