package com.kodilla.word_a;

import java.util.ArrayDeque;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        String word = "a";
        String a = "a";

        ArrayDeque<String> theWord = new ArrayDeque<String>();
        Random theGenerator = new Random();
        for (int i = 0; i < 50; i++) {
            String word1 = word;
            theWord.offer(word);
            for (int n = 0; n < theGenerator.nextInt(50) + 1; n++) {
                word = word + a;
            }
            String word2 = word;
            word = word2.replace(word2, word2.substring(word1.length()));
        }
        System.out.println("Ilość napisów w kolejce ArrayDeque: " + theWord.size());

        List tester = new List();
        tester.separate(theWord);
    }
}
