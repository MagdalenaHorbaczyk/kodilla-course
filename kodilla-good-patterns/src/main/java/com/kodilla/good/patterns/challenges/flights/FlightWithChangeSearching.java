package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightWithChangeSearching {
    FlightsRepository flightsRepository = new FlightsRepository();

    public void searchFlightWithChange(String departureCity, String changeCity, String arrivalCity) {
        System.out.println("\n" + "Flights from " + departureCity + " to: " + arrivalCity + ": " + "with change in: " + changeCity + ":");

        List<Flight> flightsWithChangeList = flightsRepository.getFlightsList().stream()
                .filter(a -> a.getDepartureCity().equals(departureCity) && a.getArrivalCity().equals(changeCity))
                .collect(Collectors.toList());
        flightsRepository.getFlightsList().stream()
                .filter(a -> a.getDepartureCity().equals(changeCity) && a.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toCollection(() -> flightsWithChangeList));
        flightsWithChangeList.forEach(System.out::println);
    }
}
