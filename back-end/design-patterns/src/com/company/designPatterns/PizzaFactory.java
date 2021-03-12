package com.company.designPatterns;

/**
 * Created by Georgiana on 04-Dec-18.
 */

//Factory Design Pattern

public class PizzaFactory {

    public static Pizza getPizza(String type){
        Pizza pizza = null;

        if("Bacon Cheese Fry Pizza".equals(type)){
            pizza = new BaconCheeseFryPizza();
        } else if("Neapolitan Pizza".equals(type)){
            pizza = new NeapolitanPizza();
        } else if("New York Style Pizza".equals(type)){
            pizza = new NewYorkStylePizza();
        }
        return pizza;
    }


}
