package homework1;

public class Car extends Vehicle {
    private String directie;
    private int gear;
    private float viteza;
    private String tipMotor;
    private int capacitateMotor;
    private int putereMotor;
    private String model;
    private String brand;

    public Car(String directie, int gear, float viteza, String tipMotor, int capacitateMotor, int putereMotor, String model, String brand) {
        this.directie = directie;
        this.gear = gear;
        this.viteza = viteza;
        this.tipMotor = tipMotor;
        this.capacitateMotor = capacitateMotor;
        this.putereMotor = putereMotor;
        this.brand = brand;
        this.model = model;
    }

    public Car(){}

    public String getDirectie() {
        return directie;
    }

    public void setDirectie(String directie) {
        this.directie = directie;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public float getViteza() {
        return viteza;
    }

    public void setViteza(float viteza) {
        this.viteza = viteza;
    }

    public String getTipMotor() {
        return tipMotor;
    }

    public void setTipMotor(String tipMotor) {
        this.tipMotor = tipMotor;
    }

    public int getCapacitateMotor() {
        return capacitateMotor;
    }

    public void setCapacitateMotor(int capacitateMotor) {
        this.capacitateMotor = capacitateMotor;
    }

    public int getPutereMotor() {
        return putereMotor;
    }

    public void setPutereMotor(int putereMotor) {
        this.putereMotor = putereMotor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void handSteering(String directie) {
        System.out.println("Masina "+ brand + " "+ model+" are directia "+directie+".");
        this.directie=directie;
    }

    @Override
    public void changingGear(int gear) {
        System.out.println("Masina "+brand+" "+model+" este in viteza "+gear+".");
        this.gear=gear;
    }

    @Override
    public void movingSpeed(float viteza) {
        if(this.viteza<viteza){
            System.out.println("Viteza este in urcare de la "+this.viteza+" la "+viteza+".");
        }
        else
        {
            System.out.println("Viteza este in coborare de la "+this.viteza+" la "+viteza+".");
        }
        this.viteza=viteza;
    }


    @Override
    public String toString() {
        return "Car{" +
                "directie='" + directie + '\'' +
                ", gear=" + gear +
                ", viteza=" + viteza +
                ", tipMotor='" + tipMotor + '\'' +
                ", capacitateMotor=" + capacitateMotor +
                ", putereMotor=" + putereMotor +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
