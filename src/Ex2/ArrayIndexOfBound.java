package Ex2;

public class ArrayIndexOfBound {
    public static void AIOB() throws ArrayIndexOutOfBoundsException{
        int a[] =new int[1];
        a[1] = 5;
    }
    public static void main(String[] args) {
        try {
            AIOB();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
