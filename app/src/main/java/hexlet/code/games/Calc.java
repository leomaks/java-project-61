package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {

    public static void play() {
        System.out.println("What is the result of the expression?");
        Engine.play(3);
    }
    public static boolean playRound() {

        int number1 =  (int) (Math.random() * 10);
        int number2 =  (int) (Math.random() * 10);
        int operation =  (int) (Math.random() * 10);
        String operand = "";
        int result = 0;
        switch (operation % 3) {
            case 0: operand = "+"; result = number1 + number2;
                break;
            case 1: operand = "-"; result = number1 - number2;
                break;
            case 2: operand = "*"; result = number1 * number2;
                break;
            default:
        }

        boolean win = false;

        System.out.println("Question:dsfsdfdsfsd" + number1 + " " + operand + " " +  number2);
        var rightAnswer = Integer.toString(result);

        win = Engine.isAnswerCorrect(rightAnswer);
        return win;
    }

}
