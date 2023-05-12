package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String name;
    public static void getUserName() {

        // creates an object of Scanner
        System.out.println("Welcome to the Brain Games!");
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name? ");

        name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }

}
