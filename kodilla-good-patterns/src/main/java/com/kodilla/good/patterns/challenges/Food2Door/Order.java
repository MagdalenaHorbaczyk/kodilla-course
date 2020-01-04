package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class Order {
    private User user;
    private Product product;
    private int qty;
    private LocalDateTime dateOfOrder;
    private Vendor vendor;

    public Order(final User user, final Product product, final int qty, final LocalDateTime dateOfOrder, final Vendor vendor) {
        this.user = user;
        this.product = product;
        this.qty = qty;
        this.dateOfOrder = dateOfOrder;
        this.vendor = vendor;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public Vendor getVendor() {
        return vendor;
    }
}
