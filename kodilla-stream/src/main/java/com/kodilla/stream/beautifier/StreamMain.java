package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(java.lang.String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("What a beautiful rainy day", (text) -> "ABC " + text + " ABC");
        poemBeautifier.beautify("What a beautiful rainy day", String::toUpperCase);
        poemBeautifier.beautify("What a beautiful rainy day", (text) -> "Oh! " + text + "!");
        poemBeautifier.beautify("WHAT A BEAUTIFUL RAINY DAY", String::toLowerCase);
    }
}
