package com.kodilla.patterns.builder.bigmac;

public final class Sauce {
    public static final String STANDARD = "Standard";
    public static final String THOU_ISLANDS = "1000 islands";
    public static final String BARBECUE = "Barbecue";
    final private String sauceType;

    public Sauce(String sauceType) {
        if (sauceType.equals(STANDARD) ||
                sauceType.equals(THOU_ISLANDS) ||
                sauceType.equals(BARBECUE)) {
            this.sauceType = sauceType;
        } else {
            throw new IllegalStateException("Types of sauce: standard, 1000 islands, barbecue");
        }
    }

    @Override
    public String toString() {
        return
                sauceType;
    }
}
