package com.kodilla.good.patterns.challenges.Food2Door;


public class ExtraFoodShop implements OrderService {
    private String NAME = "ExtraFoodShop";

    @Override
    public boolean order(Product product, int qty) {
        System.out.println(NAME);
        return true;
    }
}
