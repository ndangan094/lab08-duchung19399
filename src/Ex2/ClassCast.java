package Ex2;

public class ClassCast {
    public static void CA() throws ClassCastException{
        Object a = new Integer(5);
        System.out.println((String)a);
    }
    public static void main(String[] args) {
        try {
            CA();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }
}
