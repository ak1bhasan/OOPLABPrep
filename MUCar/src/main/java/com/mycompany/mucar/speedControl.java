package com.mycompany.mucar;

public interface speedControl {
    void accelerate(double inc) throws overspeedException;
    void brake(double dec);
}
