package Ex1;

public class Square extends Expression {

    private Expression expression;

    /**
     * Constructor
     */
    public Square(Expression expression) {
        this.expression= expression;
    }

    /**
     * Getter & Setter
     * @return
     */

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return expression.toString() +"^2";
    }

    @Override
    public int evaluate() {
        return expression.evaluate()*expression.evaluate();
    }
}
