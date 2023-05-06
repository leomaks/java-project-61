package hexlet.code.games;
import hexlet.code.Engine;
public class Progression {

    public static void play() {

        final int rounds = 3;
        final int max = 100;
        final int maxStep = 20;
        final int length = 10;
        String line;

        String[][] answers = new String[rounds + 1][2];
        answers[0][0] = "What number is missing in the progression?";


        for (int i = 1; i <= rounds; i++) {

            int startNumber =  (int) (Math.random() * max);
            int step =  (int) (Math.random() * maxStep);
            int hiddenMemberCount =  (int) (Math.random() * (length - 1));
            int hiddenNumber = 0;
            line = "Question: ";

            for (int j = 0; j < length; j++) {
                if (j == hiddenMemberCount) {
                    line += ".. ";
                    hiddenNumber = startNumber + j * step;
                } else {
                    line += (startNumber + j * step) + " ";
                }
            }
            answers[i][0] = line; // question
            answers[i][1] = Integer.toString(hiddenNumber); // right answer
        }
        Engine.play(answers);

    }
}
