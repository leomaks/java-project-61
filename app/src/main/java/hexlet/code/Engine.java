package hexlet.code;
import java.util.Scanner;


public class Engine {
    public static final int ROUNDS = 3;
    public static void play(String description, String[][] answers) {

        // Greeting
        System.out.println("Welcome to the Brain Games!");
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name? ");

        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");

        // printing rools
        System.out.println(description); // rools


        // play rounds
        for (int i = 0; i < ROUNDS; i++) {

            System.out.print("Question: ");
            System.out.println(answers[i][0]); // round question

            // проверка раунда
            boolean winRound = false;
            System.out.print("Your answer: ");
            input = new Scanner(System.in);
            String answer = input.nextLine();

            if (answers[i][1].equals(answer)) {
                winRound = true;
                System.out.println("Correct!");
            } else {

                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + answers[i][1]  + "'");
                System.out.println("Let's try again, " + name + "!");
            }


            if (!winRound) {
                break;
            }
            if (i == ROUNDS - 1) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }

}
