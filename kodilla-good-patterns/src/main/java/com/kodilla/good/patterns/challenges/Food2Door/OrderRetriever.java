package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class OrderRetriever {

    private LinkedList<Order> list = new LinkedList<>();

    public LinkedList<Order> retrieve() {

        Vendor extraFoodShop = new Vendor("Extra Food Shop");
        Vendor glutenFreeShop = new Vendor("Gluten Free Shop");
        Vendor healthyShop = new Vendor("Healthy Shop");
        Product amaranthus = new Product(("amaranthus"));
        Product millet_flakes = new Product("millet flakes");
        Product avocado = new Product("avocado");
        User user1 = new User("Ann", "Smith");
        User user2 = new User("Greg", "Stone");
        User user3 = new User("Alexander", "Lang");

        list.add(new Order(user1, amaranthus, 2, LocalDateTime.of(2020, 1, 4, 9, 39, 41)
                , extraFoodShop));
        list.add(new Order(user2, millet_flakes, 12, LocalDateTime.of(2020, 1, 1, 9, 39, 41)
                , glutenFreeShop));
        list.add(new Order(user3, amaranthus, 3, LocalDateTime.of(2020, 1, 2, 9, 39, 41)
                , healthyShop));
        list.add(new Order(user1, avocado, 5, LocalDateTime.of(2020, 1, 3, 9, 39, 41)
                , extraFoodShop));
        list.add(new Order(user1, millet_flakes, 1, LocalDateTime.of(2020, 1, 1, 8, 39, 41)
                , glutenFreeShop));
        list.add(new Order(user2, amaranthus, 7, LocalDateTime.of(2020, 1, 1, 7, 39, 41)
                , healthyShop));
        list.add(new Order(user3, avocado, 5, LocalDateTime.of(2020, 1, 4, 5, 39, 41)
                , glutenFreeShop));
        list.add(new Order(user1, millet_flakes, 6, LocalDateTime.of(2020, 1, 4, 6, 39, 41)
                , extraFoodShop));
        return new LinkedList<>(list);
    }
}
