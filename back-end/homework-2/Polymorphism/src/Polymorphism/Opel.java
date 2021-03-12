package Polymorphism;

public class Opel extends Car {
    private boolean spareTire;

    public boolean isSpareTire() {
        return spareTire;
    }

    public void setSpareTire(boolean spareTire) {
        this.spareTire = spareTire;
    }

    public Opel(String name, int cylinders, String manufacturer, boolean spareTire) {
        super(name, cylinders, manufacturer);
        this.spareTire = spareTire;
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
        System.out.println("getWheels: "+wheels);
        return wheels;
    }

    @Override
    public void carTest() {
        System.out.println("The manufacturer name is "+manufacturer+" and the car model "+name);
    }

    @Override
    public String toString() {
        return "Opel {" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", wheels=" + wheels +
                ", engine=" + engine +
                ", cylinders=" + cylinders +
                ", spareTire=" + spareTire +
                '}';
    }
}
