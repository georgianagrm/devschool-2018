package com.company.designPatterns;

/**
 * Created by Georgiana on 04-Dec-18.
 */

//Delegate Design Pattern

public enum Topping implements ToppingAddition {

    MOZZARELLA (new MozzarellaToppingAddition()) ,
    PEPPERONI (new PepperoniToppingAddition()),
    BACON (new BaconToppingAddition());

    private final ToppingAddition delegate;

    private Topping(ToppingAddition delegate) {
        this.delegate = delegate;
    }

    @Override
    public Pizza addTopping(Pizza pizza) {
        return this.delegate.addTopping(pizza);
    }
}

