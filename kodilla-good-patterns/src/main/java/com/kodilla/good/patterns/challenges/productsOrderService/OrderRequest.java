package com.kodilla.good.patterns.challenges.productsOrderService;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private Product product;
    private LocalDateTime dateOfOrder;

    public OrderRequest(final User user, final Product product, final LocalDateTime dateOfOrder) {
        this.user = user;
        this.product = product;
        this.dateOfOrder = dateOfOrder;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public Product getProduct() {
        return product;
    }
}
