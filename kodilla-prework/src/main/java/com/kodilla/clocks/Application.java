package com.kodilla.clocks;

import java.util.LinkedList;

public class Application {
    public static void main (String[] args){
        LinkedList<Clock> clocks = new LinkedList<Clock>();

        clocks.add(new Clock(10, 10));
        clocks.add(new Clock(11, 59));
        clocks.add(new Clock(23, 59));

        for(int i=0;i<clocks.size();i++){
            System.out.println(clocks.get(i).getHour());
            clocks.get(i).moveForward();
            System.out.println(clocks.get(i).getHour());
        }
    }
}
