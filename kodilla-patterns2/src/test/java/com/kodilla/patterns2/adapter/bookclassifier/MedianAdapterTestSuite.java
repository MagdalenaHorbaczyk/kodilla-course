package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookLA;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<BookLA> bookSet = new HashSet<>();
        bookSet.add(new BookLA("Philip K. Dick", "Czy androidy śnią o elektrycznych owcach?", 1968, "abcd"));
        bookSet.add(new BookLA("Douglas Adams", "Autostopem przez Galaktykę", 1986, "abce"));
        bookSet.add(new BookLA("Ryszard Kapuściński", "Autoportret reportera", 2003, "abcf"));

        //When
        MedianAdapter adapter = new MedianAdapter();
        int medianPublicationYear = adapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(1986, medianPublicationYear);
    }
}
