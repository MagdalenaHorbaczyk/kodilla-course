package com.kodilla.good.patterns.challenges.Food2Door;

public class Vendor {
    public String vendorName;

    public Vendor(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorName() {
        return vendorName;
    }

    @Override
    public String toString() {
        return "vendor: " +
                vendorName;
    }
}
