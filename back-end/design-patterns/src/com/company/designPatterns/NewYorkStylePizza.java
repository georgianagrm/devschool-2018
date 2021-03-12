package com.company.designPatterns;

/**
 * Created by Georgiana on 04-Dec-18.
 */

//Factory Design Pattern

public class NewYorkStylePizza extends Pizza {

    public NewYorkStylePizza(){
        super.name = "New York Style Pizza";
        super.price = 32;
        super.toppings.add("Onions");
        super.toppings.add("Tomatoes");
    }
}
