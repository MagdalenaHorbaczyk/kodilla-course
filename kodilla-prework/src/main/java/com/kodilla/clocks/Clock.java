package com.kodilla.clocks;

import java.time.LocalTime;

public class Clock {
    private LocalTime setHour;

    public Clock(int hour, int minutes){
        this.setHour = LocalTime.of(hour, minutes);
    }

    public LocalTime getHour(){
        return setHour;
    }

    public void moveForward(){
        setHour = setHour.plusMinutes(1);
    }
}
