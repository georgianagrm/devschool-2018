package Polymorphism;

public class BMW extends Car {

    public BMW(String name, int cylinders, String manufacturer) {
        super(name, cylinders, manufacturer);
    }

    @Override
    public String getManufacturer() {
        System.out.println("getManufacturerName: "+manufacturer);
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
        System.out.println("getNumberOfCylinders: "+cylinders);
        return cylinders;
    }

    @Override
    public int getWheels() {
        System.out.println("getNumberOfWheels: "+wheels);
        return wheels;
    }

    @Override
    public void carTest() {
        System.out.println("Car: "+manufacturer+" - "+name);
    }

    @Override
    public String toString() {
        return "BMW {" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", wheels=" + wheels +
                ", engine=" + engine +
                ", cylinders=" + cylinders +
                '}';
    }
}
