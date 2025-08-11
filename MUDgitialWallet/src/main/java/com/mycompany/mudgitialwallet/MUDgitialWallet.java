package com.mycompany.mudgitialwallet;

public class MUDgitialWallet {

    public static void main(String[] args) {
        DigitalWallet dg = new DigitalWallet("Akib Hasan", 1001, 2000.00);
        dg.addMoney(500);
        dg.sendMoney(2002, 500.50);
        dg.withdraw(500.55);
        
        try{
        DigitalWallet dg1 = new DigitalWallet("Jax", 2002, 500.00);
        dg1.addMoney(500);
        dg1.sendMoney(3003, 1000.5);
        dg1.withdraw(500.55);
        }catch(InvalidAmountException | InsufficientBalanceException e) {
            System.out.println("Transaction failed: " +  e.getMessage());
        }
        
    }
}
