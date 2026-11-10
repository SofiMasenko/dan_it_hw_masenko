package Task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("-----Welcome to the calculator!----");
        System.out.println("To exit the program, type 'exit' at any time (when entering a number or operation).");

        while (true) {
            try {
                System.out.println("Enter the first number (or 'exit' to exit):");
                String input1 = scanner.next();
                if (input1.equalsIgnoreCase("exit")) {
                    break;
                }
                double num1 = parseNumber(input1);
                System.out.println("Enter the operation (+, -, *, /): ");
                String operation = scanner.next();
                if (operation.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.println("Enter the second number: ");
                String input2 = scanner.next();
                if (input2.equalsIgnoreCase("exit")) {
                    break;
                }
                double num2 = parseNumber(input2);

                double result = 0;

                switch (operation) {
                    case "+":
                        result = calculator.add(num1, num2);
                        break;
                    case "-":
                        result = calculator.subtruct(num1, num2);
                        break;
                    case "*":
                        result = calculator.multiply(num1, num2);
                        break;
                    case "/":
                        result = calculator.divide(num1, num2);
                        break;
                    default:
                        System.out.println("Error: Unknown operation! Use +, -, *, /.");
                        continue;
                }
                System.out.println("Result: " + result);
            } catch (InvalidNumericInputException e) {
                System.out.println("Error: You entered a non-numeric value. Please try again.");
            } catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An unknown error occurred.");
            }
        }
        System.out.println("The program is over. Goodbye!");
        scanner.close();
    }

    private static double parseNumber(String str) throws InvalidNumericInputException {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            throw new InvalidNumericInputException("Invalid numeric format");
        }
    }
}