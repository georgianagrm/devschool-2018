package com.company.designPatterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Georgiana on 04-Dec-18.
 */

//Observer Design Pattern
//Observable

class Order implements Observable{
    private boolean cooked = true;
    private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

    public boolean isCooked(){
        return cooked;
    }

    public void setCooked(boolean cooked){
        this.cooked = cooked;
    }

    @Override
    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    @Override
    public void removePizza(Pizza pizza) {
        pizzas.remove(pizza);
    }

    @Override
    public void notifyObserver() {
        for(Pizza pizza: pizzas){
            pizza.update();
        }
    }
}
