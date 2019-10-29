package com.kodilla.average;

public class Application {
    public static void main (String[] args) {

        int[] numbers = new int[20];
        numbers[0] = 20;
        numbers[1] = 45;
        numbers[2] = 80;
        numbers[3] = 4;
        numbers[4] = 9;
        numbers[5] = 3;
        numbers[6] = 8;
        numbers[7] = 15;
        numbers[8] = 46;
        numbers[9] = 92;
        numbers[10] = 44;
        numbers[11] = 23;
        numbers[12] = 43;
        numbers[13] = 12;
        numbers[14] = 16;
        numbers[15] = 7;
        numbers[16] = 54;
        numbers[17] = 76;
        numbers[18] = 2;
        numbers[19] = 2;

        for(int i=0; i < numbers.length; i++) {
            System.out.println("Liczba elementu tablicy[" + i + "] = " + numbers[i]);
        }

        double total = 0;
        for (int counter = 0; counter < numbers.length; counter++) {
            total+=numbers[counter];
        }

        System.out.println("Średnia wartość wynosi " + total/numbers.length);

    }
}
