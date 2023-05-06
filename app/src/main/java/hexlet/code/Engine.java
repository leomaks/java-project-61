package hexlet.code;
import java.util.Scanner;
import hexlet.code.Cli;

public class Engine {

    public static void play(String[][] answers) {
        final int rounds = 3;
        System.out.println(answers[0][0]); // rools

        boolean round = false;

        for (int i = 1; i <= rounds; i++) {

            System.out.println(answers[i][0]); // round question
            round = isAnswerCorrect(answers[i][1]); // answer

            if (!round) {
                break;
            }
            if (i == rounds) {
                System.out.println("Congratulations, " + Cli.getName() + "!");
            }
        }
    }

    public static boolean isAnswerCorrect(String rightAnswer) {
        boolean win = false;

        System.out.print("Your answer: ");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        if (rightAnswer.equals(answer)) {
            win = true;
            System.out.println("Correct!");
        } else {

            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                    + rightAnswer  + "'");
            System.out.println("Let's try again, " + Cli.getName() + "!");
        }

        return win;

    }

}
