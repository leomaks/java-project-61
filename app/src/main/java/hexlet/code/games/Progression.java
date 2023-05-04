package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {

    public static void play() {
        System.out.println("What number is missing in the progression?");
        Engine.play(5);
    }
    public static boolean playRound() {

        boolean win = false;

        int startNumber =  (int) (Math.random() * 100);
        int step =  (int) (Math.random() * 20);
        int hiddenMemberCount =  (int) (Math.random() * 9);
        int hiddenNumber = 0;
        System.out.print("Question: ");

        for (int i = 0; i < 10; i++){
            if (i == hiddenMemberCount) {
                System.out.print(".. ");
                hiddenNumber = startNumber + i * step;
            }
            else {
                System.out.print((startNumber + i * step) + " ");
            }
        }

        var rightAnswer = Integer.toString(hiddenNumber);
        win = Engine.isAnswerCorrect(rightAnswer);
        return win;
    }

}