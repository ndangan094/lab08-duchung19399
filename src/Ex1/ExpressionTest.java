package Ex1;

public class ExpressionTest {
    public static void main(String args[]) {
        try {
            Numeral a = new Numeral(10);
            Numeral b = new Numeral(1);
            Numeral c = new Numeral(2);
            Numeral d = new Numeral(3);

            Square s1 = new Square(a);
            Subtraction sub = new Subtraction(s1,b);
            Multiplication mul = new Multiplication(c, d);
            Addition add = new Addition(sub,mul);
            Square s2 = new Square(add);


            System.out.println(s2.toString());
            System.out.println(s2.evaluate());
        } catch (ArithmeticException e) {
            System.out.println("Loi chia cho 0");
        }

    }
}
