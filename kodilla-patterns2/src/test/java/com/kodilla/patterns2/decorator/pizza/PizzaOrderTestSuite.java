package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testCalzoneWithMozarellaSalamiJalapenosGetCost() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaCalzoneDecorator(theOrder);
        theOrder = new PizzaMozarellaDecorator(theOrder);
        theOrder = new PizzaSalamiDecorator(theOrder);
        theOrder = new PizzaJalapenosDecorator(theOrder);
        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(28), theCost);
    }

    @Test
    public void testCalzoneWithMozarellaSalamiJalapenosGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaCalzoneDecorator(theOrder);
        theOrder = new PizzaMozarellaDecorator(theOrder);
        theOrder = new PizzaSalamiDecorator(theOrder);
        theOrder = new PizzaJalapenosDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Pizza order:\n" + "calzone, " + "mozarella, " + "salami, " + "jalapenos ", description);
        System.out.println(description);
    }

    @Test
    public void testThinCrustWithTomatoSauceMozarellaSalamiJalapenosRucolaOliveOilGetCost() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaThinCrustDecorator(theOrder);
        theOrder = new PizzaTomatoSauceDecorator(theOrder);
        theOrder = new PizzaMozarellaDecorator(theOrder);
        theOrder = new PizzaSalamiDecorator(theOrder);
        theOrder = new PizzaJalapenosDecorator(theOrder);
        theOrder = new PizzaRucolaDecorator(theOrder);
        theOrder = new PizzaOliveOilDecorator(theOrder);

        //when
        BigDecimal theCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(34), theCost);
    }

    @Test
    public void testThinCrustWithTomatoSauceMozarellaSalamiJalapenosRucolaOliveOilGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaThinCrustDecorator(theOrder);
        theOrder = new PizzaTomatoSauceDecorator(theOrder);
        theOrder = new PizzaMozarellaDecorator(theOrder);
        theOrder = new PizzaSalamiDecorator(theOrder);
        theOrder = new PizzaJalapenosDecorator(theOrder);
        theOrder = new PizzaRucolaDecorator(theOrder);
        theOrder = new PizzaOliveOilDecorator(theOrder);
        //when
        String description = theOrder.getDescription();
        //then
        assertEquals("Pizza order:\n" + "thin crust, " + "tomato sauce, " + "mozarella, "
                + "salami, " + "jalapenos, " + " rucola, " + "olive oil", description);
    }
}
