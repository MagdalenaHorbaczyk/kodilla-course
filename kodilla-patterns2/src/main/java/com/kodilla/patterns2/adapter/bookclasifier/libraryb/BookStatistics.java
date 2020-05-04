package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature, BookLB> books);

    int medianPublicationYear(Map<BookSignature, BookLB> books);
}
