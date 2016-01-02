package me.nasif.java8.lambda.predicates;

import me.nasif.java8.lambda.model.Pizza;

public class PizzaTypeAndPricePredicate implements PizzaPredicate {

    private final String type;
    private final int price;

    public PizzaTypeAndPricePredicate(String type, int price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public boolean test(Pizza pizza) {
        return type.equals(pizza.getType()) && pizza.getPrice() < price;
    }

}
