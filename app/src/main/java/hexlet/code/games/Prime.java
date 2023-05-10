package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {
    public static final int MAX = 100;

    public static void play() {

        String[][] answers = new String[Engine.ROUNDS][2];
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";


        for (int i = 0; i < Engine.ROUNDS; i++) {
            boolean isPrime = true;
            int number = (int) (Math.random() * MAX);

            for (int j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    isPrime = false;
                }
            }

            answers[i][0] = String.valueOf(number); // question
            answers[i][1] = isPrime ? "yes" : "no"; // right answer
        }

        Engine.play(description, answers);
    }
}
