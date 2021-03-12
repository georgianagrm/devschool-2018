package com.company.designPatterns;

/**
 * Created by Georgiana on 05-Dec-18.
 */

//Strategy Design Pattern

public class MozzarellaToppingAddition implements ToppingAddition {
    @Override
    public Pizza addTopping(Pizza pizza) {
        pizza.setTopping(Topping.MOZZARELLA);
        pizza.setPrice(pizza.getPrice()+3f);
        return pizza;
    }
}
