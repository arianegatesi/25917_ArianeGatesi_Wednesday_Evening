import java.io.*;
import java.sql.*;

public class ExceptionHandlingExamples {

    // ArithmeticException Example
    public static void handleArithmeticException() {
        System.out.println("\nExample: ArithmeticException");
        try {
            int divisor = 0;
            if (divisor != 0) {
                int result = 10 / divisor;
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException.");
        }
    }

    // NullPointerException Example
    public static void handleNullPointerException() {
        System.out.println("\nExample: NullPointerException");
        try {
            String str = null;
            if (str != null) {
                str.length();
            } else {
                System.out.println("The string is null.");
            }
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException.");
        }
    }

    // ArrayIndexOutOfBoundsException Example
    public static void handleArrayIndexOutOfBoundsException() {
        System.out.println("\nExample: ArrayIndexOutOfBoundsException");
        try {
            int[] numbers = {4, 5, 6};
            int index = 4;
            if (index >= 0 && index < numbers.length) {
                System.out.println("Value: " + numbers[index]);
            } else {
                System.out.println("Invalid array index.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException.");
        }
    }

    // ClassCastException Example
    public static void handleClassCastException() {
        System.out.println("\nExample: ClassCastException");
        try {
            Object number = 42;
            if (number instanceof String) {
                String str = (String) number;
            } else {
                System.out.println("Invalid type casting attempt.");
            }
        } catch (ClassCastException e) {
            System.out.println("Caught a ClassCastException.");
        }
    }

    // IllegalArgumentException Example
    public static void handleIllegalArgumentException() {
        System.out.println("\nExample: IllegalArgumentException");
        try {
            int age = -5;
            if (age >= 0) {
                System.out.println("Valid age: " + age);
            } else {
                System.out.println("Age cannot be negative.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // NumberFormatException Example
    public static void handleNumberFormatException() {
        System.out.println("\nExample: NumberFormatException");
        try {
            String input = "123#";
            if (input.matches("\\d+")) {
                int number = Integer.parseInt(input);
            } else {
                System.out.println("Invalid number format.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating Exceptions with Validations:");
        handleArithmeticException();
        handleNullPointerException();
        handleArrayIndexOutOfBoundsException();
        handleClassCastException();
        handleIllegalArgumentException();
        handleNumberFormatException();
    }
}
