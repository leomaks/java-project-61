package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    public static final int MAX = 1000;
    public static void play() {

        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {

            int number =  (int) (Math.random() * MAX);
            roundsData[i][0] = String.valueOf(number); // question
            roundsData[i][1] = (number % 2 == 0) ? "yes" : "no"; // right answer
        }

        Engine.play(description, roundsData);
    }

}

