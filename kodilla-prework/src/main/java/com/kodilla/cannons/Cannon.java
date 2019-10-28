package com.kodilla.cannons;

public class Cannon {
    private boolean loaded;

    public Cannon(boolean loaded){
        this.loaded = loaded;
    }

    public boolean getLoaded(){
        return loaded;
    }

    public void fire(){
        if(loaded){
            System.out.println("Cannon loaded, fire!");
            loaded = false;
        }else{
            System.out.println("Cannon not loaded");
            loaded = true;
            System.out.println("Cannon already loaded");
        }
    }
}
