package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements OrderService {
    private String NAME = "HealthyShop";

    @Override
    public boolean order(Product product, int qty) {
        System.out.println(NAME);
        return true;
    }
}
