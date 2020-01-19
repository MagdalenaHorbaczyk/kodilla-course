package com.kodilla.patterns.builder.bigmac;

public final class SauceFactory {
    public static final String STANDARD = "Standard";
    public static final String THOU_ISLANDS = "1000 islands";
    public static final String BARBECUE = "Barbecue";

    public static Sauce makeSauce(String sauceType) {
        switch (sauceType) {
            case STANDARD:
                return new Sauce(sauceType);
            case THOU_ISLANDS:
                return new Sauce(sauceType);
            case BARBECUE:
                return new Sauce(sauceType);
            default:
                throw new IllegalStateException("Types of sauce: standard, 1000 islands, barbecue");
        }
    }
}
