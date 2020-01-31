package com.kodilla.good.patterns.challenges.productsOrderService;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, Product product, LocalDateTime dateOfOrder);
}
