package com.kodilla.good.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {

        DepartureSearching departure = new DepartureSearching();
        departure.searchByDepartures("Wroclaw");
        departure.searchByDepartures("Warszawa");
        departure.searchByDepartures("Gdynia");

        ArrivalSearching arrival = new ArrivalSearching();
        arrival.searchByArrivals("Poznan");
        arrival.searchByArrivals("Rzeszow");
        arrival.searchByArrivals("Sopot");

        FlightWithChangeSearching change = new FlightWithChangeSearching();
        change.searchFlightWithChange("Wroclaw", "Poznan", "Szczecin");
        change.searchFlightWithChange("Sopot", "Poznan", "Rzeszow");
        change.searchFlightWithChange("Gdynia", "Warszawa", "Wroclaw");
    }
}
