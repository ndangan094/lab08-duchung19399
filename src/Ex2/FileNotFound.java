package Ex2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {
    public static void FNF() throws FileNotFoundException {
        FileReader filein = new FileReader("a.txt");
    }
    public static void main(String[] args) {
        try {
            FNF();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
