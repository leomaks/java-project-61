package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {

    public static void play() {
        final int prime = 6;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.play(prime);
    }
    public static boolean playRound() {

        boolean win = false;
        final int max = 100;
        int number =  (int) (Math.random() * max);
        boolean isPrime = true;

        System.out.println("Question: " + number);

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        String rightAnswer = isPrime ? "yes" : "no";
        win = Engine.isAnswerCorrect(rightAnswer);
        return win;

    }

}
