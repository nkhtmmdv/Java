import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryExample {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        try {
            while (true) {
                list.add(new int[1000000]);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError caught: " + e);
        }
    }
}

