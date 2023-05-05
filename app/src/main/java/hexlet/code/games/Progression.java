package hexlet.code.games;
import hexlet.code.Engine;
public class Progression {

    public static void play() {
        final int progression = 5;
        System.out.println("What number is missing in the progression?");
        Engine.play(progression);
    }
    public static boolean playRound() {

        boolean win = false;
        final int max = 100;
        final int maxStep = 100;
        final int length = 10;

        int startNumber =  (int) (Math.random() * max);
        int step =  (int) (Math.random() * maxStep);
        int hiddenMemberCount =  (int) (Math.random() * (length-1));
        int hiddenNumber = 0;
        System.out.print("Question: ");

        for (int i = 0; i < length; i++) {
            if (i == hiddenMemberCount) {
                System.out.print(".. ");
                hiddenNumber = startNumber + i * step;
            } else {
                System.out.print((startNumber + i * step) + " ");
            }
        }

        var rightAnswer = Integer.toString(hiddenNumber);
        win = Engine.isAnswerCorrect(rightAnswer);
        return win;
    }
}
