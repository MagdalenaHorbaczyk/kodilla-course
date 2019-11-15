package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent southAmerica = new Continent("SouthAmerica");
        southAmerica.addCountry(new Country("Argentina", new BigDecimal("10000000")));
        southAmerica.addCountry(new Country("Chile", new BigDecimal("20000000")));
        southAmerica.addCountry(new Country("Peru", new BigDecimal("30000000")));

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("Japan", new BigDecimal("40000000")));
        asia.addCountry(new Country("India", new BigDecimal("50000000")));

        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Italy", new BigDecimal("60000000")));
        europe.addCountry(new Country("Macedonia", new BigDecimal("70000000")));
        europe.addCountry(new Country("Croatia", new BigDecimal("80000000")));

        World world = new World();
        world.addContinent(southAmerica);
        world.addContinent(asia);
        world.addContinent(europe);

        //When
        BigDecimal peopleQtyInTheWorld = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQtyInTheWorld = new BigDecimal("360000000");
        Assert.assertEquals(expectedPeopleQtyInTheWorld, peopleQtyInTheWorld);
    }
}
