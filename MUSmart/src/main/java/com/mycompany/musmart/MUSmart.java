package com.mycompany.musmart;


public class MUSmart {

    public static void main(String[] args) {
//        Smartphone phone = new Smartphone("3209584724", "Samsung", 100);
//        phone.deviceInfo();
//        phone.showBattery();
//        phone.showBattery("20-10-2020");
//        phone.installApp("WhatsApp");
//        phone.uninstallApp("WhatsApp");
//        
//        FoldablePhone fold = new FoldablePhone(90, "23057843752", "Infinix", 99);
//        fold.deviceInfo();
//        fold.showBattery();
//        fold.showBattery("10-10-2023");
//        fold.installApp("PUBG");
//        fold.uninstallApp("PUBG");


    try{
        Smartphone phone =  new Smartphone( "8234728535", "Iphone", 700 );
    } catch(LowBatteryException e) {
        System.out.println("Error creating smartphone: " + e.getMessage());
    }
    
    }
}
