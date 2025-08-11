package com.mycompany.muwallet;


public class MUWallet {

    public static void main(String[] args) {
        digitalWallet dWallet = new digitalWallet( "Akib Hasan", 1001, 200.0 );
        
        dWallet.addMoney(100.50);
        dWallet.sendMoney(2002, 50.5);
        dWallet.withdraw(200);
        
    }
}
