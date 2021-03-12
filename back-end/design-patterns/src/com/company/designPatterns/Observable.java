package com.company.designPatterns;

/**
 * Created by Georgiana on 06-Dec-18.
 */
public interface Observable {
    public void addPizza(Pizza pizza);
    public void removePizza(Pizza pizza);
    public void notifyObserver();
}
