package com.kodilla.good.patterns.challenges.productsOrderService;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("John", "Smith");
        Product product = new Product("The Witcher");
        LocalDateTime dateOfOrder = LocalDateTime.of(2020, 1, 1, 9, 05);
        return new OrderRequest(user, product, dateOfOrder);
    }
}
