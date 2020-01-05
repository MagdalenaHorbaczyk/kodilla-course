package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        OrderRetriever list = new OrderRetriever();
        LinkedList<Order> orders = list.retrieve();

        for (Order order : orders) {
            ProductOrderService productOrderService = new ProductOrderService(new OrderService() {
                @Override
                public boolean order(Product product, int qty) {
                    return true;
                }
            });
            OrderDto orderDto = productOrderService.process(order);
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
