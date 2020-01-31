package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsRepository {
    private static final String WROCLAW = "Wroclaw";
    private static final String GDANSK = "Gdansk";

    private final List<Flight> flightsList = new ArrayList<>();

    public FlightsRepository() {
        flightsList.add(new Flight(WROCLAW, GDANSK));
        flightsList.add(new Flight("Wroclaw", "Poznan"));
        flightsList.add(new Flight("Wroclaw", "Sopot"));
        flightsList.add(new Flight("Poznan", "Szczecin"));
        flightsList.add(new Flight("Poznan", "Krakow"));
        flightsList.add(new Flight("Poznan", "Rzeszow"));
        flightsList.add(new Flight("Gdansk", "Rzeszow"));
        flightsList.add(new Flight("Gdansk", "Wroclaw"));
        flightsList.add(new Flight("Poznan", "Warszawa"));
        flightsList.add(new Flight("Sopot", "Wroclaw"));
        flightsList.add(new Flight("Sopot", "Poznan"));
        flightsList.add(new Flight("Sopot", "Rzeszow"));
        flightsList.add(new Flight("Warszawa", "Gdansk"));
        flightsList.add(new Flight("Warszawa", "Szczecin"));
        flightsList.add(new Flight("Warszawa", "Wroclaw"));
        flightsList.add(new Flight("Gdynia", "Warszawa"));
        flightsList.add(new Flight("Gdynia", "Krakow"));
        flightsList.add(new Flight("Krakow", "Rzeszow"));
        flightsList.add(new Flight("Krakow", "Poznan"));
    }

    public List<Flight> getFlightsList() {
        return new ArrayList<>(flightsList);
    }
}
