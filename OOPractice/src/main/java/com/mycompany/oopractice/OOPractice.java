

package com.mycompany.oopractice;

public class OOPractice {

    public static void main(String[] args) {
        Account acc = new Account(1001, "Akib Hasan", 2000);
        acc.accountInfo();
        acc.currentBalance();
        acc.currentBalance("09-10-2025");
        acc.sendMoney(500);
        acc.recieveMoney(700);
        
        
        SavingAccount savAcc = new SavingAccount( 5.5, 2002, "Jax Teller", 1500 );
        savAcc.accountInfo();
        savAcc.currentBalance();
        savAcc.currentBalance("10-10-2025");
        savAcc.sendMoney(750);
        savAcc.recieveMoney(2000);
    }
}
