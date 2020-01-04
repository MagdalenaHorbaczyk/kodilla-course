package com.kodilla.good.patterns.challenges.Food2Door;


public class ExtraFoodShop implements Vendor {
    private String NAME = "ExtraFoodShop";
    private OrderService orderService;

    ExtraFoodShop(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public OrderDto process(Order order) {
        boolean isOrdered = orderService.order(order.getProduct(), order.getQty());
        if (isOrdered) {
            System.out.println("Hello! " + "Order by " + NAME + " has been completed!");
            return new OrderDto(true, order.getVendor(), order.getProduct(), order.getQty(), order.getUser());
        } else {
            System.out.println("Hello! " + "Order by " + NAME + "has not been completed. Please contact " + NAME + " .");
            return new OrderDto(false, order.getVendor(), order.getProduct(), order.getQty(), order.getUser());
        }
    }

    @Override
    public String getVendorName() {
        return NAME;
    }
}
