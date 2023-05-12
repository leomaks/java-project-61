package hexlet.code;

import hexlet.code.Engine;

public class Utils {
    public static int generateNumber(int rightBorder) {
        return (int) (Math.random() * rightBorder);
    }
}
