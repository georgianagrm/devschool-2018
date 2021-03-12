package com.company.designPatterns;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Georgiana on 04-Dec-18.
 */

//Factory Design Pattern

public class BaconCheeseFryPizza extends Pizza{

    public BaconCheeseFryPizza() {
        super.name = "Bacon Cheese Fry Pizza";
        super.price = 32;
        super.toppings.add("Cheese");
        super.toppings.add("Tomatoes");
        super.toppings.add("Olives");
        super.toppings.add("Bacon");
    }


}
