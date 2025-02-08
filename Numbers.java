import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        int[] attempts = new int[100];
        int attemptCount = 0;

        System.out.println("Let the game begin!");
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        while (true) {
            System.out.println("Enter your guess: ");
            int guess = scanner.nextInt();

            attempts[attemptCount] = guess;
            attemptCount++;

            if (guess < randomNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guess > randomNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
                System.out.println("Your attempts: ");

                for (int i = 0; i < attemptCount; i++) {
                    System.out.print(attempts[i] + " ");
                }
                System.out.println();
                break;
            }
        }
        scanner.close();
    }
}
