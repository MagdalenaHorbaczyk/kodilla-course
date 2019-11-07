package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator<size> {

    public void exterminate(ArrayList<Integer> numbers) {
        for (int n = 0; n < numbers.size(); n++) {
            numbers.add(n);
            Integer temp = 0;
            temp = n;
            if (temp % 2 == 1) {
                numbers.remove(temp);
            }
        }
        System.out.println(numbers);
    }
}