package hexlet.code;
import hexlet.code.App;
import java.util.Scanner;



public class Cli {
    public static void getUserName() {

        // creates an object of Scanner
        System.out.println("Welcome to the Brain Games!");
        Scanner input = new Scanner(System.in);

        System.out.print("May I have your name? ");



        // takes input from the keyboard
        Engine.name = input.nextLine();

        // prints the name
        System.out.println("Hello, " + Engine.name + "!");
    }
}
