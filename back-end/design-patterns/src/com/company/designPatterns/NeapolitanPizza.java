package com.company.designPatterns;

/**
 * Created by Georgiana on 04-Dec-18.
 */

//Factory Design Pattern

public class NeapolitanPizza extends Pizza {

    public NeapolitanPizza(){
        super.name = "Neapolitan Pizza";
        super.price = 28;
        super.toppings.add("Parmesan cheese");
        super.toppings.add("Tomatoes");
        super.toppings.add("Ananas");

    }
}
