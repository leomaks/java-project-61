package hexlet.code;

import java.util.Scanner;

public class Even {

    public static void play() {

        Cli.getUserName();
        Scanner input = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            int number =  (int) (Math.random() * 1000);
            if (!playRound(number)) {
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + App.name + "!");
            }
        }
    }
    public static boolean playRound(int number) {

        boolean win = false;

        System.out.println("Question: " + number);
        System.out.println("Your answer: ");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        boolean isNumberEven = (number % 2 == 0);
        boolean isAnswerYes = answer.equals("yes");

        if ((isNumberEven == isAnswerYes) && (answer.equals("yes") || answer.equals("no"))) {
            win = true;
            System.out.println("Correct!");
        } else {
            String rightAnswer = isNumberEven ? "yes" : "no";

            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                    + rightAnswer  + "'");
            System.out.println("Let's try again, " + App.name + "!");
        }

        return win;
    }

}