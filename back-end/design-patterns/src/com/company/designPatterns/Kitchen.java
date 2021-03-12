package com.company.designPatterns;

/**
 * Created by Georgiana on 04-Dec-18.
 */

//Singleton Design Pattern

public class Kitchen {
    private Kitchen() {}

    private static class SingletonHolder {
        public static final Kitchen instance = new Kitchen();
    }

    public static Kitchen getInstance() {
        return SingletonHolder.instance;
    }

    public void cookPizza(Pizza pizza){
        System.out.println("Cook " + pizza);
    }
}
