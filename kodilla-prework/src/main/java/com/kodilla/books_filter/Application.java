package com.kodilla.books_filter;

import java.util.HashSet;

public class Application {
    public static void main(String[] args) {
        Book b1 = new Book("Autostopem przez Galaktykę", "Douglas Adams", 1986);
        Book b2 = new Book("Czy androidy śnią o elektrycznych owcach?", "Philip K. Dick", 1968);
        Book b3 = new Book("Tytus, Romek i A'Tomek. Księga III", "Henryk Chmielewski", 1968);
        Book b4 = new Book("To nie jest zawód dla cyników", "Ryszard Kapuściński", 2013);

        HashSet<Book> booksSet = new HashSet<Book>();
        booksSet.add(b1);
        booksSet.add(b2);
        booksSet.add(b3);
        booksSet.add(b4);

        for (Book position : booksSet) {
            if (position.getYear() < 2010) {
                System.out.println(position.getTitle());
            }
        }
    }
}
