package Composition;

public enum Activity {
    lookAT(1), sitON(2), COOK(3);
    private int cod;

    //Composition getter
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    Activity(int cod) {
        this.cod = cod;
    }
}
