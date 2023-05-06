package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Arrays;

public class Even {

    public static void play() {
        String[][] answers = new String[4][2];
        answers[0][0] = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        final int rounds = 3;
        final int max = 1000;
        int number;

        for (int i = 1; i <= rounds; i++) {

            number =  (int) (Math.random() * max);
            answers[i][0] = "Question: " + number;; // question
            answers[i][1] = (number % 2 == 0) ? "yes" : "no"; // right answer
        }

        Engine.playArray(answers);
    }

}

