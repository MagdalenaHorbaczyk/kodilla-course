package com.kodilla.orders;

import java.util.HashSet;

public class Application {
    public static void main(String[] args) {
        String orderNo = "zamówienie Nr";
        Double value = 100.50;

        HashSet<Order> ordersSet = new HashSet<Order>();
        for (int n = 0; n < 100; n++) {
            ordersSet.add(new Order(orderNo + n, value + n));
        }
        ordersSet.add(new Order(orderNo + 0, value + 0));
        System.out.println("Ilość zamówień: " + ordersSet.size());
        System.out.println(ordersSet);

    }
}
