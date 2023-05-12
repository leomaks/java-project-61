package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {
    public static final int MAX = 100;

    public static void play() {

        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        String description = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.play(description, roundsData);
    }

    public static String[] generateRoundData() {
        String[] roundData = new String[2];

        int number1 =  (int) (Math.random() * MAX);
        int number2 =  (int) (Math.random() * MAX);

        roundData[0] = number1 + " " + number2; // question
        roundData[1] = Integer.toString(gcd(number1, number2)); // right answer

        return roundData;
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
