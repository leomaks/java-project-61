package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {

    public static void play(int gameName) {
        boolean round = false;
        final int rounds = 3;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;

        for (int i = 0; i < rounds; i++) {
            switch (gameName) {
                case even: round = Even.playRound();
                    break;
                case calc: round = Calc.playRound();
                    break;
                case gcd: round = GCD.playRound();
                    break;
                case progression: round = Progression.playRound();
                    break;
                case prime: round = Prime.playRound();
                    break;
                default:
            }

            if (!round) {
                break;
            }
            if (i == 2) {
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
