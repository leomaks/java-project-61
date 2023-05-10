package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {
    public static final int MAX = 100;

    public static void play() {

        String[][] answers = new String[Engine.ROUNDS][2];
        String description = "Find the greatest common divisor of given numbers.";


        for (int i = 0; i < Engine.ROUNDS; i++) {

            int number1 =  (int) (Math.random() * MAX);
            int number2 =  (int) (Math.random() * MAX);

            answers[i][0] = number1 + " " + number2; // question
            answers[i][1] = Integer.toString(gcd(number1, number2)); // right answer
        }

        Engine.play(description, answers);
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
