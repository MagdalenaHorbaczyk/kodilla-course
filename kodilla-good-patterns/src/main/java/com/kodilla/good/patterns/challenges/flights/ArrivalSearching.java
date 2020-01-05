package com.kodilla.good.patterns.challenges.flights;

public class ArrivalSearching {
    FlightsRepository flightsRepository = new FlightsRepository();

    public void searchByArrivals(String arrivalCity) {
        System.out.println("\n" + "Flights to " + arrivalCity + ":");
        flightsRepository.getFlightsList().stream()
                .filter(a -> a.getArrivalCity().equals(arrivalCity))
                .map(Flight::toString)
                .forEach(System.out::println);
    }
}
