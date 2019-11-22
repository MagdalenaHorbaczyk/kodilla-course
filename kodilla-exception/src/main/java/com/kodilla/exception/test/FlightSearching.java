package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FlightSearching {
    String departureAirport = "Wrocław";

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Palermo", true);
        flights.put("Gdańsk", false);
        flights.put("Moscow", false);

        String arrivalAirport = flight.getArrivalAirport();
        if (flights.containsKey(arrivalAirport)) {
            System.out.println("Flight from " + departureAirport + " to " + arrivalAirport);
        } else {
            throw new RouteNotFoundException(flight);
        }
        return flights.get(arrivalAirport);
    }

    public static void main(String[] args) {
        Set<Flight> set = new HashSet<>();
        set.add(new Flight("Wrocław", "Palermo"));
        set.add(new Flight("Wrocław", "Gdańsk"));
        set.add(new Flight("Wrocław", "Lisbon"));
        set.add(new Flight("Wrocław", "Moscow"));
        set.add(new Flight("Wrocław", "New York"));

        for (Flight flight : set) {
            FlightSearching flightSearching = new FlightSearching();
            try {
                System.out.println(flightSearching.findFlight(flight));
            } catch (Exception e) {
                System.out.println("Airport in " + flight.getArrivalAirport() + " not found!");
            }
        }
    }
}