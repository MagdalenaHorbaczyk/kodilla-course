package com.kodilla.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Application {
    public static void main (String[] args) throws java.lang.Exception {

        ArrayList<Integer> grade = new ArrayList<Integer>();
        grade.add(5);
        grade.add(4);
        grade.add(1);
        grade.add(6);
        grade.add(3);
        grade.add(2);
        grade.add(5);
        grade.add(1);
        grade.add(1);
        grade.add(3);
        grade.add(6);
        grade.add(5);

        double total = 0;
        for(int n=0; n<grade.size(); n++) {
            System.out.println("Grade " + n + " of Informatics: " + grade.get(n));
            total += grade.get(n);
        }

        System.out.println("Maximum grade: " + Collections.max(grade));
        System.out.println("Minimum grade: " + Collections.min(grade));
        System.out.println("Average grade of Informatics in Highschool: " +(total-Collections.max(grade)-Collections.min(grade))/grade.size());

        LinkedList<Book> book = new LinkedList<Book>();
        Book position1 = new Book("Autostopem przez Galaktykę", 1986);
        Book position2 = new Book("Czy androidy śnią o elektrycznych owcach?", 1968);
        Book position3 = new Book("Tytus, Romek i A'Tomek. Księga III", 1968);
        Book position4 = new Book("Autoportret reportera", 2003);

        book.add(position1);
        book.add(position2);
        book.add(position3);
        book.add(position4);

        for(Book position : book){
            if(position.getPublYear() < 2000){
                System.out.println(position.getTitle());
            }
        }
    }
}
