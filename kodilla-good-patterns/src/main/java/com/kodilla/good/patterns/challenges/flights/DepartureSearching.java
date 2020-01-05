package com.kodilla.good.patterns.challenges.flights;

public class DepartureSearching {
    FlightsRepository flightsRepository = new FlightsRepository();

    public void searchByDepartures(String departureCity) {
        System.out.println("\n" + "Flights from " + departureCity + ":");
        flightsRepository.getFlightsList().stream()
                .filter(a -> a.getDepartureCity().equals(departureCity))
                .map(Flight::toString)
                .forEach(System.out::println);
    }
}
