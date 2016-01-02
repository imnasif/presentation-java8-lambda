package me.nasif.java8.lambda.model;

public class Pizza {

    private final int price;
    private final String type;

    public Pizza(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

}
