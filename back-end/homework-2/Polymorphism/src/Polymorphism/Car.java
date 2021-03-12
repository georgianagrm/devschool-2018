package Polymorphism;

public class Car {
    protected String name;
    protected String manufacturer;
    protected int wheels;
    protected boolean engine;
    protected int cylinders;

    public Car(){}
    public Car(String name, int cylinders, String manufacturer) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine=true;
        this.wheels=4;
        this.manufacturer=manufacturer;
    }

    public String getManufacturer() {
        System.out.println("Manufacturer of the car: "+this.manufacturer);
        return manufacturer;
    }

    public boolean isEngine() {
        System.out.println("Engine: "+this.engine);
        return engine;
    }

    public String getName() {
        System.out.println("Name of the car: "+this.name);
        return name;
    }

    public int getCylinders() {
        System.out.println("Number of cylinders: "+this.cylinders);
        return cylinders;
    }

    public int getWheels() {
        System.out.println("Number of wheels: "+this.wheels);
        return wheels;
    }

    public void carTest(){
        System.out.println("This car is: "+manufacturer+" "+name);
    }

    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", wheels=" + wheels +
                ", engine=" + engine +
                ", cylinders=" + cylinders +
                '}';
    }
}
