package com.company.designPatterns;

/**
 * Created by Georgiana on 05-Dec-18.
 */

//Strategy Design Pattern

public class BaconToppingAddition implements ToppingAddition {
    @Override
    public Pizza addTopping(Pizza pizza) {
        pizza.setTopping(Topping.BACON);
        pizza.setPrice(pizza.getPrice()+3.5f);
        return pizza;
    }
}
