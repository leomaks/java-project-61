package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {

    public static void play() {
        final int calc = 3;
        System.out.println("What is the result of the expression?");
        Engine.play(calc);
    }
    public static boolean playRound() {
        final int max = 10;
        final int countOfOperations = 3;

        int number1 =  (int) (Math.random() * max);
        int number2 =  (int) (Math.random() * max);
        int operation =  (int) (Math.random() * max);
        String operand = "+";
        int result = 0;
        switch (operation % countOfOperations) {
            case 0: operand = "+"; result = number1 + number2;
                break;
            case 1: operand = "-"; result = number1 - number2;
                break;
            case 2: operand = "*"; result = number1 * number2;
                break;
            default:
        }

        boolean win = false;

        System.out.println("Question: " + number1 + " " + operand + " " +  number2);
        var rightAnswer = Integer.toString(result);

        win = Engine.isAnswerCorrect(rightAnswer);
        return win;
    }

}
