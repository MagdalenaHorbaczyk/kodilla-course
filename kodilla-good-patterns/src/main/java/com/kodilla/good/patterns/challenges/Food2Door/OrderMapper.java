package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderMapper {
    public static OrderDto toOrderDto(Order order) {
        return new OrderDto(false, order.getVendor(), order.getProduct(), order.getQty(), order.getUser());
    }
}
