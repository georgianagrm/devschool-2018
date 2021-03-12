package Polymorphism;

public class Audi extends Car {
    private int noCars;
    private double price;

    public Audi(String name, int cylinders, String manufacturer, int noCars, double price) {
        super(name, cylinders, manufacturer);
        this.noCars = noCars;
        this.price = price;
    }

    @Override
    public String getManufacturer() {
            System.out.println("getManufacturer: "+manufacturer);
            return manufacturer;
    }

    @Override
    public boolean isEngine() {
        System.out.println("isEngine: "+engine);
        return engine;
    }

    @Override
    public String getName() {
        System.out.println("getCarModel: "+name);
        return name;
    }

    @Override
    public int getCylinders() {
        System.out.println("getCylinders: "+cylinders);
        return cylinders;
    }

    @Override
    public int getWheels() {
        System.out.println("getNumberOfWheels: "+wheels);
        return wheels;
    }

    //Overloading
    public double calculatePriceOnCars(){
        return this.price*this.noCars;
    }

    public String calculatePriceOnCars(int noCars) {
        return "The total price for "+noCars+" cars is: " + this.price * this.noCars;
    }

    //Method
    @Override
    public void carTest() {
        System.out.println("The car manufacturer and model are: "+manufacturer+" "+name);
    }

    @Override
    public String toString() {
        return "Audi {" +
                "manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                ", engine=" + engine +
                ", cylinders=" + cylinders +
                ", price=" + price +
                ", noCars=" + noCars +
                '}';
    }
}
