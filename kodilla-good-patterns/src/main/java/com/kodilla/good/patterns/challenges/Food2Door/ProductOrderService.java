package com.kodilla.good.patterns.challenges.Food2Door;

class ProductOrderService {
    private OrderService orderService;

    ProductOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    OrderDto process(Order order) {
        boolean isOrdered = orderService.order(order.getProduct(), order.getQty());
        if (isOrdered) {
            System.out.println("Hello! " + "Order by " + order.getVendor() + " has been completed!");
            return new OrderDto(true, order.getVendor(), order.getProduct(), order.getQty(), order.getUser());
        } else {
            System.out.println("Hello! " + "Order has not been completed.");
            return new OrderDto(false, order.getVendor(), order.getProduct(), order.getQty(), order.getUser());
        }
    }

}
