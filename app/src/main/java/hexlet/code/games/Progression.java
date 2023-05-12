package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    public static final int MAX = 100;
    public static final int MAX_STEP = 10;
    public static final int LENGTH = 10;
    public static void play() {

        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        String description = "What number is missing in the progression?";

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.play(description, roundsData);
    }

    public static String[] generateRoundData() {

        String[] roundData = new String[2];
        String[] progression = generateProgression((int) (Math.random() * MAX), LENGTH, (int) (Math.random() * MAX_STEP));

        int hiddenMemberCount =  (int) (Math.random() * (LENGTH - 1));
        String hiddenNumber = progression[hiddenMemberCount];
        progression[hiddenMemberCount] = "..";

        roundData[0] = Arrays.toString(progression).substring(1, Arrays.toString(progression).length() - 1)
                .replaceAll(", ", " ");
        roundData[1] = hiddenNumber; // right answer

        return roundData;
    }

    public static String[] generateProgression(int startNumber, int length, int step) {

        String[] progression = new String[length];

        for (int j = 0; j < LENGTH; j++) {
            progression[j] = Integer.toString(startNumber + (j * step));
        }

        return progression;
    }

}
