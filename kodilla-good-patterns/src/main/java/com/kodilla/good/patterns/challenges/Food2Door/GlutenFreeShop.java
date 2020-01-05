package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements OrderService {
    private String NAME = "GlutenFreeShop";

    @Override
    public boolean order(Product product, int qty) {
        System.out.println(NAME);
        return true;
    }
}
