package hexlet.code.games;
import hexlet.code.Engine;

public class Even {

    public static void play() {

        final int rounds = 3;
        final int max = 1000;
        int number;

        String[][] answers = new String[rounds+1][2];
        answers[0][0] = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 1; i <= rounds; i++) {

            number =  (int) (Math.random() * max);
            answers[i][0] = "Question: " + number;; // question
            answers[i][1] = (number % 2 == 0) ? "yes" : "no"; // right answer
        }

        Engine.play(answers);
    }

}

