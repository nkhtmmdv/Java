package lesson6;

public class GlobalExceptionHandler {
    public static void handle(Exception e) {
        System.err.println("Error: " + e.getMessage());
    }
}
