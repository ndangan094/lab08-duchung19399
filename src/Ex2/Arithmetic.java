package Ex2;

public class Arithmetic {
    public static void AE() throws ArithmeticException{
        int a;
        a=5/0;
    }
    public static void main(String[] args) {
        try {
            AE();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
