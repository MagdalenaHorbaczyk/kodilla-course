package com.kodilla.cannons;

import java.util.LinkedList;

public class Application {
    public static void main (String[] args){
        LinkedList<Cannon> cannons = new LinkedList<Cannon>();

        cannons.add(new Cannon(true));
        cannons.add(new Cannon(true));
        cannons.add(new Cannon(false));
        cannons.add(new Cannon(false));
        cannons.add(new Cannon(true));

        for(int n=0;n<3;n++){
            for(int i=0;i<cannons.size();i++){
                cannons.get(i).fire();
            }
        }
    }
}
