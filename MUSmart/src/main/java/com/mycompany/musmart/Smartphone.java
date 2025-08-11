package com.mycompany.musmart;


public class Smartphone implements AppManagement {
    private String imei;
    private String brand;
    private int batteryCapacity;

    public Smartphone(String imei, String brand, int batteryCapacity) throws LowBatteryException 
    {
        if( batteryCapacity < 1000 ) {
            throw new LowBatteryException("Battey is too low");
        }
        this.imei = imei;
        this.brand = brand;
        this.batteryCapacity = batteryCapacity;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) //throws LowBatteryException 
    {
//        if( batteryCapacity < 1000 ) {
//            throw new LowBatteryException("Battery is too low");
//        }
        this.batteryCapacity = batteryCapacity;
    }
    
    public void deviceInfo() {
        System.out.println("IMEI: " + imei + " Brand: " + brand);
    }
    
    public void showBattery() {
        System.out.println("Battery Capacity of the phone: " + batteryCapacity);
    }
    
    public void showBattery(String date) {
        System.out.println("Battery capacity showed in: " + date);
    }

    @Override
    public void installApp(String app) {
        System.out.println("Installing app: " + app);
    }

    @Override
    public void uninstallApp(String app) {
        System.out.println("Uninstalling app: " + app);
    }
    
}
