package me.nasif.java8.lambda.predicates;

import me.nasif.java8.lambda.model.Pizza;

public class PizzaPricePredicate implements PizzaPredicate {

    private final int price;

    public PizzaPricePredicate(int price) {
        this.price = price;
    }

    @Override
    public boolean test(Pizza pizza) {
        return pizza.getPrice() < price;
    }

}
