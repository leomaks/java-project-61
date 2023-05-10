package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    public static final int MAX = 1000;
    public static void play() {

        String[][] answers = new String[Engine.ROUNDS][2];
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < Engine.ROUNDS; i++) {

            int number =  (int) (Math.random() * MAX);
            answers[i][0] = String.valueOf(number); // question
            answers[i][1] = (number % 2 == 0) ? "yes" : "no"; // right answer
        }

        Engine.play(description, answers);
    }

}

