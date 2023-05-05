package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {

    public static void play() {
        final int gcd = 4;
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.play(gcd);
    }
    public static boolean playRound() {
        final int max = 100;
        boolean win = false;

        int number1 =  (int) (Math.random() * max);
        int number2 =  (int) (Math.random() * max);

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
