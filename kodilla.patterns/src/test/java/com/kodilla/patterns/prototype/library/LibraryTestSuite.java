package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("My Library");
        Book book1 = new Book("Autostopem przez Galaktykę", "Douglas Adams", LocalDate.of(1986, 1, 1));
        library.getBooks().add(book1);
        library.getBooks().add(new Book("Czy androidy śnią o elektrycznych owcach?", "Philip K. Dick", LocalDate.of(1968, 1, 1)));
        library.getBooks().add(new Book("Tytus, Romek i A'Tomek. Księga III", "Henryk Chmielewski", LocalDate.of(1968, 1, 1)));
        library.getBooks().add(new Book("To nie jest zawód dla cyników", "Ryszard Kapuściński", LocalDate.of(2013, 1, 1)));
        library.getBooks().add(new Book("Autoportret reportera", "Ryszard Kapuściński", LocalDate.of(2003, 1, 1)));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("My Library backup");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("My Library backup 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book1);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        assert clonedLibrary != null;
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        assert deepClonedLibrary != null;
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}


