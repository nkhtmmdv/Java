import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] schedule = new String[7][2];


        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to the gym";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "read a book";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "learn Java";
        schedule[5][0] = "Friday";
        schedule[5][1] = "hang out with friends";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "go shopping";

        while (true) {
            System.out.println("Please, input the day of the week:");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                break;
            }

            boolean found = false;
            for (int i = 0; i < 7; i++) {
                if (schedule[i][0].toLowerCase().equals(input)) {
                    System.out.println("Your tasks for " + schedule[i][0] + ": " + schedule[i][1] + ".");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }

        scanner.close();
    }
}
