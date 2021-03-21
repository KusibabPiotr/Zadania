package com.illa.patterns.builder;

public final class Sauce {

    public static final String KETCHUP = "KETCHUP";
    public static final String BARBECUE = "BARBECUE";
    public static final String MUSTARD = "MUSTARD";
    public static final String MAYO = "MAYO";

    private String sauce;

    public Sauce(final String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return sauce;
    }
}
