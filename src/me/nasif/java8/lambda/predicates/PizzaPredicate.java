package me.nasif.java8.lambda.predicates;

import me.nasif.java8.lambda.model.Pizza;

public interface PizzaPredicate {
    boolean test(Pizza pizza);
}
