package me.nasif.java8.lambda.predicates;

import me.nasif.java8.lambda.model.Pizza;

public class PizzaTypePredicate implements PizzaPredicate {

    private final String type;

    public PizzaTypePredicate(String type) {
        this.type = type;
    }   
    
    
    @Override
    public boolean test(Pizza pizza) {
        return type.equals(pizza.getType());
    }

}
