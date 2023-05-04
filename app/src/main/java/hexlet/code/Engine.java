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

        for (int i = 0; i < 3; i++) {
            switch (gameName) {
                case 2: round = Even.playRound();
                    break;
                case 3: round = Calc.playRound();
                    break;
                case 4: round = GCD.playRound();
                    break;
                case 5: round = Progression.playRound();
                    break;
                case 6: round = Prime.playRound();
                    break;
                default:
            }

            if (!round) {
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + App.name + "!");
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
            System.out.println("Let's try again, " + App.name + "!");
        }

        return win;


    }

}
