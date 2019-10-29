package com.kodilla.time;

public class Book {
    private String author;
    private String title;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    @Override
    public int hashCode(){
        return title.length();
    }

    @Override
    public boolean equals(Object o){
        Book e = (Book) o;
        return (author.equals(e.getAuthor()) && (title.equals(e.getTitle())));
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return title + ", " + author;
    }
}
