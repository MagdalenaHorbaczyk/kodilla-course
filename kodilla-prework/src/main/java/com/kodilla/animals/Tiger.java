package com.kodilla.animals;

public class Tiger extends Animal{
    public Tiger(int food, int water, String name, int valueFood, int valueWater, int value) {
        super(food, water, name, valueFood, valueWater, value);
    }

    @Override
    public void feed() {
        food = food-valueFood;
        water = water-valueWater;
        consumedFood+= valueFood;
        consumedWater+= valueWater;
    }

    @Override
    public String toString() {
        return  super.toString() + " " + name + " - ilość skonsumowanego dotychczas pożywienia i wody: " +"jedzenie: " + consumedFood + ", woda: " + consumedWater + ". ";
    }
}
