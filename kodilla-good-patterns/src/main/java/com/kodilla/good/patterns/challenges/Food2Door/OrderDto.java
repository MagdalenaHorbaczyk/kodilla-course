package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderDto {
    private boolean isOrdered;
    private Vendor vendor;
    private Product product;
    private int qty;
    private User user;

    public OrderDto(final boolean isOrdered, final Vendor vendor, final Product product, final int qty, final User user) {
        this.isOrdered = isOrdered;
        this.vendor = vendor;
        this.product = product;
        this.qty = qty;
        this.user = user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public Product getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public User getUser(){
        return user;
    }
}
