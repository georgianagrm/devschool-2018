package com.company.designPatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pizza pizza = new PizzaFactory().getPizza("Bacon Cheese Fry Pizza");
        Topping.BACON.addTopping(pizza);
        Kitchen kitchen = Kitchen.getInstance();
        kitchen.cookPizza(pizza);

        Order order = new Order();
        order.addPizza(pizza);
        order.notifyObserver();

        System.out.println();
        Pizza pizza2 = new PizzaFactory().getPizza("Neapolitan Pizza");
        Topping.MOZZARELLA.addTopping(pizza2);
        Kitchen kitchen2 = Kitchen.getInstance();
        kitchen2.cookPizza(pizza2);













    }
}
