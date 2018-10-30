package Ex1;

public class Multiplication extends BinaryExpression {
    private Expression left,right;

    /**
     * Constructor
     */
    public Multiplication(Expression a, Expression b){
        this.left=a;
        this.right=b;
    }

    /**
     * Getter & Setter
     */

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }
    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }

    @Override
    public String toString() {
        return "("+left().toString()+"*"+right().toString()+")";
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
