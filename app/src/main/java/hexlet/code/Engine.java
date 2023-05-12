package hexlet.code;
import java.util.Scanner;


public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static void play(String description, String[][] roundsData) {

        // Greeting
        System.out.println("Welcome to the Brain Games!");
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name? ");

        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");

        // printing rules
        System.out.println(description);

        // play rounds
        for (int i = 0; i < ROUNDS_COUNT; i++) {

            System.out.print("Question: ");
            System.out.println(roundsData[i][0]); // round question

            // проверка раунда
            boolean winRound = false;
            System.out.print("Your answer: ");
            input = new Scanner(System.in);
            String answer = input.nextLine();

            if (roundsData[i][1].equals(answer)) {
                System.out.println("Correct!");
            }
            else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + roundsData[i][1]  + "'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }

        }
        System.out.println("Congratulations, " + name + "!");

    }

}
