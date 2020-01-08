package com.kodilla.animals;

public class Animal {
    public int food;
    public int water;
    public int valueFood;
    public int valueWater;
    public int value;
    public String name;
    public int consumedFood;
    public int consumedWater;

    public Animal(int food, int water, String name, int valueFood, int valueWater, int value) {
        this.food = food;
        this.water = water;
        this.valueFood = valueFood;
        this.valueWater = valueWater;
        this.value = value;
        this.name = name;
    }

    public int getFood() {
        return this.food;
    }

    public int getWater() {
        return this.water;
    }

    public int getValueFood() {
        return this.valueFood;
    }

    public int getValueWater() {
        return this.valueWater;
    }

    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

    public void feed() {
        food = food - valueFood;
        water = water - valueWater;
        consumedFood += valueFood;
        consumedWater += valueWater;
    }

    public void addFood() {
        food = food + value;
        water = water + value;
    }

    @Override
    public String toString() {
        return "Stan - jedzenia: " + food + ", wody: " + water + ".";
    }
}
