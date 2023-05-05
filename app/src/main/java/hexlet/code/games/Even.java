package hexlet.code.games;
import hexlet.code.Engine;

public class Even {

    public static void play() {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.play(2);
    }
    public static boolean playRound() {
        final int max = 1000;
        boolean win = false;
        int number =  (int) (Math.random() * max);
        System.out.println("Question: " + number);

        String rightAnswer = (number % 2 == 0) ? "yes" : "no";
        win = Engine.isAnswerCorrect(rightAnswer);
        return win;
    }

}

