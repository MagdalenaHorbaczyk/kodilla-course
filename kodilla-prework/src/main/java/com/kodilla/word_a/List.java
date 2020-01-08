package com.kodilla.word_a;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class List {
    ArrayList<String> even = new ArrayList<String>();
    ArrayList<String> odd = new ArrayList<String>();

    public void separate(ArrayDeque<String> theWord) {
        String temporaryWord = null;
        while (theWord.size() > 0) {
            temporaryWord = theWord.poll();
            if (temporaryWord.length() % 2 == 0) {
                even.add(temporaryWord);
                System.out.println("Parzyste: " + temporaryWord);
            } else {
                odd.add(temporaryWord);
                System.out.println("Nieparzyste: " + temporaryWord);
            }
        }
        System.out.println("Ilość napisów o parzystej liczbie znaków 'a': " + even.size());
        System.out.println("Ilość napisów o nieparzystej liczbie znaków 'a': " + odd.size());
    }
}
