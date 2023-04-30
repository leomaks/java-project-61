package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static void getUserName() {
               // creates an object of Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("May I have your name? ");

        // takes input from the keyboard
        String name = input.nextLine();

        // prints the name
        System.out.println("Hello, " + name + "!");

        // closes the scanner
        input.close();

    }

}
