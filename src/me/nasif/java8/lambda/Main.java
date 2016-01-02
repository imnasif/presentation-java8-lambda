package me.nasif.java8.lambda;

import java.util.Arrays;
import java.util.List;

import me.nasif.java8.lambda.model.Pizza;
import me.nasif.java8.lambda.predicates.*;
import static me.nasif.java8.lambda.Filters.*;

public class Main {

    public static void main(String[] args) {
        List<Pizza> menu = Arrays.asList(
                new Pizza("Chicken", 500),
                new Pizza("Chicken", 600),
                new Pizza("Chicken", 800),
                new Pizza("Beef", 900),
                new Pizza("Beef", 700),
                new Pizza("Beef", 1000)
        );

        getAllPizzaByPrice(menu, 700);
        getAllPizzaByType(menu, "Chicken");

        getAllPizzaByTypeAndPrice(menu, "Beef", 700);
        getAllPizzaByTypeAndPrice(menu, null, 700);
        getAllPizzaByTypeAndPrice(menu, "Chicken", 0);

        filterPizza(menu, new PizzaPricePredicate(700));
        filterPizza(menu, new PizzaTypePredicate("Chicken"));
        filterPizza(menu, new PizzaTypeAndPricePredicate("Beef", 700));

        filterPizza(menu, new PizzaPredicate() {
            @Override
            public boolean test(Pizza pizza) {
                return pizza.getPrice() < 700;
            }
        });
        filterPizza(menu, new PizzaPredicate() {
            @Override
            public boolean test(Pizza pizza) {
                return "Chicken".equals(pizza.getType());
            }
        });
        filterPizza(menu, new PizzaPredicate() {
            @Override
            public boolean test(Pizza pizza) {
                return "Beef".equals(pizza.getType()) && pizza.getPrice() < 700;
            }
        });

        filterPizza(menu, (Pizza p) -> p.getPrice() < 700);
        filterPizza(menu, (Pizza p) -> "Chicken".equals(p.getType()));
        filterPizza(menu, (Pizza p) -> p.getPrice() < 700 && "Beef".equals(p.getType()));

    }
}
