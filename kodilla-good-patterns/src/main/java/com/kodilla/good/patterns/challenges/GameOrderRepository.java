package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class GameOrderRepository implements OrderRepository {
    @Override
    public void createOrder(User user, Product product, LocalDateTime dateOfOrder) {
        System.out.printf("Order database: User: %s %s Product: %s%n", user.getName(), user.getSurname(), product.getProductName());
    }
}
