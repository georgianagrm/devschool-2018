package com.company.designPatterns;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Georgiana on 04-Dec-18.
 */

//Observer

public class Pizza implements com.company.designPatterns.Observer {
    String name;
    Topping topping;
    float price;
    ArrayList<String> toppings = new ArrayList<>();
    Order order;

    protected Pizza() {}

    public void setPrice(float price){
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public Pizza(Order order) {
        this.order=order;
    }

    @Override
    public void update(){
        buyPizza();
    }

    public void buyPizza(){
        System.out.println("Pizza finished :) ");
    }


    @Override
    public String toString() {
        return "Pizza {" +
                "name = '" + name + '\'' +
                ", extra topping = " + topping +
                ", price = " + price +
                ", toppings = " + toppings +
                '}';
    }
}
