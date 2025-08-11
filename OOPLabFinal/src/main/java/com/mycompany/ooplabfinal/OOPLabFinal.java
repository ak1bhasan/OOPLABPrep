package com.mycompany.ooplabfinal;

public class OOPLabFinal {

    public static void main(String[] args) {
//        Account acc = new Account(1001, "Akib Hasan", 2000);  
//        acc.accountInfo();
//        acc.currentBalance();
//        acc.currentBalance("08-08-2025");
//        acc.sendMoney(500);
//        acc.receiveMoney(5000);
//        
//        SavingAccount savAcc = new SavingAccount(5.5, 2002, "Jax Teller", 5000);
//
//        savAcc.accountInfo();
//        savAcc.currentBalance();
//        savAcc.currentBalance("10-08-2025");
//        
//        savAcc.sendMoney(500);
//        savAcc.receiveMoney(2000);
//        
//        try {
//            acc.sendMoney(1500);
//        } catch(LowBalanceException e) {
//            System.out.println("Error: " + e.getMessage());
//        }





        Account acc1 = new Account(1001, "Akib Hasan", 2000);
        acc1.accountInfo();
        acc1.currentBalance();

        // Normal transaction (should work fine)
        acc1.sendMoney(1000); // balance now 1000
        acc1.receiveMoney(200); // balance now 1200

        // This should trigger LowBalanceException
        try {
            acc1.sendMoney(800); // would make balance 400 → not allowed
        } catch (LowBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // This should also trigger exception via setBalance()
        try {
            acc1.setBalance(300); // directly setting below 500
        } catch (LowBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}
