package OOPprinciples;

public enum Additions {
    LETTUCE(2.1f), TOMATO(6.7f), CARROT(3.4f), KETCHUP(4.3f), MAYONNAISE(4.1f), ONION(5.5f), CHIPS(11.f), DRINKS(8.6f);
    private final float price;

    Additions(float price){
        this.price=price;
    }
    public float getPrice() {
        return price;
    }
}
