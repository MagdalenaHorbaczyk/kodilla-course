package com.kodilla.spring.car;

public class Sedan implements Car {
    public boolean headlightsTurnedOn;
    public String carType;

   /* public Sedan(boolean headlightsTurnedOn*//*, String carType*//*) {
        this.headlightsTurnedOn = headlightsTurnedOn;
*//*
        this.carType = carType;
*//*
    }*/
    @Override
    public boolean hasHeadlightsTurnedOn() {
        return headlightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return carType;
    }
}
