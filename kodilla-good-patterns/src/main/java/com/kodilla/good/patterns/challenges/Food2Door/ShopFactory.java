package com.kodilla.good.patterns.challenges.Food2Door;

public class ShopFactory {
    public static OrderService getShop(Vendor vendor) {
        OrderService productOrderService = null;
        if(vendor.getVendorName().equals("ExtraFoodShop"))
            productOrderService = new ExtraFoodShop();
        else if (vendor.getVendorName().equals("GlutenFreeShop"))
            productOrderService = new GlutenFreeShop();
        else
            productOrderService = new HealthyShop();
        return productOrderService;
    }
}
