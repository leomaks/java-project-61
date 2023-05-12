package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {

    public static final int MAX = 10;
    public static final int COUNT_OF_OPERATION = 3;
    public static void play() {

        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        String description = "What is the result of the expression?";

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {

            int number1 = (int) (Math.random() * MAX);
            int number2 = (int) (Math.random() * MAX);
            int operation = (int) (Math.random() * MAX);

            String operand = "";
            int result = 0;

            switch (operation % COUNT_OF_OPERATION) {
                case 0:
                    operand = "+";
                    result = number1 + number2;
                    break;
                case 1:
                    operand = "-";
                    result = number1 - number2;
                    break;
                case 2:
                    operand = "*";
                    result = number1 * number2;
                    break;
                default:
            }


            roundsData[i][0] = number1 + " " + operand + " " + number2;
            roundsData[i][1] = Integer.toString(result);
        }

        Engine.play(description, roundsData);

    }

}
