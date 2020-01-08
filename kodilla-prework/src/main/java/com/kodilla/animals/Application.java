package com.kodilla.animals;

import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {

        LinkedList<Animal> animal = new LinkedList<Animal>();
        animal.add(new Elephant(1000, 1000, "Słoń", 400, 300, 500));
        animal.add(new Tiger(1000, 1000, "Tygrys", 200, 80, 500));

        for (int i = 0; i < 3; i++) {
            for (int n = 0; n < animal.size(); n++) {
                int valueFood = animal.get(n).getValueFood();
                int valueWater = animal.get(n).getValueWater();
                int value = animal.get(n).getValue();
                String name = animal.get(n).getName();
                animal.get(n).feed();
                System.out.println(name + " - nakarmiono: jedzenie: " + valueFood + ", woda: " + valueWater + ". " + animal.get(n));
                animal.get(n).addFood();
                System.out.println(name + " - dodano pokarm: " + value + " i woda: " + value + ". " + animal.get(n));
            }
        }
    }
}
