package homework1;

public class Pickup extends Car {
    private int nrLocuri;

    public Pickup(String directie, int gear, float viteza, String tipMotor, int capacitateMotor, int putereMotor, String brand, String model, int nrLocuri) {
        super(directie, gear, viteza, tipMotor, capacitateMotor, putereMotor, brand, model);
        this.nrLocuri = nrLocuri;
    }

    public Pickup() {
        super();
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "Pickup{ " + super.toString()+
                " nrLocuri=" + nrLocuri +
                '}';
    }
}
