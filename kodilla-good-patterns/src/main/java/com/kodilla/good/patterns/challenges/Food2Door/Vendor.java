package com.kodilla.good.patterns.challenges.Food2Door;

public interface Vendor {

    OrderDto process(Order order);

    String getVendorName();
}
