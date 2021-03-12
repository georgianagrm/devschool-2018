package OOPprinciples;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Additions> list=new ArrayList<>();
        Hamburger h = new Hamburger("WhiteRoll", 5.4f, "White Bread Roll Hamburger with Additions");
        h.setMeat("Chicken");
        h.getMeat();
        h.addAdditions(Additions.CARROT);
        h.addAdditions(Additions.LETTUCE);
        h.addAdditions(Additions.MAYONNAISE);
        h.printPrice();
        System.out.println(h.toString());
        System.out.println();

        HealthyBurger hb = new HealthyBurger(11.3f,"Healthy Burger");
        hb.addAdditions(Additions.MAYONNAISE);
        hb.addAdditions(Additions.LETTUCE);
        hb.addAdditions(Additions.KETCHUP);
        hb.addAdditions(Additions.ONION);
        hb.addAdditions(Additions.TOMATO);
        hb.printPrice();
        System.out.println(hb.toString());
        System.out.println();

        DeluxeHamburger dh=new DeluxeHamburger("Buns", 8.8f, "Deluxe Hamburger");
        dh.printPrice();
        System.out.println(dh.toString());


    }
}
