package com.kodilla.books;

import java.util.ArrayDeque;

public class Application {
    public static void main(String[] args) {
        Book b1 = new Book("Autostopem przez Galaktykę", "Douglas Adams", 1986);
        Book b2 = new Book("Czy androidy śnią o elektrycznych owcach?", "Philip K. Dick", 1968);
        Book b3 = new Book("Tytus, Romek i A'Tomek. Księga III", "Henryk Chmielewski", 1968);
        Book b4 = new Book("To nie jest zawód dla cyników", "Ryszard Kapuściński", 2013);
        Book b5 = new Book("Autoportret reportera", "Ryszard Kapuściński", 2003);

        ArrayDeque<Book> theBooks = new ArrayDeque<Book>();

        theBooks.push(b1);
        theBooks.push(b2);
        theBooks.push(b3);
        theBooks.push(b4);
        theBooks.push(b5);

        System.out.println("Kolejka utworzona. Jej rozmiar: " + theBooks.size());

        Book temporaryBook;
        temporaryBook = theBooks.pop();
        temporaryBook = theBooks.pop();
        temporaryBook = theBooks.pop();
        temporaryBook = theBooks.pop();
        temporaryBook = theBooks.pop();

        System.out.println("Kolejka opróżniona. Jej rozmiar: " + theBooks.size());
        System.out.println("Ostatnia książka usunięta z kolejki:\n " + temporaryBook);
    }
}
