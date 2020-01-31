package com.kodilla.spring.car;

import org.springframework.context.annotation.Bean;

import java.time.LocalTime;

/*@Configuration*/
public class CarConfig {
    public String season;
    LocalTime time;
    /*public String spring;
    public String summer;
    public String automn;*/
/*
    @Bean
    public Square createSquare() {
        return new Square();
    }
*/

    public CarConfig(String season, LocalTime time) {
        this.season = season;
        this.time = time;
    }

    @Bean
    public Car chosenSeason(String season, LocalTime time) {
        Car theCar;
        if (season.equals("summer") && (time.equals(LocalTime.of(22,00)))) {
            theCar = new Cabrio();
        } else if (season.equals("autumn")||season.equals("spring")) {
            theCar = new Sedan();
        } else {
            theCar = new SUV();
        }
        return theCar;
    }
}
