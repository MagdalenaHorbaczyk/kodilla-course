package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        OrderRetriever list = new OrderRetriever();
        LinkedList<Order> orders = list.retrieve();

        for (Order order : orders) {
            OrderDto orderDto = OrderMapper.toOrderDto(order);
            OrderService orderService = ShopFactory.getShop(orderDto.getVendor());
            orderService.order(orderDto.getProduct(), orderDto.getQty());
            if (orderDto.isOrdered()) {
                System.out.println("Order information: "
                        + "\n" + orderDto.getVendor()
                        + "\n" + orderDto.getUser()
                        + "\nproduct: " + orderDto.getProduct().getProductName()
                        + "\nquantity: " + orderDto.getQty());
            }
        }
    }
}
