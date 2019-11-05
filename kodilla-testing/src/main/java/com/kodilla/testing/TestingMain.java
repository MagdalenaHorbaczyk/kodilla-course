package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator();
        int result1 = calculator.addAToB(5, 4);
        if (result1 == 9) {
            System.out.println("Calculator adding test OK");
        } else {
            System.out.println("Calculator adding error!");
        }
        int result2 = calculator.subtractBFromA(5, 4);
        if (result2 == 1) {
            System.out.println("Calculator subtracting test OK");
        } else {
            System.out.println("Calculator subtracting error!");
        }
    }
}
