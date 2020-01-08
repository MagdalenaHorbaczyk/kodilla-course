package com.kodilla.time;

import java.util.HashMap;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        String author = "a";
        String title = "b";

        LinkedList<Book> listOfBooks = new LinkedList<Book>();
        for (int i = 0; i < 100000; i++) {
            listOfBooks.add(new Book(author + i, title + i));
        }
        Book book = new Book(author + (listOfBooks.size() - 1), title + (listOfBooks.size() - 1));
        System.out.println("Ilość obiektów LinkedList " + listOfBooks.size());
        long begin = System.nanoTime();
        listOfBooks.remove(book);
        long end = System.nanoTime();
        System.out.println("Usunięcie ostatniego obiektu LinkedList zajęło: " + (end - begin) + "ns. Aktualna ilość: " + listOfBooks.size());
        book = new Book(author + 0, title + 0);
        begin = System.nanoTime();
        listOfBooks.remove(book);
        end = System.nanoTime();
        System.out.println("Usunięcie pierwszego obiektu LinkedList zajęło: " + (end - begin) + "ns. Aktualna ilość: " + listOfBooks.size());
        long begin1 = System.nanoTime();
        listOfBooks.add(new Book(author + "abc", title));
        long end1 = System.nanoTime();
        System.out.println("Dodanie obiektu na końcu LinkedList zajęło: " + (end1 - begin1) + "ns. Aktualna ilość: " + listOfBooks.size());
        begin1 = System.nanoTime();
        listOfBooks.add(0, new Book(author, title));
        end1 = System.nanoTime();
        System.out.println("Dodanie obiektu na początku LinkedList zajęło: " + (end1 - begin1) + "ns. Aktualna ilość: " + listOfBooks.size());

        HashMap<Book, String> myMap = new HashMap<>();
        for (int i = 0; i < 5000; i++) {
            myMap.put(new Book(author + i, title + i), "signature" + i);
        }
        book = new Book(author + 0, title + 0);
        long begin2 = System.nanoTime();
        String s = myMap.get(book);
        long end2 = System.nanoTime();
        System.out.println("Wyszukanie obiektu po kluczu HashMap zajęło: " + (end2 - begin2) + "ns");
        book = new Book(author + (myMap.size() - 1), title + (myMap.size() - 1));
        System.out.println("Ilość obiektów HashMap: " + myMap.size());
        long begin3 = System.nanoTime();
        myMap.remove(book);
        long end3 = System.nanoTime();
        System.out.println("Usunięcie ostatniego obiektu z HashMap zajęło: " + (end3 - begin3) + "ns. Aktualna ilość obiektów HashMap: " + myMap.size());
        long begin4 = System.nanoTime();
        myMap.put(new Book(author + "abc", title + 0), "signature" + 0);
        long end4 = System.nanoTime();
        System.out.println("Dodanie obiektu do HashMap zajęło: " + (end4 - begin4) + "ns. Aktualna ilość obiektów HashMap: " + myMap.size());
    }
}
