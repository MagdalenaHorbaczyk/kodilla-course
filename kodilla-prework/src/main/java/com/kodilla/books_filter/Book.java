package com.kodilla.books_filter;

public class Book {
    public String title;
    public String author;
    public Integer year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int hashCode() {
        return title.length();
    }

    public boolean equals(Object o) {
        Book e = (Book) o;
        return (title.equals(e.getTitle())) && (author.equals(e.getAuthor()))&&(year.equals(e.getYear()));
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
