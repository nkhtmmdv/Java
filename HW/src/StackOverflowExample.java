public class StackOverflowExample {
    public static void main(String[] args) {
        try {
            recursive();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError caught: " + e);
        }
    }

    public static void recursive() {
        recursive();
    }
}
