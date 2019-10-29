package com.kodilla.list;

public class Book {
    private String title;
    private int	publYear;

    public Book(String title, int publYear) {
        this.title = title;
        this.publYear = publYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPublYear() {
        return publYear;
    }
}
