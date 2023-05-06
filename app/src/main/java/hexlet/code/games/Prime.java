package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {

    public static void play() {
        String[][] answers = new String[4][2];
        answers[0][0] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        final int rounds = 3;
        final int max = 100;
        int number;

        for (int i = 1; i <= rounds; i++) {
            boolean isPrime = true;
            number = (int) (Math.random() * max);

            for (int j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    isPrime = false;
                }
            }

            answers[i][0] = "Question: " + number; // question
            answers[i][1] = isPrime ? "yes" : "no"; // right answer
        }

        Engine.play(answers);
    }
}
