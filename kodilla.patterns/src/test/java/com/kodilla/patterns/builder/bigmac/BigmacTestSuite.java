package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

import static com.kodilla.patterns.builder.bigmac.Bun.WITH_SESAME;
import static com.kodilla.patterns.builder.bigmac.Sauce.BARBECUE;
import static org.junit.Assert.assertEquals;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(BunFactory.makeBun(WITH_SESAME))
                .sauce(SauceFactory.makeSauce(BARBECUE))
                .ingredient("Chilli_peppers")
                .ingredient("Bacon")
                .ingredient("Cucumber")
                .burgers(1)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int burgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce().toString();
        String bun = bigmac.getBun().toString();
        //Then
        assertEquals(3, howManyIngredients);
        assertEquals(1, burgers);
        assertEquals(BARBECUE, sauce);
        assertEquals(WITH_SESAME, bun);
    }
}
