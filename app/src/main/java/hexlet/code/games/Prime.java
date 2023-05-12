package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {
    public static final int MAX = 100;

    public static void play() {

        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";


        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            boolean isPrime = true;
            int number = (int) (Math.random() * MAX);

            for (int j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    isPrime = false;
                }
            }

            roundsData[i][0] = String.valueOf(number); // question
            roundsData[i][1] = isPrime ? "yes" : "no"; // right answer
        }

        Engine.play(description, roundsData);
    }
}
