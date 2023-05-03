package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;



public class App {
    public static String name;
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");

        System.out.println("0 - Exit");

        // takes input from the keyboard
        Scanner input = new Scanner(System.in);

        // prints the choice
        System.out.print("Your choice:  ");
        String start = input.nextLine();


        if (start.equals("1")) {
            Cli.getUserName();
        }
        if (start.equals("2")) {
            Cli.getUserName();
            Even.play();
        }
        if (start.equals("3")) {
            Cli.getUserName();
            Calc.play();
        }
        if (start.equals("4")) {
            Cli.getUserName();
            GCD.play();
        }
    }
}