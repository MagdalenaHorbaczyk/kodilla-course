package com.kodilla.patterns.builder.bigmac;

public final class Bun {
    public static final String WITH_SESAME = "with sesame";
    private static final String WITHOUT_SESAME = "without sesame";
    final private String bunType;

    Bun(String bunType) {
        if (bunType.equals(WITH_SESAME) || bunType.equals(WITHOUT_SESAME)) {
            this.bunType = bunType;
        } else {
            throw new IllegalStateException("Types of bun: with sesame, without sesame");
        }
    }

    public String getBunType() {
        return bunType;
    }

    @Override
    public String toString() {
        return bunType;
    }
}
