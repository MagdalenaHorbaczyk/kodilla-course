package com.kodilla.good.patterns.challenges.productsOrderService;

import java.time.LocalDateTime;

public class GameOrderService implements OrderService {
    @Override
    public boolean order(User user, Product product, LocalDateTime dateOfOrder) {
        System.out.printf("Order information: User: %s %s Product: %s%n", user.getName(), user.getSurname(), product.getProductName());
        return true;
    }
}
