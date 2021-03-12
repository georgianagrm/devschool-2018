package OOPprinciples;

public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger(String breadRoll, float price, String name) {
        super(breadRoll, price, name);
        super.addAdditions(Additions.CHIPS);
        super.addAdditions(Additions.DRINKS);
    }

    @Override
    public void addAdditions(Additions addition) {
        System.out.println("There are already the maximum number of additions");
    }

    @Override
    public void printPrice() {
        System.out.println("The total cost is "+(this.price+this.basePrice)+" and additions are "+getAdditions());
    }

    @Override
    public String toString() {
        return "DeluxeHamburger {" +
                "breadRoll='" + breadRoll + '\'' +
                ", additions=" + additions +
                ", basePrice=" + basePrice +
                ", additionalPrice=" + price +
                '}';
    }
}
