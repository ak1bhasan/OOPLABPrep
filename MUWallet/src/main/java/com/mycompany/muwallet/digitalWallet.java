package com.mycompany.muwallet;


public class digitalWallet {
    private String ownerName;
    private int walletId;
    private double balance;

    public digitalWallet(String ownerName, int walletId, double balance) {
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
    
    void addMoney(double amount) {
        balance += amount;
        System.out.println("Amount added: " + amount);
        System.out.println("Balance after added money: " + balance);
    }
    
    void sendMoney( int walletId, double amount ) {
        if( amount > balance ) System.out.println("Error");
        else {
            balance -= amount;
            System.out.println("Sent amount " + amount + " to walletId: " + walletId);
            System.out.println("Remaining Balance: " + balance);
        }
    }
    
    void withdraw(double amount) {
        if( amount > balance ) {
            System.out.println("Error");
        }
        else {
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        }
    }
}
