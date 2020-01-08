package com.kodilla.sum_racing;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int counter = 0;
        int sumaA = 1000;
        int sumaB = 0;

        Random randomGenerator = new Random();
        while (sumaA > sumaB) {
            counter++;
            System.out.println("Próba# " + "[" + counter + "] " + sumaA + " > " + sumaB);
            sumaA = sumaA + randomGenerator.nextInt(10);
            sumaB = sumaB + randomGenerator.nextInt(50);
        }
    }
}
