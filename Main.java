import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static PerformOperation isOdd() {
        return (n) -> n % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return (n) -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return (n) -> {
            String original = String.valueOf(n);
            String reversed = new StringBuilder(original).reverse().toString();
            return original.equals(reversed);
        };
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] inputs = br.readLine().split(" ");
            int choice = Integer.parseInt(inputs[0]);
            int num = Integer.parseInt(inputs[1]);
            PerformOperation op;
            boolean result;

            switch (choice) {
                case 1:
                    op = ob.isOdd();
                    result = op.check(num);
                    System.out.println(result ? "ODD" : "EVEN");
                    break;
                case 2:
                    op = ob.isPrime();
                    result = op.check(num);
                    System.out.println(result ? "PRIME" : "COMPOSITE");
                    break;
                case 3:
                    op = ob.isPalindrome();
                    result = op.check(num);
                    System.out.println(result ? "PALINDROME" : "NOT PALINDROME");
                    break;
            }
        }
    }
}
