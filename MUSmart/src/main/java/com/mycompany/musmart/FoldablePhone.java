package com.mycompany.musmart;


public class FoldablePhone extends Smartphone {
    private int foldAngle;

    public FoldablePhone(int foldAngle, String imei, String brand, int batteryCapacity) {
        super(imei, brand, batteryCapacity);
        this.foldAngle = foldAngle;
    }

    public int getFoldAngle() {
        return foldAngle;
    }

    public void setFoldAngle(int foldAngle) {
        this.foldAngle = foldAngle;
    }

    @Override
    public void deviceInfo() {
        super.deviceInfo();
        System.out.println("Fold Angle: " + foldAngle + " degrees");
    }

    
    
    
    
}
