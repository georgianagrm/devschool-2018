package com.company.designPatterns;

/**
 * Created by Georgiana on 05-Dec-18.
 */

//Strategy Design Pattern

public class PepperoniToppingAddition implements ToppingAddition{

    @Override
    public Pizza addTopping(Pizza pizza) {
        pizza.setTopping(Topping.PEPPERONI);
        pizza.setPrice(pizza.getPrice()+2f);
        return pizza;
    }

}
