package com.kodilla.spring.car;

import java.time.LocalTime;

public class Cabrio implements Car {
    public boolean headlightsTurnedOn;
    public String carType;
    LocalTime time;

   /* public Cabrio(boolean headlightsTurnedOn, String carType) {
        this.headlightsTurnedOn = headlightsTurnedOn;

        this.carType = carType;
    }*/
    @Override
    public boolean hasHeadlightsTurnedOn() {
        if(time == LocalTime.of(22,00));
        return headlightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return carType;
    }
}
