package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int MAX = 100;

    public static void play() {

        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.play(description, roundsData);
    }

    public static String[] generateRoundData() {

        String[] roundData = new String[2];
        int number =  Utils.generateNumber(MAX);

        roundData[0] = String.valueOf(number); // question
        roundData[1] = isPrime(number) ? "yes" : "no"; // right answer

        return roundData;
    }

    public static boolean isPrime(int number) {
        boolean isPrime = (number == 0)? false: true;

        for (int j = 2; j <= number / 2; j++) {
            if (number % j == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }


}
