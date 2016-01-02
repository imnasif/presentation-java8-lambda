package me.nasif.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import me.nasif.java8.lambda.model.Pizza;
import me.nasif.java8.lambda.predicates.PizzaPredicate;

public final class Filters {

    private Filters() {};

    public static List<Pizza> getAllPizzaByPrice(List<Pizza> menu, int price) {
        List<Pizza> result = new ArrayList<>();
        for (Pizza pizza : menu) {
            if (pizza.getPrice() < price) {
                result.add(pizza);
            }
        }
        return result;
    }

    public static List<Pizza> getAllPizzaByType(List<Pizza> menu, String type) {
        List<Pizza> result = new ArrayList<>();
        for (Pizza pizza : menu) {
            if (type.equals(pizza.getType())) {
                result.add(pizza);
            }
        }
        return result;
    }

    public static List<Pizza> getAllPizzaByTypeAndPrice(List<Pizza> menu, String type, int price) {
        List<Pizza> result = new ArrayList<>();
        for (Pizza pizza : menu) {
            if (type != null && price != 0) {
                if (type.equals(pizza.getType()) && pizza.getPrice() < price) {
                    result.add(pizza);
                }
            } else if (type != null) {
                if (type.equals(pizza.getType())) {
                    result.add(pizza);
                }
            } else if (price != 0) {
                if (pizza.getPrice() < price) {
                    result.add(pizza);
                }
            } else {
                System.err.println("Returning Empty List");
            }

        }
        return result;
    }

    public static List<Pizza> filterPizza(List<Pizza> menu, PizzaPredicate predicate) {
        List<Pizza> result = new ArrayList<>();
        for (Pizza pizza : menu) {
            if (predicate.test(pizza)) {
                result.add(pizza);
            }
        }
        return result;
    }

}
