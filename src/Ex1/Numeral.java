package Ex1;

public class Numeral extends Expression {

    private int value;

    /**
     * Constructor
     */
    public Numeral() {
        this.value = 0;
    }

    public Numeral(int value) {
        this.value = value;
    }

    /**
     * Getter & Setter
     * @return
     */
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }

    @Override
    public int evaluate() {
        return this.value;
    }
}
