package Composition;

public class Furniture {
    private String name;
    private int numberOfFurniture;
    private Activity activity;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfFurniture() {
        return numberOfFurniture;
    }

    public void setNumberOfFurniture(int numberOfFurniture) {
        this.numberOfFurniture = numberOfFurniture;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Furniture(String name, int numberOfFurniture, Activity activity, double price) {
        this.name = name;
        this.numberOfFurniture = numberOfFurniture;
        this.activity = activity;
        this.price = price;
    }

    //Method
    public String totalCost() {
        if (this.numberOfFurniture > 0) {
            return "and the total price of the furniture: "+price * numberOfFurniture;
        }
        else
            return "invalid number of furniture";
    }

    @Override
    public String toString() {
        return "Furniture {" +
                "name='" + name + '\'' +
                ", numberOfFurniture=" + numberOfFurniture +
                ", activity=" + activity +
                ", price="+price+
                '}';
    }
}
