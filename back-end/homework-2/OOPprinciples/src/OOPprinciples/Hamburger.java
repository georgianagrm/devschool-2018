package OOPprinciples;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
    protected String breadRoll;
    private String meat;
    protected List<Additions> additions = new ArrayList<>();
    protected float basePrice;
    private String name;
    protected float price;

    public Hamburger(String breadRoll, float bprice, String name) {
        this.breadRoll = breadRoll;
        this.basePrice = bprice;
        this.name = name;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public void setBreadRoll(String breadRoll) {
        this.breadRoll = breadRoll;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public List<Additions> getAdditions() {
        return additions;
    }

    public void setAdditions(List<Additions> additions) {
        this.additions = additions;
    }

    public float getPrice() {
        return basePrice;
    }

    public void setPrice(float price) {
        this.basePrice = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAdditions(Additions addition){
        if(this.additions.size()<=4){
            this.additions.add(addition);
            System.out.println("The addition name is "+addition.name()+" and price "+addition.getPrice());
            this.price+=addition.getPrice();
        }
        else
        {
            System.out.println("You can only add up to 4 ingredients");
        }
    }

    public void printPrice(){
        System.out.println("The total price of the burger is "+(this.price+this.basePrice)+" and the additions are "+this.getAdditions());
    }

    public String toString() {
        return "Hamburger {" +
                "breadRoll='" + breadRoll + '\'' +
                ", meat='" + getMeat() + '\'' +
                ", basePrice=" + basePrice +
                ", additionalPrice="+ price+
                ", name='" + name + '\'' +
                '}';
    }

}
