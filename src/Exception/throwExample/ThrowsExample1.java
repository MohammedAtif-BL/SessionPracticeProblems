package Exception.throwExample;

import java.io.IOException;

public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            method();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void method() throws ClassNotFoundException,ArithmeticException {
        Class.forName("Demo");
    }
}
