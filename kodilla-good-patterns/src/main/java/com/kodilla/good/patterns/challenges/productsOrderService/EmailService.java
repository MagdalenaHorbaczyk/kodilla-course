package com.kodilla.good.patterns.challenges.productsOrderService;

public class EmailService implements InformationService {
    @Override
    public void inform(User user, Product product) {
        System.out.println("Hello, you have just bought:" + " " + product.getProductName());
    }
}
