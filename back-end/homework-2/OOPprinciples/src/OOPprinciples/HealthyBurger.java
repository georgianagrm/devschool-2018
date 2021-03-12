package OOPprinciples;

public class HealthyBurger extends Hamburger {

    public HealthyBurger(float bprice, String name) {
        super("BrownRye", bprice, name);
    }

    @Override
    public void addAdditions(Additions addition) {
        if(this.additions.size()<=6){
            this.additions.add(addition);
            System.out.println("The addition name is "+addition.name()+" and price "+addition.getPrice());
            this.price+=addition.getPrice();
        }
        else
        {
            System.out.println("You can only add up to 6 ingredients");
        }
    }

    @Override
    public void printPrice() {
        System.out.println("The final price of the burger is "+(this.price+this.basePrice)+" and the additions are "+this.getAdditions());
    }

    @Override
    public String toString() {
        return "HealthyBurger {" +
                "breadRoll='" + breadRoll + '\'' +
                ", basePrice=" + basePrice +
                ", additionalPrice=" + price +
                '}';
    }
}
