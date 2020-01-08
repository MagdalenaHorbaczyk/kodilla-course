/*
package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        for (Map.Entry<String, Boolean> flightsEntry : flights.entrySet()) {
            String arrivalAirport = flightsEntry.getKey();

            flights.put("palermo", true);
        }
        String arrivalAirport = flight.getArrivalAirport();
        if (flights.entrySet().contains(arrivalAirport)) {
            return flights;
        } else {
            throw new RouteNotFoundException(flight);
        }


    }

    public static void main(String[] args) {
        Flight flight = new Flight("wroclaw", "palermo");

        FlightSearching flightSearching = new FlightSearching();
        try {
            System.out.println(flightSearching.findFlight(flight));
        } catch (Exception e) {
            System.out.println("Flight not found");
        }
    }
}


        try {
            System.out.println(flightSearching.findFlight(flight1));
        } catch (Exception e) {
            System.out.println(flight.getDepartureAirport() + " to " + flight1.getArrivalAirport() + " - flight not found!");
        }

        try {
            System.out.println(flightSearching.findFlight(flight2));
        } catch (Exception e) {
            System.out.println(flight.getDepartureAirport() + " to " + flight2.getArrivalAirport() + " - flight not found!");
        }

*/
