package Ex2;

public class NullPointer {
    public static void NPE(){
        String a = null;
        a.length();
    }
    public static void main(String[] args) {
        try {
            NPE();
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
