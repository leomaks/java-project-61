package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
    public static void play() {

        String[][] answers = new String[4][2];
        answers[0][0] = "What is the result of the expression?";
        final int rounds = 3;
        final int max = 10;
        final int countOfOperations = 3;


        for (int i = 1; i <= rounds; i++) {

            int number1 = (int) (Math.random() * max);
            int number2 = (int) (Math.random() * max);
            int operation = (int) (Math.random() * max);

            String operand = "";
            int result = 0;

            switch (operation % countOfOperations) {
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


            answers[i][0] = "Question: " + number1 + " " + operand + " " + number2;
            answers[i][1] = Integer.toString(result);
        }

        Engine.playArray(answers);

    }

}
