package com.kodilla.patterns2.adapter.bookclasifier;


import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookLA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookLB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookLA> bookSet) {
        Map<BookSignature, BookLB> books = new HashMap<>();
        for (BookLA book : bookSet) {
            books.put(new BookSignature(book.getSignature()),
                    new BookLB(
                            book.getAuthor(),
                            book.getTitle(),
                            book.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}



