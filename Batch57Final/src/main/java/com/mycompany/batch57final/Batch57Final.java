package com.mycompany.batch57final;


public class Batch57Final {

    public static void main(String[] args) {
//        Account Acc = new Account(2002, "Akib Hasan", 2000.60);
//        Acc.accountInfo();
//        Acc.currentBalance();
//        Acc.currentbalance("20-10-2023");
//        Acc.sendMoney(500);
//        Acc.receiveMoney(600);
        
//        SavingAccount savAcc = new SavingAccount(5.5, 2002, "Jax Teller", 5000.65);
//        savAcc.accountInfo();
//        savAcc.currentBalance();
//        savAcc.currentbalance("10-10-2022");
//        savAcc.sendMoney(500);
//        savAcc.receiveMoney(700);
//        
//       try{
//            Account Acc1 = new Account(3003, "Blah", 400);
//        }catch(LowBalanceException e) {
//          System.out.println("Error! " + e.getMessage());      
//        }

    try {
            Account acc = new Account(1001, "Akib Hasan", 2000);
            acc.accountInfo();
            acc.currentBalance();
            acc.currentBalance("09-08-2025");

            acc.sendMoney(500);
            acc.receiveMoney(1000);

            SavingAccount savAcc = new SavingAccount(5.5, 2002, "Jax Teller", 5000);
            savAcc.accountInfo();
            savAcc.currentBalance();
            savAcc.currentBalance("10-08-2025");

            savAcc.sendMoney(200);
            savAcc.receiveMoney(800);

            // Testing exception
            System.out.println("\nTesting LowBalanceException:");
            acc.setBalance(400); // This will throw exception

        } catch (LowBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    
        
    }
}
