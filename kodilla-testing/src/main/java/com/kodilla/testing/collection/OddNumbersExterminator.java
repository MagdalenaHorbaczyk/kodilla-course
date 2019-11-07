package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        for (int n = 0; n < numbers.size(); n++) {
            numbers.add(n);
            int temp = 0;
            temp = n;
            if (temp % 2 ==1) {
                numbers.remove(temp);
            }
        }
        return numbers;
    }
}