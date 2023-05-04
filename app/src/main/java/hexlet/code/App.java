package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;



public class App {
    public static String name;

    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        // takes input from the keyboard
        Scanner input = new Scanner(System.in);

        // prints the choice
        System.out.print("Your choice:  ");
        String start = input.nextLine();

        if (!start.equals("0")) {
            Cli.getUserName();
            switch (start) {
                case "2":
                    Even.play();
                    break;
                case "3":
                    Calc.play();
                    break;
                case "4":
                    GCD.play();
                    break;
                case "5":
                    Progression.play();
                    break;
                case "6":
                    Prime.play();
                    break;
                default:
            }
        }
    }
}
