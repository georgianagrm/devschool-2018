package Polymorphism;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car c = new Car("Pickup", 6, "Test");
        c.getManufacturer();
        c.getName();
        c.getWheels();
        c.isEngine();
        c.getCylinders();
        c.carTest();
        System.out.println();

        //Upcasting
        Car c2 = new BMW("X5 2019", 6, "BMW");
        c2.getManufacturer();
        System.out.println(c2);
        c2.carTest();
        System.out.println();

        Audi c3 = new Audi("A6 2019", 4, "Audi", 2, 241536.979);
        System.out.println(c3);
        c3.getManufacturer();
        //Overload
        System.out.println(c3.calculatePriceOnCars());
        System.out.println(c3.calculatePriceOnCars(2));
        c3.carTest();
        System.out.println();

        Opel c4 = new Opel("Astra 2018", 4, "Opel", true);
        System.out.println(c4);
        c4.getName();
        c4.carTest();
    }
}
