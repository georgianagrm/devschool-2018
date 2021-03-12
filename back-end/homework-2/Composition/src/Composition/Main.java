package Composition;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    List<Furniture> lista=new ArrayList<Furniture>();
    Furniture f1=new Furniture("Chair", 2, Activity.sitON, 45.9);
    Furniture f2=new Furniture("Couch", 1, Activity.sitON, 340.0);
    Furniture f3=new Furniture("Table", 2, Activity.COOK, 125.5);
    lista.add(f1);
    lista.add(f2);
    lista.add(f3);
    Room r1=new Room(lista, 2, "Blue", 4);
    System.out.println(r1);
    System.out.println(r1.printActivity());

    }
}
