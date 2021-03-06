package com.kodilla.good.patterns.challenges.movieStore;

import java.util.stream.Collectors;

public class MovieStoreApp {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String theResultListOfTitles = movieStore.getMovies().entrySet().stream()
                .flatMap(a -> a.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(theResultListOfTitles);
    }
}
