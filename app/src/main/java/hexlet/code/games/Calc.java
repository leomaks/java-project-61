package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static final int MAX = 10;
    public static final int COUNT_OF_OPERATION = 3;
    public static void play() {

        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        String description = "What is the result of the expression?";

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }

        Engine.play(description, roundsData);

    }
    public static String[] generateRoundData() {

        String[] roundData = new String[2];

        int number1 = Utils.generateNumber(MAX);
        int number2 = Utils.generateNumber(MAX);

        char operand = generateOperand();

        roundData[0] = number1 + " " + operand + " " + number2;
        roundData[1] = Integer.toString(calculate(number1, number2, operand));

        return roundData;
    }
    public static int calculate(int number1, int number2, char operand) {

        int result = switch (operand) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new Error("Unknown order state: " + operand);
        };

        return result;
    }

    public static char generateOperand() {
        String operands = "+-*";
        return operands.charAt(Utils.generateNumber(operands.length()));
    }

}
