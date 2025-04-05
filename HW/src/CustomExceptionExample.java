public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("This is my custom exception!");
        } catch (MyCustomException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}

