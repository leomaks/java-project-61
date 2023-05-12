package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    public static final int MAX = 1000;
    public static void play() {

        String[][] roundsData = new String[Engine.ROUNDS_COUNT][];
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.play(description, roundsData);
    }

    public static String[] generateRoundData() {

        String[] roundData = new String[2];
        int number =  (int) (Math.random() * MAX);
        roundData[0] = String.valueOf(number); // question
        roundData[1] = isEven(number) ? "yes" : "no"; // right answer

        return roundData;
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

}

