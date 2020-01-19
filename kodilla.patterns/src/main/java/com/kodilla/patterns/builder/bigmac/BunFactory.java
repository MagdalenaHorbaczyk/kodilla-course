package com.kodilla.patterns.builder.bigmac;

public class BunFactory {
    public static final String WITH_SESAME = "with sesame";
    public static final String WITHOUT_SESAME = "without sesame";

    public static Bun makeBun(String bunType) {
        if (bunType.equals(WITH_SESAME)) {
            return new Bun(bunType);
        } else if (bunType.equals(WITHOUT_SESAME)) {
            return new Bun(bunType);
        }
        throw new IllegalStateException("Types of bun: with sesame, without sesame");
    }
}
