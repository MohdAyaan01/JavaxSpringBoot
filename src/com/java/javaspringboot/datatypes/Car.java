package com.java.javaspringboot.datatypes;

import com.java.javaspringboot.controlflow.Vehicle;

public class Car extends Vehicle {
    int speed;
    private String Color;
    public Car(String color){
        this.Color = color;
    }
    public void SetSpeed(int speed){
        if(speed < 0){
            System.out.println("Not Possible");
        }else {
            this.speed = speed;
            System.out.println("Driving At" + speed);
        }
    }
}
