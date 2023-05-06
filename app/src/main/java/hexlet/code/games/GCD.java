package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {

    public static void play() {
        String[][] answers = new String[4][2];
        answers[0][0] = "Find the greatest common divisor of given numbers.";

        final int rounds = 3;
        final int max = 100;
        int number;

        for (int i = 1; i <= rounds; i++) {

            int number1 =  (int) (Math.random() * max);
            int number2 =  (int) (Math.random() * max);

            answers[i][0] = "Question: " + number1 + " " + number2; // question
            answers[i][1] = Integer.toString(gcd(number1, number2)); // right answer
        }

        Engine.playArray(answers);
    }

    public static int gcd(int a, int b) {

        while ((a != 0) && (b != 0)) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }

}
