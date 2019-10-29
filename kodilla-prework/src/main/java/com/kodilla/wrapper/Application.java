package com.kodilla.wrapper;

public class Application {
    public static void main (String[] args) {

        int number = 2;
        Integer number1 = 2;

        if(number==number1) {
            System.out.println ("Wartości są równe");
        } else {
            System.out.println ("Wartości nie są równe");
        }

        char sex = 'f';
        Character sex1 = 'f';

        if(sex==sex1) {
            System.out.println ("Wartości są równe");
        } else {
            System.out.println ("Wartości nie są równe");
        }

        boolean javaIsInteresting = true;
        Boolean javaIsVeryInteresting = true;

        if(javaIsInteresting==javaIsVeryInteresting) {
            System.out.println ("Wartości są równe");
        } else {
            System.out.println ("Wartości nie są równe");
        }

    }
}
