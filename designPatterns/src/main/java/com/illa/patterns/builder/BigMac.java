package com.illa.patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class BigMac {

    private final Bun bun;
    private final int burgers;
    private final Sauce sauce;
    private final List <Ingredient> list;

    private BigMac(Bun bun, int burgers, Sauce sauce, List<Ingredient> list) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.list = list;
    }
    public static class BigMacBuilder {
        private Bun bun;
        private int burgers;
        private Sauce sauce;
        private List <Ingredient> ingredients = new ArrayList<>();

        public BigMacBuilder bun(boolean sesame){
            this.bun = new Bun(sesame);
            return this;
        }
        public BigMacBuilder burgers(int quantity){
            this.burgers = quantity;
            return this;
        }
        public BigMacBuilder sauce(String sauce){
            this.sauce = new Sauce(sauce);
            return this;
        }
        public BigMacBuilder ingredient(Ingredient ingredient){
            ingredients.add(ingredient);
            return this;
        }
        public BigMac build(){
            return new BigMac(bun,burgers,sauce,ingredients);
        }
    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredient> getList() {
        return list;
    }
}
