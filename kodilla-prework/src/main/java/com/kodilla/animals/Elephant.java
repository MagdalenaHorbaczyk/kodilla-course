package com.kodilla.animals;

public class Elephant extends Animal {
    public Elephant(int food, int water, String name, int valueFood, int valueWater, int value) {
        super(food, water, name, valueFood, valueWater, value);
    }

    @Override
    public void feed() {
        food = food - valueFood;
        water = water - valueWater;
        consumedFood += valueFood;
        consumedWater += valueWater;
    }

    @Override
    public String toString() {
        return super.toString() + " " + name + " - ilość skonsumowanego dotychczas pożywienia oraz wody: " + "jedzenie: " + consumedFood + ", woda: " + consumedWater + ". ";
    }
}
