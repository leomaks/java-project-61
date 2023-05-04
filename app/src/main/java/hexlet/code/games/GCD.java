package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {

    public static void play() {
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.play(4);
    }
    public static boolean playRound() {

        boolean win = false;

        int number1 =  (int) (Math.random() * 100);
        int number2 =  (int) (Math.random() * 100);

        int nod = gcd(number1, number2);


        System.out.println("Question: " + number1 + " " + number2);
        var rightAnswer = Integer.toString(nod);

        win = Engine.isAnswerCorrect(rightAnswer);
        return win;
    }

    public static int gcd(int a, int b) {

        while ((a != 0) && (b != 0)) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }

}
