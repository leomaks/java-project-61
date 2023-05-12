package hexlet.code.games;
import hexlet.code.Engine;
public class Progression {
    public static final int MAX = 100;
    public static final int MAX_STEP = 10;
    public static final int LENGTH = 10;
    public static void play() {

        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        String description = "What number is missing in the progression?";


        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {

            int startNumber =  (int) (Math.random() * MAX);
            int step =  (int) (Math.random() * MAX_STEP);
            int hiddenMemberCount =  (int) (Math.random() * (LENGTH - 1));
            int hiddenNumber = 0;
            String line = "";

            for (int j = 0; j < LENGTH; j++) {
                if (j == hiddenMemberCount) {
                    line += ".. ";
                    hiddenNumber = startNumber + j * step;
                } else {
                    line += (startNumber + (j * step)) + " ";
                }
            }
            roundsData[i][0] = line; // question
            roundsData[i][1] = Integer.toString(hiddenNumber); // right answer
        }
        Engine.play(description, roundsData);

    }
}
